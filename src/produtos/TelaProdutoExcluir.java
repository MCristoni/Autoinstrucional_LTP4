package produtos;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;
import utilitarios.LtpUtil;

public class TelaProdutoExcluir extends javax.swing.JFrame 
{

    public TelaProdutoExcluir() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        new GhostText(campoCodEP, "Entre com o código do produto que deseja excluir e aperte enter");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDataEP = new javax.swing.JTextField();
        campoPrecoEP = new javax.swing.JTextField();
        campoTipoEP = new javax.swing.JTextField();
        campoNomeEP = new javax.swing.JTextField();
        btnExcluirCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCodEP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Produto");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 284));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Preço:");

        jLabel5.setText("Data cadastro:");

        campoDataEP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataEP.setEnabled(false);
        campoDataEP.setFocusable(false);

        campoPrecoEP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoPrecoEP.setEnabled(false);
        campoPrecoEP.setFocusable(false);

        campoTipoEP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoTipoEP.setEnabled(false);
        campoTipoEP.setFocusable(false);

        campoNomeEP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeEP.setEnabled(false);
        campoNomeEP.setFocusable(false);

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setEnabled(false);
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
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

        campoCodEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodEPActionPerformed(evt);
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
                        .addComponent(btnExcluirCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataEP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTipoEP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPrecoEP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeEP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                    .addComponent(campoCodEP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTipoEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoPrecoEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDataEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCliente))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de exclusão de clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaProduto.mostrandoTelaExcluirProdutos = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed

        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse produto?", "Confirmar exclusão", JOptionPane.INFORMATION_MESSAGE);

        if (opcao == JOptionPane.YES_OPTION)
        {
            try
            {
                BancoConexoes.abrirConexao();
                String retorno = BancoProduto.excluirProduto(Integer.parseInt(campoCodEP.getText()));
                if (retorno.equals(""))
                {
                    JOptionPane.showMessageDialog(this, "Produto '" + campoNomeEP.getText() + "' excluído!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Algo deu errado!\n" + retorno, "Operação falhou", JOptionPane.INFORMATION_MESSAGE);
                }
                BancoConexoes.fecharConexao();
                dispose();
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void campoCodEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodEPActionPerformed
        ArrayList<String> tipos = Utilitarios.inicializarComboBoxUnidades();
        
        if (!campoCodEP.getText().equalsIgnoreCase("Entre com o código do produto que deseja excluir e aperte enter") && Utilitarios.soNumericos(campoCodEP.getText()))
        {
            try
            {
                BancoConexoes.abrirConexao();
                Produto produto = BancoProduto.buscarProdutosCodProduto(Integer.parseInt(campoCodEP.getText()));
                BancoConexoes.fecharConexao();

                if (produto != null)
                {
                    campoNomeEP.setText(produto.getProduto());
                    campoTipoEP.setText(tipos.get(produto.getCodUnidade()));
                    campoPrecoEP.setText(produto.getDataPreco() + "");
                    campoDataEP.setText(LtpUtil.formatarData(produto.getDataPreco(), "dd/MM/yyyy") );
                    btnExcluirCliente.setEnabled(true);
                }
                else
                {
                    campoNomeEP.setText("");
                    campoTipoEP.setText("");
                    campoPrecoEP.setText("");
                    campoDataEP.setText("");
                    btnExcluirCliente.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Produto não encontrado!\nVerifique o código digitado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
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

    }//GEN-LAST:event_campoCodEPActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JTextField campoCodEP;
    private javax.swing.JTextField campoDataEP;
    private javax.swing.JTextField campoNomeEP;
    private javax.swing.JTextField campoPrecoEP;
    private javax.swing.JTextField campoTipoEP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}