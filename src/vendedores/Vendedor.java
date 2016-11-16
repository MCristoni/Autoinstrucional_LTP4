package vendedores;


import java.sql.Date;

public class Vendedor
{
    private int codVendedor;
    private String nomeVendedor;
    private Date dataCadVendedor;

    public Vendedor(int codVendedor, String nomeVendedor, Date dataCadVendedor) 
    {
        this.codVendedor = codVendedor;
        this.nomeVendedor = nomeVendedor;
        this.dataCadVendedor = dataCadVendedor;
    }

    public Vendedor(String nomeVendedor, Date dataCadVendedor) 
    {
        this.nomeVendedor = nomeVendedor;
        this.dataCadVendedor = dataCadVendedor;
    }

    public int getCodVendedor() 
    {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor)
    {
        this.codVendedor = codVendedor;
    }

    public String getNomeVendedor() 
    {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) 
    {
        this.nomeVendedor = nomeVendedor;
    }
    
    public Date getDataCadVendedor() 
    {
        return dataCadVendedor;
    }

    public void setDataCadVendedor(Date dataCadVendedor) 
    {
        this.dataCadVendedor = dataCadVendedor;
    }

    
}
