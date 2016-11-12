/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import static banco.BancoConexoes.con;
import dados.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class BancoCliente 
{
    
    public static int pesqCodUltimoCliente() throws SQLException 
    {
        PreparedStatement sql = con.prepareStatement("SELECT CODCLIENTE FROM CLIENTES ORDER BY CODCLIENTE DESC");
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            return resp.getInt("CODCLIENTE");
        }
        return 0;
    }
    
    public static ArrayList<String> recuperarEstados() throws SQLException 
    {
        ArrayList<String> uf = new ArrayList<>();
        
        PreparedStatement sql = con.prepareStatement("SELECT UF FROM ESTADOS");
        ResultSet resp = sql.executeQuery();
        while (resp.next()) 
        {
            if (uf.isEmpty()) 
            {
                uf.add("Selecione");
            }
            uf.add(resp.getString("UF"));
        }
        return uf;
    }
    
    public static void adicionarCliente(Cliente cliente) throws SQLException
    {
        PreparedStatement sql =
                con.prepareStatement(""
                        + "INSERT INTO CLIENTES "
                        + "(NOME,ENDERECO,BAIRRO,CIDADE,UF,CEP,TELEFONE,E_MAIL,DATA_CAD_CLIENTE)"
                        + "VALUES (?,?,?,?,?,?,?,?,?)");
        sql.setString(1, cliente.getNome());
        sql.setString(2, cliente.getEndereco());
        sql.setString(3, cliente.getBairro());
        sql.setString(4, cliente.getCidade());
        sql.setString(5, cliente.getUf());
        sql.setString(6, cliente.getCep());
        sql.setString(7, cliente.getTelefone());
        sql.setString(8, cliente.getEmail());
        sql.setDate(9, cliente.getData());
        sql.executeUpdate();
    }
    
    public static ResultSet buscarClientesPorNome (String cliente) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select * from CLIENTES where NOME like ? order by NOME ASC");
        pstm.setString( 1, "%" + cliente.toUpperCase() + "%" );
        return pstm.executeQuery();
    }
    
    public static ResultSet buscarClientesPorCod (int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select * from CLIENTES where CODCLIENTE like ?");
        pstm.setInt(1, cod);
        return pstm.executeQuery();
    }
    
    public static Cliente buscarClientesCod (int cod) throws SQLException
    {
        PreparedStatement sql = con.prepareStatement("Select * from CLIENTES where CODCLIENTE like ?");
        sql.setInt(1, cod);
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            Cliente retorno;
            return  retorno = (new Cliente(
                    resp.getInt("CODCLIENTE"), resp.getString("NOME"), resp.getString("ENDERECO"), resp.getString("BAIRRO"), resp.getString("CIDADE"), 
                    resp.getString("UF"), resp.getString("CEP"), resp.getString("TELEFONE"), resp.getString("E_MAIL"), resp.getDate("DATA_CAD_CLIENTE")));
        }
        return null;
    }
    
    public static String excluirCliente (int cod)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("DELETE from CLIENTES where CODCLIENTE like ?");
            pstm.setInt(1, cod);
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }

    public static String alterarCliente(Cliente cliente)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("UPDATE CLIENTES SET NOME = ?, ENDERECO = ?, BAIRRO = ?, CIDADE = ?, UF = ?, CEP = ?, TELEFONE = ?, E_MAIL = ? WHERE CODCLIENTE = ?");
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getEndereco());
            pstm.setString(3, cliente.getBairro());
            pstm.setString(4, cliente.getCidade());
            pstm.setString(5, cliente.getUf());
            pstm.setString(6, cliente.getCep());
            pstm.setString(7, cliente.getTelefone());
            pstm.setString(8, cliente.getEmail());
            pstm.setInt(9, cliente.getCod());
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }
    
}
