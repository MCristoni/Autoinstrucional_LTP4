package produtos;


import java.sql.Date;

public class Produto
{
    private int codProduto;
    private String produto;
    private int codUnidade;
    private double preco;
    private Date dataPreco;

    public Produto(int codProduto, String produto, int codUnidade, double preco, Date dataPreco) 
    {
        this.codProduto = codProduto;
        this.produto = produto;
        this.codUnidade = codUnidade;
        this.preco = preco;
        this.dataPreco = dataPreco;
    }

    public Produto(String produto, int codUnidade, double preco, Date dataPreco) 
    {
        this.produto = produto;
        this.codUnidade = codUnidade;
        this.preco = preco;
        this.dataPreco = dataPreco;
    }

    public int getCodProduto() 
    {
        return codProduto;
    }

    public void setCodProduto(int codProduto)
    {
        this.codProduto = codProduto;
    }

    public String getProduto() 
    {
        return produto;
    }

    public void setProduto(String produto) 
    {
        this.produto = produto;
    }

    public int getCodUnidade() 
    {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) 
    {
        this.codUnidade = codUnidade;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public Date getDataPreco() 
    {
        return dataPreco;
    }

    public void setDataPreco(Date dataPreco) 
    {
        this.dataPreco = dataPreco;
    }

    
}
