package vendedores;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;
import utilitarios.LtpUtil;

/**
 *
 * @author usuario
 */
public class TelaVendedorAlterar extends javax.swing.JFrame 
{
    private Vendedor vendedor = null;
    private GhostText ghostText;
    
    public TelaVendedorAlterar() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        setarMascaras();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDataAVendedor = new javax.swing.JTextField();
        campoNomeAVendedor = new javax.swing.JTextField();
        btnAlterarProduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCodAVendedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Vendedor");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 180));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel10.setText("Data cadastro:");

        campoDataAVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataAVendedor.setEnabled(false);
        campoDataAVendedor.setFocusable(false);
        campoDataAVendedor.setRequestFocusEnabled(false);

        campoNomeAVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeAVendedor.setEnabled(false);
        campoNomeAVendedor.setFocusable(false);

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setEnabled(false);
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
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

        jLabel1.setText("Código:");

        campoCodAVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodAVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAlterarProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataAVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodAVendedor)
                                    .addComponent(campoNomeAVendedor))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodAVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataAVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarProduto))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de alteração de clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaVendedor.mostrandoTelaAlterarVendedor = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        String camposInvalidos = validarEntradas();
        if(camposInvalidos.equals(""))
        {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar esse vendedor?", "Confirmar alteração", JOptionPane.INFORMATION_MESSAGE);

            if (opcao == JOptionPane.YES_OPTION)
            {
                vendedor.setNomeVendedor(campoNomeAVendedor.getText().toUpperCase());
                try
                {
                    BancoConexoes.abrirConexao();
                    String retorno = BancoVendedor.alterarVendedor(vendedor);
                    if (retorno.equals("")) 
                    {
                        JOptionPane.showMessageDialog(this, "Vendedor '" + campoNomeAVendedor.getText().toUpperCase() + "' alterado!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
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
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void campoCodAVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodAVendedorActionPerformed
        
        if (!campoCodAVendedor.getText().equalsIgnoreCase("Entre com o código do vendedor que deseja alterar e aperte enter") && Utilitarios.soNumericos(campoCodAVendedor.getText()))
        {
            try
            {
               BancoConexoes.abrirConexao();
               vendedor = BancoVendedor.buscarVendedoresCodVendedor(Integer.parseInt(campoCodAVendedor.getText()));
               BancoConexoes.fecharConexao();
               
                if (vendedor != null) 
                {                    
                    campoNomeAVendedor.setText(vendedor.getNomeVendedor());
                    campoNomeAVendedor.setFocusable(true);
                    campoNomeAVendedor.setEnabled(true);
                    
                    campoDataAVendedor.setText(LtpUtil.formatarData(vendedor.getDataCadVendedor(), "dd/MM/yyyy"));
                    campoDataAVendedor.setEnabled(false);

                    btnAlterarProduto.setEnabled(true);
                }
                else
                {
                    campoNomeAVendedor.setText("");
                    campoNomeAVendedor.setFocusable(false);
                    campoNomeAVendedor.setEnabled(false);
                    
                    campoDataAVendedor.setText(LtpUtil.formatarData(vendedor.getDataCadVendedor(), "dd/MM/yyyy"));
                    campoDataAVendedor.setFocusable(false);
                    campoDataAVendedor.setEnabled(false);
                    
                    btnAlterarProduto.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Vendedor não encontrado!\nVerifique o código digitado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
                }
            } 
            catch (NumberFormatException | SQLException e) 
            {
                JOptionPane.showMessageDialog(this, e, "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            campoNomeAVendedor.setText("");
            campoNomeAVendedor.setFocusable(false);
            campoNomeAVendedor.setEnabled(false);

            campoDataAVendedor.setText(LtpUtil.formatarData(vendedor.getDataCadVendedor(), "dd/MM/yyyy"));
            campoDataAVendedor.setFocusable(false);
            campoDataAVendedor.setEnabled(false);

            btnAlterarProduto.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Código inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }//GEN-LAST:event_campoCodAVendedorActionPerformed

    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JTextField campoCodAVendedor;
    private javax.swing.JTextField campoDataAVendedor;
    private javax.swing.JTextField campoNomeAVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String validarEntradas()
    {        
        return Utilitarios.validarEntradas(campoNomeAVendedor);
    }

    private void setarMascaras() 
    {
       ghostText = new GhostText(campoCodAVendedor, "Entre com o código do vendedor que deseja alterar e aperte enter");
    }

    

}