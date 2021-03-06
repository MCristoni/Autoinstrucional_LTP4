package produtos;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import util.Utilitarios;
import utilitarios.LtpUtil;

public class TelaProdutoAlterar extends javax.swing.JFrame 
{
    private Produto produto = null;
    private final ArrayList<String> tipo;
    public TelaProdutoAlterar() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        
        tipo = Utilitarios.inicializarComboBoxUnidades();
        campoTipoAP.setModel(new DefaultComboBoxModel(new Vector(tipo)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDataAP = new javax.swing.JTextField();
        campoPrecoAP = new javax.swing.JTextField();
        campoNomeAP = new javax.swing.JTextField();
        btnAlterarProduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCodAP = new javax.swing.JTextField();
        campoTipoAP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produto");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 276));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel6.setText("Tipo:");

        jLabel9.setText("Preço:");

        jLabel10.setText("Data cadastro:");

        campoDataAP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataAP.setEnabled(false);
        campoDataAP.setFocusable(false);
        campoDataAP.setRequestFocusEnabled(false);

        campoPrecoAP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoPrecoAP.setEnabled(false);
        campoPrecoAP.setFocusable(false);

        campoNomeAP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeAP.setEnabled(false);
        campoNomeAP.setFocusable(false);

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

        campoCodAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodAPActionPerformed(evt);
            }
        });

        campoTipoAP.setEnabled(false);
        campoTipoAP.setFocusable(false);

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDataAP)
                                    .addComponent(campoPrecoAP)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCodAP)
                                    .addComponent(campoNomeAP)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTipoAP, 0, 454, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTipoAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoPrecoAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        TelaProduto.mostrandoTelaAlterarProdutos = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        String camposInvalidos = validarEntradas();
        if(camposInvalidos.equals(""))
        {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente alterar esse produto?", "Confirmar alteração", JOptionPane.INFORMATION_MESSAGE);

            if (opcao == JOptionPane.YES_OPTION)
            {
                produto.setProduto(campoNomeAP.getText().toUpperCase());
                produto.setCodUnidade(campoTipoAP.getSelectedIndex());
                produto.setPreco(Double.parseDouble(campoPrecoAP.getText()));
                try
                {
                    BancoConexoes.abrirConexao();
                    String retorno = BancoProduto.alterarProduto(produto);
                    if (retorno.equals("")) 
                    {
                        JOptionPane.showMessageDialog(this, "Produto '" + campoNomeAP.getText() + "' alterado!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
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

    private void campoCodAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodAPActionPerformed
        
        if (!campoCodAP.getText().equalsIgnoreCase("Entre com o código do produto que deseja alterar e aperte enter") && Utilitarios.soNumericos(campoCodAP.getText()))
        {
            try
            {
               BancoConexoes.abrirConexao();
               produto = BancoProduto.buscarProdutosCodProduto(Integer.parseInt(campoCodAP.getText()));
               BancoConexoes.fecharConexao();
               
                if (produto != null) 
                {                    
                    campoNomeAP.setText(produto.getProduto());
                    campoNomeAP.setFocusable(true);
                    campoNomeAP.setEnabled(true);
                    
                    campoTipoAP.setSelectedIndex(produto.getCodUnidade());
                    campoTipoAP.setFocusable(true);
                    campoTipoAP.setEnabled(true);
                    
                    campoPrecoAP.setText(produto.getPreco()+"");
                    campoPrecoAP.setFocusable(true);
                    campoPrecoAP.setEnabled(true);

                    campoDataAP.setText(LtpUtil.formatarData(produto.getDataPreco(), "dd/MM/yyyy"));
                    campoDataAP.setEnabled(false);

                    btnAlterarProduto.setEnabled(true);
                }
                else
                {
                    campoNomeAP.setText("");
                    campoNomeAP.setFocusable(false);
                    campoNomeAP.setEnabled(false);
                    
                    campoTipoAP.setSelectedIndex(0);
                    campoTipoAP.setFocusable(false);
                    campoTipoAP.setEnabled(false);
                    
                    campoPrecoAP.setText("");
                    campoPrecoAP.setFocusable(false);
                    campoPrecoAP.setEnabled(false);
                    
                    campoDataAP.setText(LtpUtil.formatarData(produto.getDataPreco(), "dd/MM/yyyy"));
                    campoDataAP.setFocusable(false);
                    campoDataAP.setEnabled(false);
                    
                    btnAlterarProduto.setEnabled(false);
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
            campoNomeAP.setText("");
            campoNomeAP.setFocusable(false);
            campoNomeAP.setEnabled(false);

            campoTipoAP.setSelectedIndex(0);
            campoTipoAP.setFocusable(false);
            campoTipoAP.setEnabled(false);

            campoPrecoAP.setText("");
            campoPrecoAP.setFocusable(false);
            campoPrecoAP.setEnabled(false);

            campoDataAP.setText("");
            campoDataAP.setFocusable(false);
            campoDataAP.setEnabled(false);

            campoDataAP.setText(LtpUtil.formatarData(produto.getDataPreco(), "dd/MM/yyyy"));
            campoDataAP.setFocusable(false);
            campoDataAP.setEnabled(false);

            btnAlterarProduto.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Código inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }//GEN-LAST:event_campoCodAPActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JTextField campoCodAP;
    private javax.swing.JTextField campoDataAP;
    private javax.swing.JTextField campoNomeAP;
    private javax.swing.JTextField campoPrecoAP;
    private javax.swing.JComboBox<String> campoTipoAP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private String validarEntradas()
    {        
        return Utilitarios.validarEntradas(campoNomeAP, campoTipoAP, campoPrecoAP);
    }
}