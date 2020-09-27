/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author Will Soares
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btControlarCaixa = new javax.swing.JButton();
        btCadastrarForn = new javax.swing.JButton();
        btCadastrarFunc = new javax.swing.JButton();
        btPedirMercadoria = new javax.swing.JButton();
        btRealizarVenda = new javax.swing.JButton();
        btCadastrarProd = new javax.swing.JButton();
        btReceberCAPrazo = new javax.swing.JButton();
        btCadastrarDespesas = new javax.swing.JButton();
        btCadastrarCliente = new javax.swing.JButton();
        btEmitirRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btControlarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cashier2_118191.png"))); // NOI18N
        btControlarCaixa.setText("Controlar Caixa");
        btControlarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btControlarCaixaActionPerformed(evt);
            }
        });

        btCadastrarForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic-vendor_97612.png"))); // NOI18N
        btCadastrarForn.setText("Cadastrar Fornecedor");
        btCadastrarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFornActionPerformed(evt);
            }
        });

        btCadastrarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-funcionário-homem-50.png"))); // NOI18N
        btCadastrarFunc.setText("Cadastrar Funcionario");
        btCadastrarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncActionPerformed(evt);
            }
        });

        btPedirMercadoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/businesspackage_additionalpackage_box_add_insert_negoci_2335.png"))); // NOI18N
        btPedirMercadoria.setText("Pedir Mercadorias");
        btPedirMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedirMercadoriaActionPerformed(evt);
            }
        });

        btRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        btRealizarVenda.setText("Realizar Vendas");
        btRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRealizarVendaActionPerformed(evt);
            }
        });

        btCadastrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business_package_box_accept_productorpackagetoaccept_negocio_paquet_2334.png"))); // NOI18N
        btCadastrarProd.setText("Cadastrar Produtos");
        btCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProdActionPerformed(evt);
            }
        });

        btReceberCAPrazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money-bills-and-coins-stack_icon-icons.com_56169.png"))); // NOI18N
        btReceberCAPrazo.setText("Receber Contas a Prazo");
        btReceberCAPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReceberCAPrazoActionPerformed(evt);
            }
        });

        btCadastrarDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/banking-spendings-1_icon-icons.com_48701.png"))); // NOI18N
        btCadastrarDespesas.setText("Cadastrar Despesas");
        btCadastrarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarDespesasActionPerformed(evt);
            }
        });

        btCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        btCadastrarCliente.setText("Cadastrar Cliente");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });

        btEmitirRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/analytics_117818.png"))); // NOI18N
        btEmitirRelatorios.setText("Emitir Relatórios");
        btEmitirRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmitirRelatoriosActionPerformed(evt);
            }
        });

        jLabel1.setText("By: Willian G., Willamy C., Alessandro D.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEmitirRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPedirMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReceberCAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btControlarCaixa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRealizarVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarDespesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarFunc, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastrarForn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btControlarCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPedirMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReceberCAPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEmitirRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRealizarVendaActionPerformed
        FormRealizarVendas form = new FormRealizarVendas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_btRealizarVendaActionPerformed

    private void btCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProdActionPerformed
         FormProduto frame= new FormProduto(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarProdActionPerformed

    private void btCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncActionPerformed
        FormFuncionario frame= new FormFuncionario(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        FormCliente frame = new FormCliente(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btCadastrarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFornActionPerformed
        FormFornecedor frame = new FormFornecedor(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarFornActionPerformed

    private void btCadastrarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarDespesasActionPerformed
        FormDespesas form = new FormDespesas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_btCadastrarDespesasActionPerformed

    private void btReceberCAPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReceberCAPrazoActionPerformed
        FormReceberContas form = new FormReceberContas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btReceberCAPrazoActionPerformed

    private void btEmitirRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmitirRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEmitirRelatoriosActionPerformed

    private void btPedirMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedirMercadoriaActionPerformed

    FormMercadorias form = new FormMercadorias(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);




        // TODO add your handling code here:
    }//GEN-LAST:event_btPedirMercadoriaActionPerformed

    private void btControlarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btControlarCaixaActionPerformed
        
    FormCaixa form = new FormCaixa(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btControlarCaixaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btCadastrarDespesas;
    private javax.swing.JButton btCadastrarForn;
    private javax.swing.JButton btCadastrarFunc;
    private javax.swing.JButton btCadastrarProd;
    private javax.swing.JButton btControlarCaixa;
    private javax.swing.JButton btEmitirRelatorios;
    private javax.swing.JButton btPedirMercadoria;
    private javax.swing.JButton btRealizarVenda;
    private javax.swing.JButton btReceberCAPrazo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
