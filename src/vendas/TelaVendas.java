package vendas;

import principal.TelaPrincipal;
import banco.BancoConexoes;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        gt = new GhostText(campoPesquisaVenda, "Código da venda");
        menuBarVenda.add(btnIncluirVenda);
        menuBarVenda.add(btnExcluirVenda);
        menuBarVenda.add(btnAlterarVenda);
        menuBarVenda.add(btnRelatorioVenda);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluirVenda = new javax.swing.JButton();
        btnExcluirVenda = new javax.swing.JButton();
        btnAlterarVenda = new javax.swing.JButton();
        btnRelatorioVenda = new javax.swing.JButton();
        btnPesquisaVenda = new javax.swing.JButton();
        campoPesquisaVenda = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPesqVenda = new javax.swing.JTable();
        menuBarVenda = new javax.swing.JMenuBar();

        btnIncluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnIncluirVenda.setActionCommand("Incluir");
        btnIncluirVenda.setLabel("  Incluir");
        btnIncluirVenda.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnIncluirVenda.setMaximumSize(new java.awt.Dimension(90, 35));
        btnIncluirVenda.setMinimumSize(new java.awt.Dimension(90, 35));
        btnIncluirVenda.setPreferredSize(new java.awt.Dimension(90, 35));
        btnIncluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVendaActionPerformed(evt);
            }
        });

        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnExcluirVenda.setText("  Excluir");
        btnExcluirVenda.setActionCommand("Excluir");
        btnExcluirVenda.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnExcluirVenda.setMaximumSize(new java.awt.Dimension(90, 35));
        btnExcluirVenda.setMinimumSize(new java.awt.Dimension(90, 35));
        btnExcluirVenda.setPreferredSize(new java.awt.Dimension(90, 35));
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        btnAlterarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnAlterarVenda.setText("  Alterar");
        btnAlterarVenda.setToolTipText("");
        btnAlterarVenda.setActionCommand("Alterar");
        btnAlterarVenda.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnAlterarVenda.setMaximumSize(new java.awt.Dimension(90, 35));
        btnAlterarVenda.setMinimumSize(new java.awt.Dimension(90, 35));
        btnAlterarVenda.setPreferredSize(new java.awt.Dimension(90, 35));
        btnAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendaActionPerformed(evt);
            }
        });

        btnRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/newspaper.png"))); // NOI18N
        btnRelatorioVenda.setText(" Relatório");
        btnRelatorioVenda.setToolTipText("");
        btnRelatorioVenda.setActionCommand("Relatorio");
        btnRelatorioVenda.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnRelatorioVenda.setMaximumSize(new java.awt.Dimension(95, 35));
        btnRelatorioVenda.setMinimumSize(new java.awt.Dimension(95, 35));
        btnRelatorioVenda.setPreferredSize(new java.awt.Dimension(95, 35));
        btnRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioVendaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Vendedores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnPesquisaVenda.setText("Pesquisar");
        btnPesquisaVenda.setMargin(new java.awt.Insets(0, -2, 0, -2));
        btnPesquisaVenda.setMaximumSize(new java.awt.Dimension(104, 29));
        btnPesquisaVenda.setMinimumSize(new java.awt.Dimension(104, 29));
        btnPesquisaVenda.setPreferredSize(new java.awt.Dimension(104, 29));
        btnPesquisaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaVendaActionPerformed(evt);
            }
        });

        campoPesquisaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaVendaActionPerformed(evt);
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

        tabelaPesqVenda.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tabelaPesqVenda.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaPesqVenda.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaPesqVenda.setMinimumSize(new java.awt.Dimension(150, 0));
        tabelaPesqVenda.setRowHeight(20);
        tabelaPesqVenda.setShowHorizontalLines(true);
        tabelaPesqVenda.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tabelaPesqVenda);
        if (tabelaPesqVenda.getColumnModel().getColumnCount() > 0) {
            tabelaPesqVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaPesqVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        menuBarVenda.setName(""); // NOI18N
        setJMenuBar(menuBarVenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(campoPesquisaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(btnPesquisaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnPesquisaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaVendaActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_btnPesquisaVendaActionPerformed

    private void btnIncluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVendaActionPerformed
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
    }//GEN-LAST:event_btnIncluirVendaActionPerformed

    private void campoPesquisaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaVendaActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_campoPesquisaVendaActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
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
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void btnAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendaActionPerformed
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
    }//GEN-LAST:event_btnAlterarVendaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal.mostrandoTelaVendas = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioVendaActionPerformed

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
    private javax.swing.JButton btnAlterarVenda;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnIncluirVenda;
    private javax.swing.JButton btnPesquisaVenda;
    private javax.swing.JButton btnRelatorioVenda;
    private javax.swing.JTextField campoPesquisaVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar menuBarVenda;
    private javax.swing.JTable tabelaPesqVenda;
    // End of variables declaration//GEN-END:variables

    private void efetuarPesquisa() 
    {
        if (campoPesquisaVenda.getText().equalsIgnoreCase("Código da venda") || campoPesquisaVenda.getText().equalsIgnoreCase("")) 
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
        else if (Utilitarios.soNumericos(campoPesquisaVenda.getText().toUpperCase()) == true)
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoVendas.buscarVendasCodResult(Integer.parseInt(campoPesquisaVenda.getText()));
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
