/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import banco.BancoConexoes;
import clientes.BancoCliente;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import produtos.BancoProduto;
import utilitarios.LtpUtil;

/**
 *
 * @author Matheus
 */
public class Utilitarios 
{
    public static String tirarFormatacaoTelefone(JTextField campoTelefone)
    {
        String telefone;
        if (campoTelefone.getText().equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional"))
        {
            telefone = "";
        }
        else
        {
            telefone = campoTelefone.getText();
            telefone = telefone.replace("(", "");
            telefone = telefone.replace(")", "");
            telefone = telefone.replace("-", "");
            telefone = telefone.replace(" ", "");
        }
        return telefone;
    }
    
    public static String tirarFormatacaoEmail(JTextField campoEmail)
    {
        String email = "";
        if (!campoEmail.getText().equalsIgnoreCase("Opcional"))
        {
            email = campoEmail.getText().toUpperCase();
        }
        else
        {
            email = "";
        }
        return email;
    }
    
    public static String tirarFormatacaoCep(JTextField campoCep)
    {
        String cep;
        cep = campoCep.getText();
        cep = cep.replace(".", "");
        cep = cep.replace("-", "");
        return cep;
    }
    
    
    
    public static String formatarCEP(String cep)
    {
        if (cep.equals("")) 
        {
            return "";
        }
        else
        {
            return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        }
    }
    
    public static String formatarTelefone(String telefone)
    {
        if (telefone.equals("")) 
        {
            return "";
        }
        else
        {
            return "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, 6) + "-" + telefone.substring(6);
        }
    }
    
    public static boolean soNumericos(String validacao)
    {
        if (validacao.equals("")) 
        {
            return false;
        }
        for (int i = 0; i < validacao.length(); i++)
        {
            if((validacao.charAt(i) < 48 || validacao.charAt(i) > 57) && validacao.charAt(i) != '.')
            {
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<String> inicializarComboBoxEstados() 
    {
        ArrayList<String> uf = new ArrayList<>();
        
        try 
        {
            BancoConexoes.abrirConexao();
            uf = BancoCliente.recuperarEstados();
            BancoConexoes.fecharConexao();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return uf;
    }
    
    public static ArrayList<String> inicializarComboBoxUnidades() 
    {
        ArrayList<String> tipos = new ArrayList<>();
        
        try 
        {
            BancoConexoes.abrirConexao();
            tipos = BancoProduto.recuperarUnidades();
            BancoConexoes.fecharConexao();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return tipos;
    }
    
    public static Date descobrirDataDate()
    {
        return (new Date(Calendar.getInstance().getTimeInMillis()));
    }
    
    public static String descobrirDataString() 
    {
        Date data = descobrirDataDate();
        return LtpUtil.formatarData(data, "dd/MM/yyyy");
    }
    
    public static String validarEntradas(JTextField campoNome, JTextField campoEndereco, JTextField campoBairro, JTextField campoCidade, JComboBox<String> campoUf,
                                 JFormattedTextField campoCep, JFormattedTextField campoTelefone, JTextField campoEmail)
    {
        String resp = "";
        
        //Valida Nome
        if(campoNome.getText().equals("Campo obrigatório") || campoNome.getText().length() > 40 || campoNome.getText().trim().equals(""))
        {            
            resp += "Nome\n";
        }
        
        //Valida endereço
        if (campoEndereco.getText().equalsIgnoreCase("Campo obrigatório") || campoEndereco.getText().length() > 40 || campoEndereco.getText().trim().equals(""))
        {
            resp += "Endereço\n";
        }
        
        //Valida bairro
        if (campoBairro.getText().equalsIgnoreCase("Campo obrigatório") || campoBairro.getText().length() > 20 || campoBairro.getText().trim().equals(""))
        {
            resp += "Bairro\n";
        }
        
        //Valida cidade
        if (campoCidade.getText().equalsIgnoreCase("Campo obrigatório") || campoCidade.getText().length() > 20 || campoCidade.getText().trim().equals(""))
        {
            resp += "Cidade\n";
        }
        
        //Valida UF
        if(campoUf.getSelectedItem().equals("Selecione"))
        {
            resp += "UF\n";
        }
        
        
        //Valida CEP
        if (!campoCep.getText().equalsIgnoreCase("Apenas números") && !campoCep.getText().trim().matches("[0-9]{2}[.][0-9]{3}[-][0-9]{3}") && ((campoCep.getText().length() != 8) && (!soNumericos(campoCep.getText())))) 
        {
            resp += "CEP\n";
        }
        
        
        //Valida telefone
        if (!campoTelefone.getText().equalsIgnoreCase("Apenas números (DDD + 8 dígitos) - Opcional") && !campoTelefone.getText().equalsIgnoreCase(""))
        {
            if (campoTelefone.getText().length() != 14) 
            {
                resp += "Telefone\n";
            }
            else
            {
                for (int i = 0; i < campoTelefone.getText().length(); i++)
                {
                    if ((campoTelefone.getText().charAt(i) < 48 || campoTelefone.getText().charAt(i) > 57) &&
                       campoTelefone.getText().charAt(i) != '(' && campoTelefone.getText().charAt(i) != ')' && 
                       campoTelefone.getText().charAt(i) != ' ' && campoTelefone.getText().charAt(i) != '-')
                    {
                        
                        System.err.println(campoTelefone.getText().charAt(i));
                        resp += "Telefone\n";
                        break;
                    }
                }
            }
        }
        
        //Validar email
        if (!campoEmail.getText().equalsIgnoreCase("Opcional") && !campoEmail.getText().equalsIgnoreCase("")) 
        {
            if (!LtpUtil.validarEmail(campoEmail.getText().trim()) || campoEmail.getText().length() > 60) 
            {
                resp += "E-mail";
            }
        }
        return resp;
    }
    
    public static int buscarIndexUF(String ufPesq, ArrayList<String> uf) 
    {
        for (int i = 0; i < uf.size(); i++) 
        {
            if (uf.get(i).equalsIgnoreCase(ufPesq)) 
            {
                return i;
            }
        }
        return 0;
    }

    public static String validarEntradas(JTextField campoNome, JComboBox<String> campoTipo, JTextField campoPreco)
    {
        String resp = "";
        
        //Valida nome produto
        if(campoNome.getText().equals("Campo obrigatório") || campoNome.getText().length() > 50 || campoNome.getText().trim().equals(""))
        {            
            resp += "Nome\n";
        }
        
        //Valida tipo
        if(campoTipo.getSelectedItem().equals("Selecione"))
        {
            resp += "Tipo\n";
        }
        
        //Valida preco
        if (campoPreco.getText().trim().equals("") || !soNumericos(campoPreco.getText())) 
        {
            resp += "Preço";
        }
        
        return resp;
    }
}