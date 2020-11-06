
package formulario;
import dao.MercadoriasDao;
import dao.RealizarVendasDao;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Funcionario;
import mapeamento.Mercadorias;
import mapeamento.Produto;
import mapeamento.RealizarVendas;
import pesquisa.pesquisaFuncionario;
import pesquisa.pesquisaProduto;
import utilitario.Conectar;

/**
 *
 * @author T-Gamer
 */
public class FormMercadorias extends javax.swing.JFrame {

    
    /**
     * Creates new form FormMercadoriass
     */
    public FormMercadorias() {
        initComponents();
        btAtualizar.setVisible(false);
        preencherTabela();
       // preencherTabela2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        asdasd = new javax.swing.JLabel();
        edQuant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edData = new javax.swing.JFormattedTextField();
        edHora = new javax.swing.JFormattedTextField();
        edFuncionario = new javax.swing.JTextField();
        btFunc = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        edIdFunc = new javax.swing.JTextField();
        edProduto = new javax.swing.JTextField();
        btProd = new javax.swing.JButton();
        edIdProd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edPesquisa = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        btDeletar = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savetheapplication_guardar_2958.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/database_refresh_icon_137697.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 255, 0));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1492790846-9cancel_84247.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        asdasd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        asdasd.setText("Quantidade");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Hora");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Data");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Funcionário");

        try {
            edData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            edHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        edFuncionario.setEditable(false);
        edFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btFunc.setText("jButton2");
        btFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("ID ");

        edIdFunc.setEditable(false);
        edIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edIdFuncActionPerformed(evt);
            }
        });

        edProduto.setEditable(false);
        edProduto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btProd.setText("jButton2");
        btProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdActionPerformed(evt);
            }
        });

        edIdProd.setEditable(false);
        edIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edIdProdActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Produto");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("ID ");

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setForeground(new java.awt.Color(0, 204, 51));

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastro de Mercadorias");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asdasd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(edHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(edFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(edIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdasd)
                    .addComponent(edQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProd)
                    .addComponent(edIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(edProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(edFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(edIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btFunc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(edData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(edHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Cadastrar Mercadorias", jPanel1);

        jLabel1.setText("PESQUISAR:");

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "QUANTIDADE", "DATA", "HORA", "FUNCIONARIO", "PRODUTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela1);

        btDeletar.setText("Excluir");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edPesquisa)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Mercadorias", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        MercadoriasDao pdao = new MercadoriasDao();
        Mercadorias p = new Mercadorias();
        
        
        
        p.setQuant_merc(Integer.parseInt(edQuant.getText()));
        p.setData_merc(edData.getText());
        p.setHora_merc(edHora.getText());
        p.setCod_prod_fk(Integer.parseInt(edIdProd.getText()));
        p.setCod_fun_fk(Integer.parseInt(edIdFunc.getText()));
       
        pdao.salvar(p);
        preencherTabela();
        jTabbedPane1.setSelectedIndex(1);
        
      
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        MercadoriasDao pdao = new MercadoriasDao();
        Mercadorias p = new Mercadorias();
       
        
        p.setQuant_merc(Integer.parseInt(edQuant.getText()));
        p.setData_merc(edData.getText());
        p.setHora_merc(edHora.getText());
        p.setCod_fun_fk(Integer.parseInt(edFuncionario.getText()));
        p.setCod_prod_fk(Integer.parseInt(edIdProd.getText()));
        
        pdao.atualizar(p);
        jTabbedPane1.setSelectedIndex(1);
        btAtualizar.setVisible(true);
        btSalvar.setVisible(false);
        preencherTabela();
        
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncActionPerformed

        pesquisaFuncionario form = new pesquisaFuncionario (this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);

        Funcionario p = form.getF();
        edFuncionario.setText(""+p.getNome_fun());
        edIdFunc.setText(""+p.getCod_fun());

    }//GEN-LAST:event_btFuncActionPerformed

    private void edIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edIdFuncActionPerformed

    private void btProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdActionPerformed

        pesquisaProduto form = new pesquisaProduto (this, rootPaneCheckingEnabled);
        form.setLocationRelativeTo(form);
        form.setVisible(rootPaneCheckingEnabled);

        Produto p = form.getP();
        edIdProd.setText(""+p.getCod_prod());
        edProduto.setText(""+p.getNome_prod());


    }//GEN-LAST:event_btProdActionPerformed

    private void edIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edIdProdActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edQuant.setText("");
        edFuncionario.setText("");
        edHora.setText("");
        edData.setText("");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
         int opcao = tabela1.getSelectedRow();
        if(opcao >= 0){
        edQuant.setText(tabela1.getValueAt(opcao, 1).toString());
        edFuncionario.setText(tabela1.getValueAt(opcao, 4).toString());
        edProduto.setText(tabela1.getValueAt(opcao, 5).toString());
        edHora.setText(tabela1.getValueAt(opcao, 3).toString());
        edData.setText(tabela1.getValueAt(opcao, 2).toString());
        jTabbedPane1.setSelectedIndex(0);
        btAtualizar.setVisible(true);
        btSalvar.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
          
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int opcao = tabela1.getSelectedRow();
        if (opcao >= 0) {
            Mercadorias m = new Mercadorias();
            m.setCod_merc(Integer.parseInt(tabela1.getValueAt(opcao, 0).toString()));
            MercadoriasDao mdao = new MercadoriasDao();
            mdao.deletar(m);
            preencherTabela();
          
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btDeletarActionPerformed

   public void preencherTabela(){
        MercadoriasDao pdao = new MercadoriasDao();
        List<Mercadorias> lista = pdao.listarTodos("");
        DefaultTableModel modelo = (DefaultTableModel) tabela1.getModel();
        modelo.setRowCount(0);
        for (Mercadorias p : lista) {

            modelo.addRow(new Object[]{p.getCod_merc(),p.getQuant_merc(),p.getData_merc(), p.getHora_merc(), p.getNome_fun(),p.getNome_prod()});
        }

}
      
  /*   public void preencherTabela2(){
        MercadoriasDao pdao = new MercadoriasDao();
        List<Mercadorias> lista = pdao.ListarNomeProduto("");
        DefaultTableModel modelo = (DefaultTableModel) tabela2.getModel();
        modelo.setRowCount(0);
        for (Mercadorias p : lista) {
        
            modelo.addRow(new Object[]{p.getNome_prod()});
        }
          
}
     */
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormMercadorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMercadorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMercadorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMercadorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMercadorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdasd;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFunc;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btProd;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField edData;
    private javax.swing.JTextField edFuncionario;
    private javax.swing.JFormattedTextField edHora;
    private javax.swing.JTextField edIdFunc;
    private javax.swing.JTextField edIdProd;
    private javax.swing.JTextField edPesquisa;
    private javax.swing.JTextField edProduto;
    private javax.swing.JTextField edQuant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables
}
