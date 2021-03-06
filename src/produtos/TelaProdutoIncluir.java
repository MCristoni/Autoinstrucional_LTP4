package produtos;

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

public class TelaProdutoIncluir extends javax.swing.JFrame 
{

    public TelaProdutoIncluir() throws ParseException 
    {
        initComponents();
        jPanel1.requestFocus();
        ArrayList<String> tipos = Utilitarios.inicializarComboBoxUnidades();
        campoTipoIP.setModel(new DefaultComboBoxModel(new Vector(tipos)));
        campoDataIP.setText(Utilitarios.descobrirDataString());
        setarMascaras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDataIP = new javax.swing.JTextField();
        campoNomeIP = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        campoTipoIP = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        campoPrecoIP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir Produto");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(576, 220));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel6.setText("Tipo:");

        jLabel7.setText("Preço:");

        jLabel10.setText("Data cadastro:");

        campoDataIP.setForeground(new java.awt.Color(51, 51, 51));
        campoDataIP.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoDataIP.setEnabled(false);
        campoDataIP.setFocusable(false);
        campoDataIP.setRequestFocusEnabled(false);

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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNomeIP, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoPrecoIP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTipoIP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataIP))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCadastrarCliente)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTipoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoPrecoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoDataIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        TelaProduto.mostrandoTelaIncluirProdutos = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        String camposInvalidos = validarEntradas();
        if(camposInvalidos.equals(""))
        {
            int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente cadastrar esse produto?", "Confirmar cadastro", JOptionPane.INFORMATION_MESSAGE);
            
            if (opcao == JOptionPane.YES_OPTION)
            {
                Produto produto = new Produto(campoNomeIP.getText().toUpperCase(), campoTipoIP.getSelectedIndex(), Double.parseDouble(campoPrecoIP.getText()), Utilitarios.descobrirDataDate());
                
                try
                {
                    BancoConexoes.abrirConexao();
                    BancoProduto.adicionarProduto(produto);
                    JOptionPane.showMessageDialog(this, "Produto '" + produto.getProduto() + "' cadastrado!\nSeu código será: " + BancoProduto.pesqCodUltimoProduto(), "Operação realizada com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    BancoConexoes.fecharConexao();
                    dispose();
                    
                } 
                catch (SQLException ex)
                {
                    Logger.getLogger(TelaProdutoIncluir.class.getName()).log(Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JTextField campoDataIP;
    private javax.swing.JTextField campoNomeIP;
    private javax.swing.JTextField campoPrecoIP;
    private javax.swing.JComboBox<String> campoTipoIP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private String validarEntradas()
    {        
        return Utilitarios.validarEntradas(campoNomeIP, campoTipoIP, campoPrecoIP);
    }

    private void setarMascaras() 
    {
        GhostText ghostText = new GhostText(campoNomeIP, "Campo obrigatório");
        GhostText ghostText1 = new GhostText(campoPrecoIP, "Campo obrigatório - Utilize . para decimais");
    }
}
