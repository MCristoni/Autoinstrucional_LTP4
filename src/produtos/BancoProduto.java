/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import clientes.*;
import static banco.BancoConexoes.con;
import clientes.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class BancoProduto 
{
    
    public static int pesqCodUltimoProduto() throws SQLException 
    {
        PreparedStatement sql = con.prepareStatement("SELECT CODPRODUTO FROM TABPRODUTOS ORDER BY CODPRODUTO DESC");
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            return resp.getInt("CODPRODUTO");
        }
        return 0;
    }
    
    public static ArrayList<String> recuperarUnidades() throws SQLException 
    {
        ArrayList<String> unidades = new ArrayList<>();
        
        PreparedStatement sql = con.prepareStatement("select UNIDADE from UNIDADES");
        ResultSet resp = sql.executeQuery();
        while (resp.next()) 
        {
            if (unidades.isEmpty()) 
            {
                unidades.add("Selecione");
            }
            unidades.add(resp.getString("UNIDADE"));
        }
        return unidades;
    }
    
    public static void adicionarProduto(Produto produto) throws SQLException
    {
        PreparedStatement sql =
                con.prepareStatement(""
                        + "INSERT INTO TABPRODUTOS "
                        + "(PRODUTO,CODUNIDADE,PRECO,DATAPRECO)"
                        + "VALUES (?,?,?,?)");
        sql.setString(1, produto.getProduto());
        sql.setInt(2, produto.getCodUnidade());
        sql.setDouble(3, produto.getPreco());
        sql.setDate(4, produto.getDataPreco());
        sql.executeUpdate();
    }
    
    public static ResultSet buscarProdutosPorNome (String produto) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select CODPRODUTO, PRODUTO, UNIDADES.UNIDADE, PRECO, DATAPRECO from TABPRODUTOS inner join UNIDADES on UNIDADES.CODUNIDADE = TABPRODUTOS.CODUNIDADE where PRODUTO like ? order by PRODUTO ASC");
        pstm.setString( 1, "%" + produto.toUpperCase() + "%" );
        return pstm.executeQuery();
    }
    
    //Pesquisa
    public static ResultSet buscarProdutosCodResult (int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select CODPRODUTO \"COD PRODUTO\", PRODUTO, UNIDADES.UNIDADE \"TIPO\", PRECO, DATAPRECO \"DATA PREÇO\" from TABPRODUTOS inner join UNIDADES on UNIDADES.CODUNIDADE = TABPRODUTOS.CODUNIDADE where CODPRODUTO = ?");
        pstm.setInt(1, cod);
        return pstm.executeQuery();
    }
    
    //Alterar e Excluir
    public static Produto buscarProdutosCodProduto (int cod) throws SQLException
    {
        PreparedStatement sql = con.prepareStatement("Select * from TABPRODUTOS where CODPRODUTO = ?");
        sql.setInt(1, cod);
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            Produto retorno;
            return  retorno = (new Produto(
                    resp.getInt("CODPRODUTO"), resp.getString("PRODUTO"), resp.getInt("CODUNIDADE"), resp.getDouble("PRECO"), resp.getDate("DATAPRECO")));
        }
        return null;
    }
    
    public static String excluirProduto (int cod)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("DELETE from TABPRODUTOS where CODPRODUTO like ?");
            pstm.setInt(1, cod);
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }

    public static String alterarProduto(Produto produto)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("UPDATE TABPRODUTOS SET PRODUTO = ?, CODUNIDADE = ?, PRECO = ? WHERE CODPRODUTO = ?");
            pstm.setString(1, produto.getProduto());
            pstm.setInt(2, produto.getCodUnidade());
            pstm.setDouble(3, produto.getPreco());
            pstm.setInt(4, produto.getCodProduto());
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }
    
}
