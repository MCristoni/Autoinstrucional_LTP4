/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

//import Utilitarios.HintTextFieldUI;
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

/**
 *
 * @author usuario
 */
public class TelaCliente extends javax.swing.JFrame 
{

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() 
    {
        initComponents();
        //jButton1.requestFocus();
        //campoPesquisaCliente.setFocusable(true);
        //new HintJTextField(campoPesquisaCliente, "Código ou nome do cliente");
        jPanel1.requestFocusInWindow();
        GhostText gt = new GhostText(campoPesquisaCliente, "Código ou nome do cliente");
        menuBarCliente.add(btnIncluirCliente);
        menuBarCliente.add(btnExcluirCliente);
        menuBarCliente.add(btnAlterarCliente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluirCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnPesquisaCliente = new javax.swing.JButton();
        campoPesquisaCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesq = new javax.swing.JTable();
        menuBarCliente = new javax.swing.JMenuBar();

        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnIncluirCliente.setActionCommand("Incluir");
        btnIncluirCliente.setLabel("  Incluir");
        btnIncluirCliente.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnIncluirCliente.setMaximumSize(new java.awt.Dimension(90, 35));
        btnIncluirCliente.setMinimumSize(new java.awt.Dimension(90, 35));
        btnIncluirCliente.setPreferredSize(new java.awt.Dimension(90, 35));
        btnIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/substract.png"))); // NOI18N
        btnExcluirCliente.setText("  Excluir");
        btnExcluirCliente.setActionCommand("Excluir");
        btnExcluirCliente.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnExcluirCliente.setMaximumSize(new java.awt.Dimension(90, 35));
        btnExcluirCliente.setMinimumSize(new java.awt.Dimension(90, 35));
        btnExcluirCliente.setPreferredSize(new java.awt.Dimension(90, 35));
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shuffle.png"))); // NOI18N
        btnAlterarCliente.setText("  Alterar");
        btnAlterarCliente.setToolTipText("");
        btnAlterarCliente.setActionCommand("Alterar");
        btnAlterarCliente.setMargin(new java.awt.Insets(0, -10, 0, -5));
        btnAlterarCliente.setMaximumSize(new java.awt.Dimension(90, 35));
        btnAlterarCliente.setMinimumSize(new java.awt.Dimension(90, 35));
        btnAlterarCliente.setPreferredSize(new java.awt.Dimension(90, 35));
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnPesquisaCliente.setText("Pesquisar");
        btnPesquisaCliente.setMargin(new java.awt.Insets(0, -2, 0, -2));
        btnPesquisaCliente.setMaximumSize(new java.awt.Dimension(104, 29));
        btnPesquisaCliente.setMinimumSize(new java.awt.Dimension(104, 29));
        btnPesquisaCliente.setPreferredSize(new java.awt.Dimension(104, 29));
        btnPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaClienteActionPerformed(evt);
            }
        });

        campoPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaClienteActionPerformed(evt);
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

        jTablePesq.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        jTablePesq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "ENDEREÇO", "BAIRRO", "CIDADE", "UF", "CEP", "TELEFONE", "EMAIL", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePesq.setGridColor(new java.awt.Color(0, 0, 0));
        jTablePesq.setRowHeight(20);
        jTablePesq.setShowHorizontalLines(true);
        jTablePesq.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTablePesq);
        if (jTablePesq.getColumnModel().getColumnCount() > 0) {
            jTablePesq.getColumnModel().getColumn(0).setResizable(false);
            jTablePesq.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTablePesq.getColumnModel().getColumn(5).setResizable(false);
            jTablePesq.getColumnModel().getColumn(5).setPreferredWidth(30);
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
                        .addComponent(campoPesquisaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaClienteActionPerformed
        efetuarPesquisa();
    }//GEN-LAST:event_btnPesquisaClienteActionPerformed

    private void btnIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClienteActionPerformed
        if (!mostrandoTelaExcluirCliente && !mostrandoTelaAlterarCliente && !mostrandoTelaIncluirCliente) 
        {
            try 
            {
                new TelaClienteIncluir().setVisible(true);
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaIncluirCliente = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de clientes já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnIncluirClienteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de Clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaPrincipal.mostrandoTelaClientes = false;
    }//GEN-LAST:event_formWindowClosed

    private void campoPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaClienteActionPerformed
        efetuarPesquisa();
        
    }//GEN-LAST:event_campoPesquisaClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        if (!mostrandoTelaExcluirCliente && !mostrandoTelaAlterarCliente && !mostrandoTelaIncluirCliente) 
        {
            try 
            {
                new TelaClienteExcluir().setVisible(true);
            } catch (ParseException ex) 
            {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaExcluirCliente = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de clientes já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        if (!mostrandoTelaExcluirCliente && !mostrandoTelaAlterarCliente && !mostrandoTelaIncluirCliente) 
        {
            try 
            {
                new TelaClienteAlterar().setVisible(true);
            } catch (ParseException ex) 
            {
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrandoTelaAlterarCliente = true;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Uma tela do menu de clientes já está aberta. \nFeche-a para abrir outra!");
        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaCliente().setVisible(true);
            }
        });
    }

    //Flags
    public static boolean mostrandoTelaIncluirCliente = false;
    public static boolean mostrandoTelaExcluirCliente = false;
    public static boolean mostrandoTelaAlterarCliente = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnPesquisaCliente;
    private javax.swing.JTextField campoPesquisaCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePesq;
    private javax.swing.JMenuBar menuBarCliente;
    // End of variables declaration//GEN-END:variables

    private void efetuarPesquisa() 
    {
        if (campoPesquisaCliente.getText().equalsIgnoreCase("Código ou nome do cliente") || campoPesquisaCliente.getText().equalsIgnoreCase("")) 
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoCliente.buscarClientesPorNome("");
                LtpUtil.loadFormatJTable(jTablePesq, resp, false);
                BancoConexoes.fecharConexao();
            } 
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else if (Utilitarios.soNumericos(campoPesquisaCliente.getText().toUpperCase()) == true)
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoCliente.buscarClientesCodResult(Integer.parseInt(campoPesquisaCliente.getText()));
                LtpUtil.loadFormatJTable(jTablePesq, resp, false);
                BancoConexoes.fecharConexao();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else
        {
            try
            {
                BancoConexoes.abrirConexao();
                ResultSet resp = BancoCliente.buscarClientesPorNome(campoPesquisaCliente.getText());
                LtpUtil.loadFormatJTable(jTablePesq, resp, false);
                BancoConexoes.fecharConexao();
            } 
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    
}
