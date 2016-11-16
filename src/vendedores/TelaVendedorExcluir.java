package vendedores;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;
import utilitarios.LtpUtil;
import vendas.BancoVendas;

public class TelaVendedorExcluir extends javax.swing.JFrame 
{
    private GhostText ghostText;
    public TelaVendedorExcluir() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        setarMascaras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDataEVend = new javax.swing.JTextField();
        campoNomeEVend = new javax.swing.JTextField();
        btnExcluirVendedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCodEVend = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Vendedor");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 180));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel5.setText("Data cadastro:");

        campoDataEVend.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataEVend.setEnabled(false);
        campoDataEVend.setFocusable(false);

        campoNomeEVend.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeEVend.setEnabled(false);
        campoNomeEVend.setFocusable(false);

        btnExcluirVendedor.setText("Excluir");
        btnExcluirVendedor.setEnabled(false);
        btnExcluirVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendedorActionPerformed(evt);
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

        campoCodEVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodEVendActionPerformed(evt);
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
                        .addComponent(btnExcluirVendedor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataEVend, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeEVend, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                    .addComponent(campoCodEVend, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodEVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeEVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDataEVend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVendedor))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de exclusão de clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaVendedor.mostrandoTelaExcluirVendedor = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnExcluirVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendedorActionPerformed
        try 
        {
            BancoConexoes.abrirConexao();
            if(BancoVendas.verificarExistenciaVendasVendedores(Integer.parseInt(campoCodEVend.getText())))
            {
                JOptionPane.showMessageDialog(this, "Não é possível excluir vendedores com vendas cadastradas", "Erro ao excluir", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse vendedor?", "Confirmar exclusão", JOptionPane.INFORMATION_MESSAGE);

                if (opcao == JOptionPane.YES_OPTION)
                {
                    String retorno = BancoVendedor.excluirVendedor(Integer.parseInt(campoCodEVend.getText()));
                    if (retorno.equals(""))
                    {
                        JOptionPane.showMessageDialog(this, "Vendedor '" + campoNomeEVend.getText() + "' excluído!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Algo deu errado!\n" + retorno, "Operação falhou", JOptionPane.INFORMATION_MESSAGE);
                    }
                    dispose();
                }
            }
            BancoConexoes.fecharConexao();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(this, ex);
        }        
    }//GEN-LAST:event_btnExcluirVendedorActionPerformed

    private void campoCodEVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodEVendActionPerformed
        if (!campoCodEVend.getText().equalsIgnoreCase("Entre com o código do vendedor que deseja excluir e aperte enter") && Utilitarios.soNumericos(campoCodEVend.getText()))
        {
            try
            {
                BancoConexoes.abrirConexao();
                Vendedor vendedor = BancoVendedor.buscarVendedoresCodVendedor(Integer.parseInt(campoCodEVend.getText()));
                BancoConexoes.fecharConexao();

                if (vendedor != null)
                {
                    campoNomeEVend.setText(vendedor.getNomeVendedor());
                    campoDataEVend.setText(LtpUtil.formatarData(vendedor.getDataCadVendedor(), "dd/MM/yyyy") );
                    btnExcluirVendedor.setEnabled(true);
                }
                else
                {
                    campoNomeEVend.setText("");
                    campoDataEVend.setText("");
                    btnExcluirVendedor.setEnabled(false);
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
            JOptionPane.showMessageDialog(this, "Código inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_campoCodEVendActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendedorExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirVendedor;
    private javax.swing.JTextField campoCodEVend;
    private javax.swing.JTextField campoDataEVend;
    private javax.swing.JTextField campoNomeEVend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setarMascaras() 
    {
        ghostText = new GhostText(campoCodEVend, "Entre com o código do vendedor que deseja excluir e aperte enter");
    }

}