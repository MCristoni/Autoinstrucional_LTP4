package banco;

import dados.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.firebirdsql.jdbc.FBDriver;


public class Banco 
{
    public static Connection con;

    public static void abrirConexao() throws SQLException
    {
            DriverManager.registerDriver(new FBDriver());
            con = DriverManager.getConnection("jdbc:firebirdsql:DesktopMatheus:E:\\Auto Instrucional TLP4\\banco\\Win\\BDVendas.GDB",
                            "SYSDBA", "masterkey");
            System.err.println("Conexao aberta");
    }

    public static void fecharConexao() throws SQLException 
    {
            con.close();
            System.err.println("Conexao fechada");
    }

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
}
