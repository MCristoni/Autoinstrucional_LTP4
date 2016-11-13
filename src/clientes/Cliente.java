package clientes;


import java.sql.Date;

public class Cliente
{
    private int cod;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String email;
    private Date data;

    public Cliente(String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, Date data) 
    {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
    }
    
    public Cliente(int cod, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, Date data) 
    {
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
    }

    public int getCod() 
    {
        return cod;
    }

    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public String getUf() 
    {
        return uf;
    }

    public void setUf(String uf) 
    {
        this.uf = uf;
    }

    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public Date getData() 
    {
        return data;
    }

    public void setData(Date data) 
    {
        this.data = data;
    }
    
}
