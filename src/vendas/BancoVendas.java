
package vendas;

import static banco.BancoConexoes.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BancoVendas 
{
    public static boolean verificarExistenciaVendasClientes(int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("select codcliente from vendas where codcliente = ?");
        pstm.setInt(1, cod);
        ResultSet resp = pstm.executeQuery();
        return resp.next();
    }
    
    public static boolean verificarExistenciaVendasVendedores(int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("select cod_vendedor from vendas where cod_vendedor = ?");
        pstm.setInt(1, cod);
        ResultSet resp = pstm.executeQuery();
        return resp.next();
    }
    
    public static ResultSet buscarTodasVendas () throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("select CODVENDA, NOME_VENDEDOR \"VENDEDOR\", NOME \"CLIENTE\", DATA_VENDA \"DATA VENDA\"  from vendas inner join vendedores on VENDEDORES.COD_VENDEDOR = vendas.COD_VENDEDOR inner join CLIENTES on clientes.CODCLIENTE = vendas.CODCLIENTE");
        return pstm.executeQuery();
    }
    
    public static ResultSet buscarVendasCodResult (int cod) throws SQLException 
    {
        PreparedStatement pstm = con.prepareStatement("select CODVENDA, NOME_VENDEDOR \"VENDEDOR\", NOME \"CLIENTE\", DATA_VENDA \"DATA VENDA\"  from vendas inner join vendedores on VENDEDORES.COD_VENDEDOR = vendas.COD_VENDEDOR inner join CLIENTES on clientes.CODCLIENTE = vendas.CODCLIENTE where CODVENDA = ?");
        pstm.setInt(1, cod);
        return pstm.executeQuery();
    }
}
