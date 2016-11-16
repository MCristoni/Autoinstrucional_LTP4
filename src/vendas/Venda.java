package vendas;

import java.sql.Date;


public class Venda 
{
    private int codVenda;
    private int codVendedor;
    private int codCliente;
    private Date dataVenda;

    public Venda(int codVenda, int codVendedor, int codCliente, Date dataVenda) 
    {
        this.codVenda = codVenda;
        this.codVendedor = codVendedor;
        this.codCliente = codCliente;
        this.dataVenda = dataVenda;
    }
    
    public Venda(int codVendedor, int codCliente, Date dataVenda) 
    {
        this.codVendedor = codVendedor;
        this.codCliente = codCliente;
        this.dataVenda = dataVenda;
    }
    
    public int getCodVenda() 
    {
        return codVenda;
    }

    public void setCodVenda(int codVenda)
    {
        this.codVenda = codVenda;
    }

    public int getCodVendedor() 
    {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor)
    {
        this.codVendedor = codVendedor;
    }

    public int getCodCliente() 
    {
        return codCliente;
    }

    public void setCodCliente(int codCliente)
    {
        this.codCliente = codCliente;
    }

    public Date getDataVenda()
    {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) 
    {
        this.dataVenda = dataVenda;
    }
}
