package clientes;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;
import utilitarios.LtpUtil;
import vendas.BancoVendas;

public class TelaClienteExcluir extends javax.swing.JFrame 
{
    private GhostText ghostText;
    public TelaClienteExcluir() throws ParseException
    {
        initComponents();
        jPanel1.requestFocus();
        ghostText = new GhostText(campoCodEC, "Entre com o código do cliente que deseja excluir e aperte enter");
    }

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
        campoDataEC = new javax.swing.JTextField();
        campoEmailEC = new javax.swing.JTextField();
        campoCidadeEC = new javax.swing.JTextField();
        campoBairroEC = new javax.swing.JTextField();
        campoEnderecoEC = new javax.swing.JTextField();
        campoNomeEC = new javax.swing.JTextField();
        btnExcluirCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        campoTelefoneIEC = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        campoCodEC = new javax.swing.JTextField();
        campoUfEC = new javax.swing.JTextField();
        campoCepEC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Cliente");
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

        jLabel10.setText("Data cadastro:");

        campoDataEC.setForeground(new java.awt.Color(51, 51, 51));
        campoDataEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataEC.setEnabled(false);
        campoDataEC.setFocusable(false);
        campoDataEC.setRequestFocusEnabled(false);

        campoEmailEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoEmailEC.setEnabled(false);
        campoEmailEC.setFocusable(false);

        campoCidadeEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoCidadeEC.setEnabled(false);
        campoCidadeEC.setFocusable(false);

        campoBairroEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoBairroEC.setEnabled(false);
        campoBairroEC.setFocusable(false);

        campoEnderecoEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoEnderecoEC.setEnabled(false);
        campoEnderecoEC.setFocusable(false);

        campoNomeEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoNomeEC.setEnabled(false);
        campoNomeEC.setFocusable(false);

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

        campoTelefoneIEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoTelefoneIEC.setEnabled(false);
        campoTelefoneIEC.setFocusable(false);

        jLabel1.setText("Código:");

        campoCodEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodECActionPerformed(evt);
            }
        });

        campoUfEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoUfEC.setEnabled(false);
        campoUfEC.setFocusable(false);

        campoCepEC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoCepEC.setEnabled(false);
        campoCepEC.setFocusable(false);

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
                                .addComponent(campoCidadeEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTelefoneIEC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEnderecoEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoBairroEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCepEC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUfEC))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDataEC)
                                    .addComponent(campoEmailEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                    .addComponent(campoCodEC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoEnderecoEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoBairroEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCidadeEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoUfEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCepEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefoneIEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoEmailEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataEC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
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
        TelaCliente.mostrandoTelaExcluirCliente = false;
    }//GEN-LAST:event_formWindowClosed

    private void campoCodECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodECActionPerformed
        
        if (!campoCodEC.getText().equalsIgnoreCase("Entre com o código do cliente que deseja excluir e aperte enter") && Utilitarios.soNumericos(campoCodEC.getText()))
        {
            try
            {
               BancoConexoes.abrirConexao();
               Cliente cliente = BancoCliente.buscarClientesCodCliente(Integer.parseInt(campoCodEC.getText()));
               BancoConexoes.fecharConexao();
               
                if (cliente != null) 
                {                    
                    campoNomeEC.setText(cliente.getNome());
                    campoEnderecoEC.setText(cliente.getEndereco());
                    campoBairroEC.setText(cliente.getBairro());
                    campoCidadeEC.setText(cliente.getCidade());
                    campoUfEC.setText(cliente.getUf());
                    campoCepEC.setText(Utilitarios.formatarCEP(cliente.getCep()));
                    campoTelefoneIEC.setText(Utilitarios.formatarTelefone(cliente.getTelefone()));
                    campoEmailEC.setText(cliente.getEmail());
                    campoDataEC.setText(LtpUtil.formatarData(cliente.getData(), "dd/MM/yyyy") );
                    btnExcluirCliente.setEnabled(true);
                }
                else
                {
                    campoNomeEC.setText("");
                    campoEnderecoEC.setText("");
                    campoBairroEC.setText("");
                    campoCidadeEC.setText("");
                    campoUfEC.setText("");
                    campoCepEC.setText("");
                    campoTelefoneIEC.setText("");
                    campoEmailEC.setText("");
                    campoDataEC.setText("");
                    btnExcluirCliente.setEnabled(false);
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
            JOptionPane.showMessageDialog(this, "Código inválido!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }//GEN-LAST:event_campoCodECActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        
        try 
        {
            BancoConexoes.abrirConexao();
            if(BancoVendas.verificarExistenciaVendasClientes(Integer.parseInt(campoCodEC.getText())))
            {
                JOptionPane.showMessageDialog(this, "Não é possível excluir clientes com vendas cadastradas", "Erro ao excluir", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse cliente?", "Confirmar exclusão", JOptionPane.INFORMATION_MESSAGE);

                if (opcao == JOptionPane.YES_OPTION)
                {
                    String retorno = BancoCliente.excluirCliente(Integer.parseInt(campoCodEC.getText()));
                    if (retorno.equals(""))
                    {
                        JOptionPane.showMessageDialog(this, "Cliente '" + campoNomeEC.getText() + "' excluído!", "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
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
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JTextField campoBairroEC;
    private javax.swing.JTextField campoCepEC;
    private javax.swing.JTextField campoCidadeEC;
    private javax.swing.JTextField campoCodEC;
    private javax.swing.JTextField campoDataEC;
    private javax.swing.JTextField campoEmailEC;
    private javax.swing.JTextField campoEnderecoEC;
    private javax.swing.JTextField campoNomeEC;
    public static javax.swing.JFormattedTextField campoTelefoneIEC;
    private javax.swing.JTextField campoUfEC;
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

}