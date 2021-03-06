package clientes;

import banco.BancoConexoes;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import util.GhostText;
import util.Utilitarios;

public class TelaClienteIncluir extends javax.swing.JFrame 
{
    public TelaClienteIncluir() throws ParseException 
    {
        initComponents();
        jPanel1.requestFocus();
        ArrayList<String> uf = Utilitarios.inicializarComboBoxEstados();
        campoUfIC.setModel(new DefaultComboBoxModel(new Vector(uf)));
        campoDataIC.setText(Utilitarios.descobrirDataString());
        setarMascaras();
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
        campoDataIC = new javax.swing.JTextField();
        campoEmailIC = new javax.swing.JTextField();
        campoCidadeIC = new javax.swing.JTextField();
        campoBairroIC = new javax.swing.JTextField();
        campoEnderecoIC = new javax.swing.JTextField();
        campoNomeIC = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        campoUfIC = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        campoCepIC = new javax.swing.JFormattedTextField();
        campoTelefoneIC = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir Cliente");
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

        campoDataIC.setForeground(new java.awt.Color(51, 51, 51));
        campoDataIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataIC.setEnabled(false);
        campoDataIC.setFocusable(false);
        campoDataIC.setRequestFocusEnabled(false);

        btnCadastrarCliente.setText("Incluir");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
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

        try {
            campoCepIC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCidadeIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTelefoneIC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNomeIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEnderecoIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoBairroIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCepIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoUfIC, 0, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoDataIC)
                                    .addComponent(campoEmailIC, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCadastrarCliente)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoEnderecoIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoBairroIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCidadeIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoUfIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCepIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefoneIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoEmailIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCliente))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Quando a tela de inclusão de clientes for fechada, mudar a flag que evita a abertura de várias para falso.
        TelaCliente.mostrandoTelaIncluirCliente = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        
        String camposInvalidos = validarEntradas();
        if(camposInvalidos.equals(""))
        {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente cadastrar esse cliente?", "Confirmar cadastro", JOptionPane.INFORMATION_MESSAGE);
            
            if (opcao == JOptionPane.YES_OPTION)
            {
                Cliente cliente = new Cliente(
                        campoNomeIC.getText().toUpperCase(),
                        campoEnderecoIC.getText().toUpperCase(),
                        campoBairroIC.getText().toUpperCase(), 
                        campoCidadeIC.getText().toUpperCase(), 
                        campoUfIC.getSelectedItem().toString().toUpperCase(),
                        Utilitarios.tirarFormatacaoCep(campoCepIC), 
                        Utilitarios.tirarFormatacaoTelefone(campoTelefoneIC), 
                        Utilitarios.tirarFormatacaoEmail(campoEmailIC), 
                        Utilitarios.descobrirDataDate());
                
                try
                {
                    BancoConexoes.abrirConexao();
                    BancoCliente.adicionarCliente(cliente);
                    JOptionPane.showMessageDialog(this, "Cliente '" + cliente.getNome() + "' cadastrado!\nSeu código será: " + BancoCliente.pesqCodUltimoCliente(), "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    BancoConexoes.fecharConexao();
                    dispose();
                    
                } 
                catch (SQLException ex)
                {
                    Logger.getLogger(TelaClienteIncluir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Verifique o(s) campo(s):\n" + camposInvalidos, "Entrada(s) inválida(s)!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClienteIncluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JTextField campoBairroIC;
    public static javax.swing.JFormattedTextField campoCepIC;
    private javax.swing.JTextField campoCidadeIC;
    private javax.swing.JTextField campoDataIC;
    private javax.swing.JTextField campoEmailIC;
    private javax.swing.JTextField campoEnderecoIC;
    private javax.swing.JTextField campoNomeIC;
    public static javax.swing.JFormattedTextField campoTelefoneIC;
    private javax.swing.JComboBox<String> campoUfIC;
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
        return Utilitarios.validarEntradas(campoNomeIC, campoEnderecoIC, campoBairroIC, campoCidadeIC, campoUfIC, campoCepIC, campoTelefoneIC, campoEmailIC);
    }

    private void setarMascaras() 
    {
        GhostText ghostText = new GhostText(campoNomeIC, "Campo obrigatório");
        GhostText ghostText1 = new GhostText(campoEnderecoIC, "Campo obrigatório");
        GhostText ghostText2 = new GhostText(campoBairroIC, "Campo obrigatório");
        GhostText ghostText6 = new GhostText(campoEmailIC, "Opcional");
        GhostText ghostText3 = new GhostText(campoTelefoneIC, "Apenas números (DDD + 8 dígitos) - Opcional");
        GhostText ghostText4 = new GhostText(campoCepIC, "Apenas números");
        GhostText ghostText5 = new GhostText(campoCidadeIC, "Campo obrigatório");
    }
}
