package produtos;

import principal.TelaPrincipal;
import banco.BancoConexoes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.GhostText;
import javax.swing.JOptionPane;
import util.Utilitarios;
import utilitarios.LtpUtil;
import utilitarios.LtpUtilException;

public class TelaProduto extends javax.swing.JFrame 
{
    public TelaProduto() 
    {
        initComponents();
        jPanel1.requestFocusInWindow();
        GhostText gt = new GhostText(campoPesquisaProduto, "Código ou nome do produto");
        menuBarCliente.add(btnIncluirProduto);
        menuBarCliente.add(btnExcluirProduto);
        menuBarCliente.add(btnAlterarProduto);
        menuBarCliente.add(btnRelatorioProduto);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluirProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnRelatorioProduto = new javax.swing.JButton();
        btnPesquisaProduto = new javax.swing.JButton();
        campoPesquisaProduto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesqProdutos = new javax.swing.JTable();
        menuBarCliente = new javax.swing.JMenuBar();

        btnIncluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnIncluirProduto.setActionCommand("Incluir");
        btnIncluirProduto.setLabel("  Incluir");
        btnIncluirProduto.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnIncluirProduto.setMaximumSize(new java.awt.Dimension(90, 35));
        btnIncluirProduto.setMinimumSize(new java.awt.Dimension(90, 35));
        btnIncluirProduto.setPreferredSize(new java.awt.Dimension(90, 35));
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnExcluirProduto.setText("  Excluir");
        btnExcluirProduto.setActionCommand("Excluir");
        btnExcluirProduto.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnExcluirProduto.setMaximumSize(new java.awt.Dimension(90, 35));
        btnExcluirProduto.setMinimumSize(new java.awt.Dimension(90, 35));
        btnExcluirProduto.setPreferredSize(new java.awt.Dimension(90, 35));
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnAlterarProduto.setText("  Alterar");
        btnAlterarProduto.setToolTipText("");
        btnAlterarProduto.setActionCommand("Alterar");
        btnAlterarProduto.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnAlterarProduto.setMaximumSize(new java.awt.Dimension(90, 35));
        btnAlterarProduto.setMinimumSize(new java.awt.Dimension(90, 35));
        btnAlterarProduto.setPreferredSize(new java.awt.Dimension(90, 35));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnRelatorioProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/newspaper.png"))); // NOI18N
        btnRelatorioProduto.setText(" Relatório");
        btnRelatorioProduto.setToolTipText("");
        btnRelatorioProduto.setActionCommand("Relatorio");
        btnRelatorioProduto.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnRelatorioProduto.setMaximumSize(new java.awt.Dimension(95, 35));
        btnRelatorioProduto.setMinimumSize(new java.awt.Dimension(95, 35));
        btnRelatorioProduto.setPreferredSize(new java.awt.Dimension(95, 35));
        btnRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioProdutoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Produtos");
        setPreferredSize(new java.awt.Dimension(907, 452));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnPesquisaProduto.setText("Pesquisar");
        btnPesquisaProduto.setMargin(new java.awt.Insets(0, -2, 0, -2));
        btnPesquisaProduto.setMaximumSize(new java.awt.Dimension(104, 29));
        btnPesquisaProduto.setMinimumSize(new java.awt.Dimension(104, 29));
        btnPesquisaProduto.setPreferredSize(new java.awt.Dimension(104, 29));
        btnPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdutoActionPerformed(evt);
            }
        });

        campoPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jScrollPane2.setPreferredSize(new java.awt.Dimension(456, 406));

        tabelaPesqProdutos.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tabelaPesqProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO PRODUTO", "PRODUTO", "CÓDIGO UNIDADE", "PREÇO", "DATA PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesqProdutos.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaPesqProdutos.setMinimumSize(new java.awt.Dimension(150, 0));
        tabelaPesqProdutos.setRowHeight(20);
        tabelaPesqProdutos.setShowHorizontalLines(true);
        tabelaPesqProdutos.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tabelaPesqProdutos);
        if (tabelaPesqProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaPesqProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaPesqProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        menuBarCliente.setName(""); // NOI18N
        setJMenuBar(menuBarCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(campoPesquisaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdutoActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_btnPesquisaProdutoActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        if (!mostrandoTelaExcluirProdutos && !mostrandoTelaAlterarProdutos && !mostrandoTelaIncluirProdutos) 
        {
            try 
            {
                new TelaProdutoIncluir().setVisible(true);
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaIncluirProdutos = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de produtos já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnIncluirProdutoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de Clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaPrincipal.mostrandoTelaProdutos = false;
    }//GEN-LAST:event_formWindowClosed

    private void campoPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaProdutoActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_campoPesquisaProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if (!mostrandoTelaExcluirProdutos && !mostrandoTelaAlterarProdutos && !mostrandoTelaIncluirProdutos) 
        {
            try 
            {
                new TelaProdutoExcluir().setVisible(true);
            } catch (ParseException ex) 
            {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaExcluirProdutos = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de produtos já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        if (!mostrandoTelaExcluirProdutos && !mostrandoTelaAlterarProdutos && !mostrandoTelaIncluirProdutos) 
        {
            try 
            {
                new TelaProdutoAlterar().setVisible(true);
            } catch (ParseException ex) 
            {
                Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaAlterarProdutos = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de produtos já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioProdutoActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    //Flags
    public static boolean mostrandoTelaIncluirProdutos = false;
    public static boolean mostrandoTelaExcluirProdutos = false;
    public static boolean mostrandoTelaAlterarProdutos = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnPesquisaProduto;
    private javax.swing.JButton btnRelatorioProduto;
    private javax.swing.JTextField campoPesquisaProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menuBarCliente;
    private javax.swing.JTable tabelaPesqProdutos;
    // End of variables declaration//GEN-END:variables

    private void efetuarPesquisa() 
    {
        if (campoPesquisaProduto.getText().equalsIgnoreCase("Código ou nome do produto") || campoPesquisaProduto.getText().equalsIgnoreCase("")) 
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoProduto.buscarProdutosPorNome("");
                LtpUtil.loadFormatJTable(jScrollPane2, resp, true);
                BancoConexoes.fecharConexao();
            } 
            catch (SQLException | LtpUtilException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else if (Utilitarios.soNumericos(campoPesquisaProduto.getText().toUpperCase()) == true)
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoProduto.buscarProdutosCodResult(Integer.parseInt(campoPesquisaProduto.getText()));
                LtpUtil.loadFormatJTable(jScrollPane2, resp, true);
                BancoConexoes.fecharConexao();
            }
            catch (SQLException | LtpUtilException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoProduto.buscarProdutosPorNome(campoPesquisaProduto.getText());
                LtpUtil.loadFormatJTable(jScrollPane2, resp, true);
                BancoConexoes.fecharConexao();
            } 
            catch (SQLException | LtpUtilException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    
}
