/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;
import utilitarios.LtpUtil;

/**
 *
 * @author usuario
 */
public class TelaClienteAlterar extends javax.swing.JFrame 
{
    private Cliente cliente = null;
    private ArrayList<String> uf;
    public TelaClienteAlterar() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        GhostText ghostText = new GhostText(campoCodAC, "Entre com o código do cliente que deseja alterar e aperte enter");
        
        uf = Utilitarios.inicializarComboBoxEstados();
        campoUfAC.setModel(new DefaultComboBoxModel(new Vector(uf)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDataAC = new javax.swing.JTextField();
        campoEmailAC = new javax.swing.JTextField();
        campoCidadeAC = new javax.swing.JTextField();
        campoBairroAC = new javax.swing.JTextField();
        campoEnderecoAC = new javax.swing.JTextField();
        campoNomeAC = new javax.swing.JTextField();
        btnAlterarCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        campoTelefoneAC = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        campoCodAC = new javax.swing.JTextField();
        campoUfAC = new javax.swing.JComboBox<>();
        campoCepAC = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Cliente");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 426));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Bairro:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("UF:");

        jLabel7.setText("CEP:");

        jLabel8.setText("Telefone fixo:");

        jLabel9.setText("Email:");

        jLabel10.setText("Data inclusão:");

        campoDataAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataAC.setEnabled(false);
        campoDataAC.setFocusable(false);
        campoDataAC.setRequestFocusEnabled(false);

        campoEmailAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoEmailAC.setEnabled(false);
        campoEmailAC.setFocusable(false);

        campoCidadeAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoCidadeAC.setEnabled(false);
        campoCidadeAC.setFocusable(false);

        campoBairroAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoBairroAC.setEnabled(false);
        campoBairroAC.setFocusable(false);

        campoEnderecoAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoEnderecoAC.setEnabled(false);
        campoEnderecoAC.setFocusable(false);

        campoNomeAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeAC.setEnabled(false);
        campoNomeAC.setFocusable(false);

        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.setEnabled(false);
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        campoTelefoneAC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoTelefoneAC.setEnabled(false);
        campoTelefoneAC.setFocusable(false);

        jLabel1.setText("Código:");

        campoCodAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodACActionPerformed(evt);
            }
        });

        campoUfAC.setEnabled(false);
        campoUfAC.setFocusable(false);

        campoCepAC.setEnabled(false);
        campoCepAC.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAlterarCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCidadeAC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTelefoneAC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEnderecoAC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoBairroAC))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDataAC)
                                    .addComponent(campoEmailAC)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodAC)
                                    .addComponent(campoNomeAC)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUfAC, 0, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCepAC)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoEnderecoAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoBairroAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCidadeAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoUfAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCepAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefoneAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoEmailAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataAC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarCliente))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de alteração de clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaCliente.mostrandoTelaAlterarCliente = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        String camposInvalidos = validarEntradas();
        if(camposInvalidos.equals(""))
        {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar esse cliente?", "Confirmar alteração", JOptionPane.INFORMATION_MESSAGE);

            if (opcao == JOptionPane.YES_OPTION)
            {
                cliente.setNome(campoNomeAC.getText().toUpperCase());
                cliente.setEndereco(campoEnderecoAC.getText().toUpperCase());
                cliente.setBairro(campoBairroAC.getText().toUpperCase());
                cliente.setCidade(campoCidadeAC.getText().toUpperCase());
                cliente.setUf(campoUfAC.getSelectedItem().toString().toUpperCase());
                cliente.setCep(Utilitarios.tirarFormatacaoCep(campoCepAC));
                cliente.setTelefone(Utilitarios.tirarFormatacaoTelefone(campoTelefoneAC));
                cliente.setEmail(Utilitarios.tirarFormatacaoEmail(campoEmailAC));
                try
                {
                    BancoConexoes.abrirConexao();
                    String retorno = BancoCliente.alterarCliente(cliente);
                    if (retorno.equals("")) 
                    {
                        JOptionPane.showMessageDialog(this, "Cliente '" + campoNomeAC.getText() + "' alterado!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Algo deu errado!\n" + retorno, "Operação falhou", JOptionPane.INFORMATION_MESSAGE);
                    }                
                    BancoConexoes.fecharConexao();
                } 
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
            dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Verifique o(s) campo(s):\n" + camposInvalidos, "Entrada(s) inválida(s)!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void campoCodACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodACActionPerformed
        
        if (!campoCodAC.getText().equalsIgnoreCase("Entre com o código do cliente que deseja alterar e aperte enter") && Utilitarios.soNumericos(campoCodAC.getText()))
        {
            try
            {
               BancoConexoes.abrirConexao();
               cliente = BancoCliente.buscarClientesCodCliente(Integer.parseInt(campoCodAC.getText()));
               BancoConexoes.fecharConexao();
               
                if (cliente != null) 
                {                    
                    campoNomeAC.setText(cliente.getNome());
                    campoNomeAC.setFocusable(true);
                    campoNomeAC.setEnabled(true);
                    
                    campoEnderecoAC.setText(cliente.getEndereco());
                    campoEnderecoAC.setFocusable(true);
                    campoEnderecoAC.setEnabled(true);
                    
                    campoBairroAC.setText(cliente.getBairro());
                    campoBairroAC.setFocusable(true);
                    campoBairroAC.setEnabled(true);
                    
                    campoCidadeAC.setText(cliente.getCidade());
                    campoCidadeAC.setFocusable(true);
                    campoCidadeAC.setEnabled(true);
                    
                    campoUfAC.setSelectedIndex(Utilitarios.buscarIndexUF(cliente.getUf(), uf));
                    campoUfAC.setFocusable(true);
                    campoUfAC.setEnabled(true);
                    
                    campoCepAC.setText(Utilitarios.formatarCEP(cliente.getCep()));
                    campoCepAC.setFocusable(true);
                    campoCepAC.setEnabled(true);
                    //campoCepAC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###-###")));
                    
                    campoTelefoneAC.setText(Utilitarios.formatarTelefone(cliente.getTelefone()));
                    campoTelefoneAC.setFocusable(true);
                    campoTelefoneAC.setEnabled(true);
                    //campoTelefoneAC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
                    
                    campoEmailAC.setText(cliente.getEmail());
                    campoEmailAC.setFocusable(true);
                    campoEmailAC.setEnabled(true);
                    
                    campoDataAC.setText(LtpUtil.formatarData(cliente.getData(), "dd/MM/yyyy"));
                    
                    btnAlterarCliente.setEnabled(true);
                }
                else
                {
                    campoNomeAC.setText("");
                    campoNomeAC.setFocusable(false);
                    campoNomeAC.setEnabled(false);
                    
                    campoEnderecoAC.setText("");
                    campoEnderecoAC.setFocusable(false);
                    campoEnderecoAC.setEnabled(false);
                    
                    campoBairroAC.setText("");
                    campoBairroAC.setFocusable(false);
                    campoBairroAC.setEnabled(false);
                    
                    campoCidadeAC.setText("");
                    campoCidadeAC.setFocusable(false);
                    campoCidadeAC.setEnabled(false);
                    
                    campoUfAC.setSelectedIndex(0);
                    campoUfAC.setFocusable(false);
                    campoUfAC.setEnabled(false);
                    
                    campoCepAC.setText("");
                    campoCepAC.setFocusable(false);
                    campoCepAC.setEnabled(false);
                    
                    campoTelefoneAC.setText("");
                    campoTelefoneAC.setFocusable(false);
                    campoTelefoneAC.setEnabled(false);
                    
                    campoEmailAC.setText("");
                    campoEmailAC.setFocusable(false);
                    campoEmailAC.setEnabled(false);
                    
                    campoDataAC.setText("");
                    campoDataAC.setFocusable(false);
                    campoDataAC.setEnabled(false);
                    
                    btnAlterarCliente.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado!\nVerifique o código digitado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            catch (NumberFormatException | SQLException e) 
            {
                JOptionPane.showMessageDialog(this, e, "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            campoNomeAC.setText("");
            campoNomeAC.setFocusable(false);
            campoNomeAC.setEnabled(false);

            campoEnderecoAC.setText("");
            campoEnderecoAC.setFocusable(false);
            campoEnderecoAC.setEnabled(false);

            campoBairroAC.setText("");
            campoBairroAC.setFocusable(false);
            campoBairroAC.setEnabled(false);

            campoCidadeAC.setText("");
            campoCidadeAC.setFocusable(false);
            campoCidadeAC.setEnabled(false);

            campoUfAC.setSelectedIndex(0);
            campoUfAC.setFocusable(false);
            campoUfAC.setEnabled(false);

            campoCepAC.setText("");
            campoCepAC.setFocusable(false);
            campoCepAC.setEnabled(false);

            campoTelefoneAC.setText("");
            campoTelefoneAC.setFocusable(false);
            campoTelefoneAC.setEnabled(false);

            campoEmailAC.setText("");
            campoEmailAC.setFocusable(false);
            campoEmailAC.setEnabled(false);

            campoDataAC.setText("");
            campoDataAC.setFocusable(false);
            campoDataAC.setEnabled(false);

            btnAlterarCliente.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Código inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }//GEN-LAST:event_campoCodACActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JTextField campoBairroAC;
    private javax.swing.JFormattedTextField campoCepAC;
    private javax.swing.JTextField campoCidadeAC;
    private javax.swing.JTextField campoCodAC;
    private javax.swing.JTextField campoDataAC;
    private javax.swing.JTextField campoEmailAC;
    private javax.swing.JTextField campoEnderecoAC;
    private javax.swing.JTextField campoNomeAC;
    public static javax.swing.JFormattedTextField campoTelefoneAC;
    private javax.swing.JComboBox<String> campoUfAC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String validarEntradas()
    {        
        return Utilitarios.validarEntradas(campoNomeAC, campoEnderecoAC, campoBairroAC, campoCidadeAC, campoUfAC, campoCepAC, campoTelefoneAC, campoEmailAC);
    }

    

}