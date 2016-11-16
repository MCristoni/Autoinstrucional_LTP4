package vendas;

import vendedores.*;
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

public class TelaVendas extends javax.swing.JFrame 
{
    private final GhostText gt;
    public TelaVendas() 
    {
        initComponents();
        jPanel1.requestFocusInWindow();
        gt = new GhostText(campoPesquisaVendedor, "Código da venda");
        menuBarVendedor.add(btnIncluirVendedor);
        menuBarVendedor.add(btnExcluirVendedor);
        menuBarVendedor.add(btnAlterarVendedor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluirVendedor = new javax.swing.JButton();
        btnExcluirVendedor = new javax.swing.JButton();
        btnAlterarVendedor = new javax.swing.JButton();
        btnPesquisaVendedor = new javax.swing.JButton();
        campoPesquisaVendedor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesqVendedor = new javax.swing.JTable();
        menuBarVendedor = new javax.swing.JMenuBar();

        btnIncluirVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnIncluirVendedor.setActionCommand("Incluir");
        btnIncluirVendedor.setLabel("  Incluir");
        btnIncluirVendedor.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnIncluirVendedor.setMaximumSize(new java.awt.Dimension(90, 35));
        btnIncluirVendedor.setMinimumSize(new java.awt.Dimension(90, 35));
        btnIncluirVendedor.setPreferredSize(new java.awt.Dimension(90, 35));
        btnIncluirVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVendedorActionPerformed(evt);
            }
        });

        btnExcluirVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnExcluirVendedor.setText("  Excluir");
        btnExcluirVendedor.setActionCommand("Excluir");
        btnExcluirVendedor.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnExcluirVendedor.setMaximumSize(new java.awt.Dimension(90, 35));
        btnExcluirVendedor.setMinimumSize(new java.awt.Dimension(90, 35));
        btnExcluirVendedor.setPreferredSize(new java.awt.Dimension(90, 35));
        btnExcluirVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendedorActionPerformed(evt);
            }
        });

        btnAlterarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnAlterarVendedor.setText("  Alterar");
        btnAlterarVendedor.setToolTipText("");
        btnAlterarVendedor.setActionCommand("Alterar");
        btnAlterarVendedor.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnAlterarVendedor.setMaximumSize(new java.awt.Dimension(90, 35));
        btnAlterarVendedor.setMinimumSize(new java.awt.Dimension(90, 35));
        btnAlterarVendedor.setPreferredSize(new java.awt.Dimension(90, 35));
        btnAlterarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendedorActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Vendedores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnPesquisaVendedor.setText("Pesquisar");
        btnPesquisaVendedor.setMargin(new java.awt.Insets(0, -2, 0, -2));
        btnPesquisaVendedor.setMaximumSize(new java.awt.Dimension(104, 29));
        btnPesquisaVendedor.setMinimumSize(new java.awt.Dimension(104, 29));
        btnPesquisaVendedor.setPreferredSize(new java.awt.Dimension(104, 29));
        btnPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaVendedorActionPerformed(evt);
            }
        });

        campoPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaVendedorActionPerformed(evt);
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

        tabelaPesqVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tabelaPesqVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO VENDAS", "VENDEDOR", "CLIENTE", "DATA VENDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesqVendedor.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaPesqVendedor.setMinimumSize(new java.awt.Dimension(150, 0));
        tabelaPesqVendedor.setRowHeight(20);
        tabelaPesqVendedor.setShowHorizontalLines(true);
        tabelaPesqVendedor.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tabelaPesqVendedor);
        if (tabelaPesqVendedor.getColumnModel().getColumnCount() > 0) {
            tabelaPesqVendedor.getColumnModel().getColumn(0).setResizable(false);
            tabelaPesqVendedor.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        menuBarVendedor.setName(""); // NOI18N
        setJMenuBar(menuBarVendedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(campoPesquisaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(btnPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaVendedorActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_btnPesquisaVendedorActionPerformed

    private void btnIncluirVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVendedorActionPerformed
//        if (!mostrandoTelaExcluirVendedor && !mostrandoTelaAlterarVendedor && !mostrandoTelaIncluirVendedor) 
//        {
//            try 
//            {
//                new TelaVendedorIncluir().setVisible(true);
//            } 
//            catch (ParseException ex) 
//            {
//                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            mostrandoTelaIncluirVendedor = true;
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(this, "Uma tela do menu de vendas já está aberta. \nFeche-a para abrir outra!");
//        }
    }//GEN-LAST:event_btnIncluirVendedorActionPerformed

    private void campoPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaVendedorActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_campoPesquisaVendedorActionPerformed

    private void btnExcluirVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendedorActionPerformed
//        if (!mostrandoTelaExcluirVendedor && !mostrandoTelaAlterarVendedor && !mostrandoTelaIncluirVendedor) 
//        {
//            try 
//            {
//                new TelaVendedorExcluir().setVisible(true);
//            } catch (ParseException ex) 
//            {
//                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            mostrandoTelaExcluirVendedor = true;
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(this, "Uma tela do menu de vendas já está aberta. \nFeche-a para abrir outra!");
//        }
    }//GEN-LAST:event_btnExcluirVendedorActionPerformed

    private void btnAlterarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendedorActionPerformed
//        if (!mostrandoTelaExcluirVendedor && !mostrandoTelaAlterarVendedor && !mostrandoTelaIncluirVendedor) 
//        {
//            try 
//            {
//                new TelaVendedorAlterar().setVisible(true);
//            } catch (ParseException ex) 
//            {
//                Logger.getLogger(TelaVendas.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            mostrandoTelaAlterarVendedor = true;
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(this, "Uma tela do menu de vendas já está aberta. \nFeche-a para abrir outra!");
//        }
    }//GEN-LAST:event_btnAlterarVendedorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal.mostrandoTelaVendas = false;
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaVendas().setVisible(true);
        });
    }

    //Flags
    public static boolean mostrandoTelaIncluirVendedor = false;
    public static boolean mostrandoTelaExcluirVendedor = false;
    public static boolean mostrandoTelaAlterarVendedor = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVendedor;
    private javax.swing.JButton btnExcluirVendedor;
    private javax.swing.JButton btnIncluirVendedor;
    private javax.swing.JButton btnPesquisaVendedor;
    private javax.swing.JTextField campoPesquisaVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menuBarVendedor;
    private javax.swing.JTable tabelaPesqVendedor;
    // End of variables declaration//GEN-END:variables

    private void efetuarPesquisa() 
    {
        if (campoPesquisaVendedor.getText().equalsIgnoreCase("Código da venda") || campoPesquisaVendedor.getText().equalsIgnoreCase("")) 
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoVendas.buscarTodasVendas();
                LtpUtil.loadFormatJTable(jScrollPane2, resp, true);
                BancoConexoes.fecharConexao();
            } 
            catch (SQLException | LtpUtilException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else if (Utilitarios.soNumericos(campoPesquisaVendedor.getText().toUpperCase()) == true)
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoVendas.buscarVendasCodResult(Integer.parseInt(campoPesquisaVendedor.getText()));
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
            JOptionPane.showMessageDialog(this, "Entrada inválida");
        }
    }

    
}
