package principal;

import clientes.TelaCliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import produtos.TelaProduto;
import vendedores.TelaVendedor;

public class TelaPrincipal extends javax.swing.JFrame 
{
    public TelaPrincipal() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnClientes = new javax.swing.JButton();
        BtnProdutos = new javax.swing.JButton();
        BtnVendas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVendedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        BtnClientes.setText("Menu Clientes");
        BtnClientes.setMargin(new java.awt.Insets(5, 5, 5, 5));
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnProdutos.setText("Menu Produtos");
        BtnProdutos.setMargin(new java.awt.Insets(5, 5, 5, 5));
        BtnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdutosActionPerformed(evt);
            }
        });

        BtnVendas.setText("Menu Vendas");
        BtnVendas.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coin-money-6 2.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setRequestFocusEnabled(false);

        jLabel2.setText("Por: Matheus Cristoni");

        btnVendedores.setText("Menu Vendedores");
        btnVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        if (!mostrandoTelaClientes && !mostrandoTelaProdutos && !mostrandoTelaVendas && !mostrandoTelaVendedores) 
        {
            new TelaCliente().setVisible(true);
            mostrandoTelaClientes = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu principal já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdutosActionPerformed
        if (!mostrandoTelaClientes && !mostrandoTelaProdutos && !mostrandoTelaVendas && !mostrandoTelaVendedores) 
        {
            new TelaProduto().setVisible(true);
            mostrandoTelaProdutos = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu principal já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_BtnProdutosActionPerformed

    private void btnVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedoresActionPerformed
        if (!mostrandoTelaClientes && !mostrandoTelaProdutos && !mostrandoTelaVendas && !mostrandoTelaVendedores) 
        {
            new TelaVendedor().setVisible(true);
            mostrandoTelaVendedores = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu principal já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnVendedoresActionPerformed

    public static void main(String args[]) 
    {
        try 
        {
            UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    //Flags
    public static boolean mostrandoTelaClientes = false;
    public static boolean mostrandoTelaProdutos = false;
    public static boolean mostrandoTelaVendas = false;
    public static boolean mostrandoTelaVendedores = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnProdutos;
    private javax.swing.JButton BtnVendas;
    private javax.swing.JButton btnVendedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
