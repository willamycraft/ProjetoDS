/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;
import javax.swing.JOptionPane;
import mapeamento.Funcionario;
/**
 *
 * @author Will Soares
 */

public class FormMenu extends javax.swing.JFrame {

    Funcionario func;
    /**
     * Creates new form FormMenu
     */
    public FormMenu(Funcionario f) {
        initComponents();
        lbFunc.setText(f.getNome_fun());
        func = f;
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
        lbFunc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mFunc = new javax.swing.JMenuItem();
        mCli = new javax.swing.JMenuItem();
        mDesp = new javax.swing.JMenuItem();
        mForn = new javax.swing.JMenuItem();
        mProd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mCaixa = new javax.swing.JMenuItem();
        mContas = new javax.swing.JMenuItem();
        mVendas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mEst = new javax.swing.JMenuItem();
        mPed = new javax.swing.JMenuItem();
        mCaixa2 = new javax.swing.JMenuItem();
        mContaspag = new javax.swing.JMenuItem();
        mContasrec = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mCtt = new javax.swing.JMenuItem();
        mConfig = new javax.swing.JMenu();
        mSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btControlarCaixa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btControlarCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cashier2_118191.png"))); // NOI18N
        btControlarCaixa.setText("Caixa");
        btControlarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btControlarCaixaActionPerformed(evt);
            }
        });

        btCadastrarForn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrarForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic-vendor_97612.png"))); // NOI18N
        btCadastrarForn.setText("Fornecedor");
        btCadastrarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFornActionPerformed(evt);
            }
        });

        btCadastrarFunc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-funcionário-homem-50.png"))); // NOI18N
        btCadastrarFunc.setText("Funcionarios");
        btCadastrarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncActionPerformed(evt);
            }
        });

        btPedirMercadoria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btPedirMercadoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/businesspackage_additionalpackage_box_add_insert_negoci_2335.png"))); // NOI18N
        btPedirMercadoria.setText("Mercadorias");
        btPedirMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedirMercadoriaActionPerformed(evt);
            }
        });

        btRealizarVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        btRealizarVenda.setText("Vendas");
        btRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRealizarVendaActionPerformed(evt);
            }
        });

        btCadastrarProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business_package_box_accept_productorpackagetoaccept_negocio_paquet_2334.png"))); // NOI18N
        btCadastrarProd.setText("Produtos");
        btCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarProdActionPerformed(evt);
            }
        });

        btReceberCAPrazo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btReceberCAPrazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money-bills-and-coins-stack_icon-icons.com_56169.png"))); // NOI18N
        btReceberCAPrazo.setText("Contas á prazo");
        btReceberCAPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReceberCAPrazoActionPerformed(evt);
            }
        });

        btCadastrarDespesas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrarDespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/banking-spendings-1_icon-icons.com_48701.png"))); // NOI18N
        btCadastrarDespesas.setText("Despesas");
        btCadastrarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarDespesasActionPerformed(evt);
            }
        });

        btCadastrarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        btCadastrarCliente.setText("Clientes");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });

        btEmitirRelatorios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btEmitirRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/analytics_117818.png"))); // NOI18N
        btEmitirRelatorios.setText("Relatórios");
        btEmitirRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmitirRelatoriosActionPerformed(evt);
            }
        });

        lbFunc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        jLabel2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerenciador Financeiro BBras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mFunc.setText("Funcionarios");
        mFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFuncActionPerformed(evt);
            }
        });
        jMenu1.add(mFunc);

        mCli.setText("Clientes");
        mCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCliActionPerformed(evt);
            }
        });
        jMenu1.add(mCli);

        mDesp.setText("Despesas");
        mDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDespActionPerformed(evt);
            }
        });
        jMenu1.add(mDesp);

        mForn.setText("Fornecedor");
        mForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFornActionPerformed(evt);
            }
        });
        jMenu1.add(mForn);

        mProd.setText("Produtos");
        mProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProdActionPerformed(evt);
            }
        });
        jMenu1.add(mProd);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Financeiro");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mCaixa.setText("Caixa");
        mCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCaixaActionPerformed(evt);
            }
        });
        jMenu2.add(mCaixa);

        mContas.setText("Contas á prazo");
        mContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mContasActionPerformed(evt);
            }
        });
        jMenu2.add(mContas);

        mVendas.setText("Vendas");
        mVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVendasActionPerformed(evt);
            }
        });
        jMenu2.add(mVendas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mEst.setText("Estoque");
        jMenu3.add(mEst);

        mPed.setText("Pedidos");
        jMenu3.add(mPed);

        mCaixa2.setText("Caixa");
        jMenu3.add(mCaixa2);

        mContaspag.setText("Contas a pagar/pagas");
        jMenu3.add(mContaspag);

        mContasrec.setText("Contas a receber/recebidas");
        mContasrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mContasrecActionPerformed(evt);
            }
        });
        jMenu3.add(mContasrec);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Suporte");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mCtt.setText("Contato");
        mCtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCttActionPerformed(evt);
            }
        });
        jMenu4.add(mCtt);

        jMenuBar1.add(jMenu4);

        mConfig.setText("Configurações");
        mConfig.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        mConfig.add(mSair);

        jMenuBar1.add(mConfig);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btReceberCAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(btPedirMercadoria, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(btEmitirRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCadastrarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRealizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrarDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btControlarCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btEmitirRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPedirMercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btReceberCAPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCadastrarDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btControlarCaixa)
                .addGap(18, 18, 18)
                .addComponent(lbFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFornActionPerformed
        FormFornecedor frame = new FormFornecedor(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarFornActionPerformed

    private void btCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncActionPerformed
        FormFuncionario frame= new FormFuncionario(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncActionPerformed

    private void btControlarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btControlarCaixaActionPerformed

        FormCaixa form = new FormCaixa(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btControlarCaixaActionPerformed

    private void btPedirMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedirMercadoriaActionPerformed

        FormMercadoriass form = new FormMercadoriass();
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);

        // TODO add your handling code here:
    }//GEN-LAST:event_btPedirMercadoriaActionPerformed

    private void btReceberCAPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReceberCAPrazoActionPerformed
        FormReceberContas form = new FormReceberContas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btReceberCAPrazoActionPerformed

    private void btRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRealizarVendaActionPerformed
        FormRVendas form = new FormRVendas (func);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_btRealizarVendaActionPerformed

    private void btCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarProdActionPerformed
        FormProduto frame= new FormProduto();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarProdActionPerformed

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        FormCliente frame = new FormCliente(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btCadastrarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarDespesasActionPerformed
        FormDespesas form = new FormDespesas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_btCadastrarDespesasActionPerformed

    private void btEmitirRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmitirRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEmitirRelatoriosActionPerformed

    private void mFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFuncActionPerformed
        FormFuncionario frame= new FormFuncionario(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_mFuncActionPerformed

    private void mContasrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mContasrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mContasrecActionPerformed

    private void mCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCliActionPerformed
        FormCliente frame = new FormCliente(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_mCliActionPerformed

    private void mFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFornActionPerformed
        FormFornecedor frame = new FormFornecedor(this, rootPaneCheckingEnabled);
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_mFornActionPerformed

    private void mDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDespActionPerformed
        FormDespesas form = new FormDespesas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_mDespActionPerformed

    private void mProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProdActionPerformed
        FormProduto frame= new FormProduto();
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);
    }//GEN-LAST:event_mProdActionPerformed

    private void mCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCaixaActionPerformed
        FormCaixa form = new FormCaixa(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mCaixaActionPerformed

    private void mContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mContasActionPerformed
        FormReceberContas form = new FormReceberContas(this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mContasActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
          int op = JOptionPane.showConfirmDialog(null, "DESEJA SAIR?"+ JOptionPane.YES_NO_OPTION);
         if (op == JOptionPane.YES_OPTION) {
            Login frame = new Login();
            frame.setLocationRelativeTo(frame);
            frame.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_mSairActionPerformed

    private void mCttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCttActionPerformed
       JOptionPane.showMessageDialog(mCtt, "willianotenio@gmail.com");
    }//GEN-LAST:event_mCttActionPerformed

    private void mVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVendasActionPerformed
        FormRVendas form = new FormRVendas (func);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }//GEN-LAST:event_mVendasActionPerformed

    /**
     * @param args the command line arguments
     */


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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFunc;
    private javax.swing.JMenuItem mCaixa;
    private javax.swing.JMenuItem mCaixa2;
    private javax.swing.JMenuItem mCli;
    private javax.swing.JMenu mConfig;
    private javax.swing.JMenuItem mContas;
    private javax.swing.JMenuItem mContaspag;
    private javax.swing.JMenuItem mContasrec;
    private javax.swing.JMenuItem mCtt;
    private javax.swing.JMenuItem mDesp;
    private javax.swing.JMenuItem mEst;
    private javax.swing.JMenuItem mForn;
    private javax.swing.JMenuItem mFunc;
    private javax.swing.JMenuItem mPed;
    private javax.swing.JMenuItem mProd;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenuItem mVendas;
    // End of variables declaration//GEN-END:variables
}
