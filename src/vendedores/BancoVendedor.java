/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;

import static banco.BancoConexoes.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class BancoVendedor 
{
    
    public static int pesqCodUltimoVendedor() throws SQLException 
    {
        PreparedStatement sql = con.prepareStatement("SELECT COD_VENDEDOR FROM VENDEDORES ORDER BY COD_VENDEDOR DESC");
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            return resp.getInt("COD_VENDEDOR");
        }
        return 0;
    }
    
    public static void adicionarVendedor(Vendedor vendedor) throws SQLException
    {
        PreparedStatement sql =
                con.prepareStatement(""
                        + "INSERT INTO VENDEDORES "
                        + "(NOME_VENDEDOR, DATA_CAD_VENDEDOR)"
                        + "VALUES (?,?)");
        sql.setString(1, vendedor.getNomeVendedor());
        sql.setDate(2, vendedor.getDataCadVendedor());
        sql.executeUpdate();
    }
    
    public static ResultSet buscarVendedoresPorNome (String vendedor) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select COD_VENDEDOR \"CODIGO\", NOME_VENDEDOR \"NOME\", DATA_CAD_VENDEDOR \"DATA CADASTRO\" from VENDEDORES where NOME_VENDEDOR like ? order by NOME_VENDEDOR ASC");
        pstm.setString( 1, "%" + vendedor.toUpperCase() + "%" );
        return pstm.executeQuery();
    }
    
    //Pesquisa
    public static ResultSet buscarVendedoresCodResult (int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("Select COD_VENDEDOR \"CODIGO\", NOME_VENDEDOR \"NOME\", DATA_CAD_VENDEDOR \"DATA CADASTRO\" from VENDEDORES where COD_VENDEDOR like ?");
        pstm.setInt(1, cod);
        return pstm.executeQuery();
    }
    
    //Alterar e Excluir
    public static Vendedor buscarVendedoresCodVendedor (int cod) throws SQLException
    {
        PreparedStatement sql = con.prepareStatement("Select COD_VENDEDOR \"CODIGO\", NOME_VENDEDOR \"NOME\", DATA_CAD_VENDEDOR \"DATA CADASTRO\" from VENDEDORES where COD_VENDEDOR like ?");
        sql.setInt(1, cod);
        ResultSet resp = sql.executeQuery();
        if (resp.next()) 
        {
            Vendedor retorno;
            return  retorno = (new Vendedor(
                    resp.getInt("COD_VENDEDOR"), resp.getString("NOME_VENDEDOR"), resp.getDate("DATA_CAD_VENDEDOR")));
        }
        return null;
    }
    
    public static String excluirVendedor (int cod)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("DELETE from VENDEDORES where COD_VENDEDOR like ?");
            pstm.setInt(1, cod);
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }

    public static String alterarVendedor(Vendedor vendedor)
    {
        try
        {
            PreparedStatement pstm = con.prepareStatement("UPDATE VENDEDORES SET NOME_VENDEDOR = ? WHERE cod_vendedor = ?");
            pstm.setString(1, vendedor.getNomeVendedor());
            pstm.setInt(2, vendedor.getCodVendedor());
            pstm.executeUpdate();
            return "";
        }
        catch (SQLException ex)
        {
            return ex.getMessage();
        }
    }
}
