package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.firebirdsql.jdbc.FBDriver;


public class BancoConexoes 
{
    public static Connection con;
    public static void abrirConexao() throws SQLException
    {
        String mac = "jdbc:firebirdsql:Matheus:/Users/usuario/Desktop/Auto Instrucional TLP4/Banco/Mac/BDVENDAS.GDB";
        String pc = "jdbc:firebirdsql:DesktopMatheus:E:\\Auto Instrucional TLP4\\banco\\Win\\BDVendas2.GDB";
            DriverManager.registerDriver(new FBDriver());
            con = DriverManager.getConnection(pc, "SYSDBA", "masterkey");
            System.err.println("Conexao aberta");
    }

    public static void fecharConexao() throws SQLException 
    {
            con.close();
            System.err.println("Conexao fechada");
    }
}
