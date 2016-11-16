
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
}
