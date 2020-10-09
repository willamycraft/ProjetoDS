/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;
import dao.FornecedorDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Fornecedor;

/**
 *
 * @author JONATAS
 */
public class FormFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherTabela();
        btAtualizar.setVisible(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        edRazao = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        edCep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        edId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        edTelefone = new javax.swing.JFormattedTextField();
        edCnpj = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        edEmail = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edResponsavel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        edNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        edPesquisar = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCancelar.setBackground(new java.awt.Color(255, 255, 0));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1492790846-9cancel_84247.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 120, 50));
        jPanel1.add(edRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 30));

        btAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/database_refresh_icon_137697.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, 50));

        try {
            edCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));
        jPanel1.add(edEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 30));

        edId.setEditable(false);
        jPanel1.add(edId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 57, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("NOME FANTASIA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        try {
            edTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, 30));

        try {
            edCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("RAZÃO SOCIAL:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel1.add(edEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, 30));

        btSair.setBackground(new java.awt.Color(255, 0, 0));
        btSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 120, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("CNPJ:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("RESPONSAVEL:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("CEP:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("CIDADE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("ENDEREÇO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        jPanel1.add(edResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 170, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("TELEFONE:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jPanel1.add(edCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 170, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("E-MAIL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savetheapplication_guardar_2958.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, 50));
        jPanel1.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 249, 30));

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setForeground(new java.awt.Color(0, 204, 51));

        jLabel12.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cadastrar fornecedor");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jTabbedPane1.addTab("Cadastrar Fornecedor", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btNovo.setBackground(new java.awt.Color(0, 153, 51));
        btNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1490793813-user-interface20_82328 (1).png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 120, 45));

        btExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_4219.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 120, 45));

        btEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/353430-checkbox-edit-pen-pencil_107516.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, 44));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("PESQUISAR:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 74, -1, -1));
        jPanel2.add(edPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 67, 227, 30));

        btPesquisa.setText("...");
        jPanel2.add(btPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 67, 37, 30));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Fant.", "Raz. Social", "CNPJ", "CEP", "Endereço", "Telefone", "E-Mail", "Respon.", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, 630, 200));

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));
        jPanel7.setForeground(new java.awt.Color(0, 204, 51));

        jLabel13.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lista de fornecedores");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

        jTabbedPane1.addTab("Listar Fornecedor", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edNome.setText("");
        edRazao.setText("");
        edCnpj.setText("");
        edCep.setText("");
        edEndereco.setText("");
        edTelefone.setText("");
        edEmail.setText("");
        edResponsavel.setText("");
        edCidade.setText("");
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = tabela.getSelectedRow();
        if (opcao >= 0) {
            Fornecedor f = new Fornecedor();
            f.setCod_for(Integer.parseInt(tabela.getValueAt(opcao, 0).toString()));
            f.setNomeFanta_for(tabela.getValueAt(opcao, 1).toString());
            FornecedorDao fdao = new FornecedorDao();
            fdao.deletar(f);
            preencherTabela();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int opcao = tabela.getSelectedRow();
        if (opcao >= 0){
            edId.setText(tabela.getValueAt(opcao, 0).toString());
            edNome.setText(tabela.getValueAt(opcao, 1).toString());
            edRazao.setText(tabela.getValueAt(opcao, 2).toString());
            edCnpj.setText(tabela.getValueAt(opcao, 3).toString());
            edCep.setText(tabela.getValueAt(opcao, 4).toString());
            edEndereco.setText(tabela.getValueAt(opcao, 5).toString());
            edTelefone.setText(tabela.getValueAt(opcao, 6).toString());
            edEmail.setText(tabela.getValueAt(opcao, 7).toString());
            edResponsavel.setText(tabela.getValueAt(opcao, 8).toString());
            edCidade.setText(tabela.getValueAt(opcao, 9).toString());
            jTabbedPane1.setSelectedIndex(0);
            btAtualizar.setVisible(true);
            btSalvar.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Fornecedor f = new Fornecedor();
        f.setNomeFanta_for(edNome.getText());
        f.setRazaoSocial_for(edRazao.getText());
        f.setCnpj_for(edCnpj.getText());
        f.setCep_for(edCep.getText());
        f.setEndereco_for(edEndereco.getText());
        f.setTelefone_for(edTelefone.getText());
        f.setEmail_for(edEmail.getText());
        f.setResp_for(edResponsavel.getText());
        f.setCidade_for(edCidade.getText());
        FornecedorDao fdao = new FornecedorDao();
        fdao.salvar(f);
        preencherTabela();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "DESEJA FECHAR ESSA APLICAÇÃO ?"+ JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Fornecedor f = new Fornecedor();
        f.setCod_for(Integer.parseInt(edId.getText()));
        f.setNomeFanta_for(edNome.getText());
        f.setRazaoSocial_for(edRazao.getText());
        f.setCnpj_for(edCnpj.getText());
        f.setCep_for(edCep.getText());
        f.setEndereco_for(edEndereco.getText());
        f.setTelefone_for(edTelefone.getText());
        f.setEmail_for(edEmail.getText());
        f.setResp_for(edResponsavel.getText());
        f.setCidade_for(edCidade.getText());
        FornecedorDao fdao = new FornecedorDao();
        fdao.atualizar(f);
        jTabbedPane1.setSelectedIndex(1);
        btAtualizar.setVisible(false);
        btSalvar.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edNome.setText("");
        edRazao.setText("");
        edCnpj.setText("");
        edCep.setText("");
        edEndereco.setText("");
        edTelefone.setText("");
        edEmail.setText("");
        edResponsavel.setText("");
        edCidade.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

   public void preencherTabela(){
        FornecedorDao fdao = new FornecedorDao();
        List<Fornecedor> lista = fdao.listarTodos("");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Fornecedor f : lista) {
            modelo.addRow(new Object[]{f.getCod_for(),f.getNomeFanta_for(),f.getRazaoSocial_for(), f.getCnpj_for(), f.getCep_for(),f.getEndereco_for(), f.getTelefone_for() , f.getEmail_for(), f.getResp_for(), f.getCidade_for()});
        }
}
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
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormFornecedor dialog = new FormFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField edCep;
    private javax.swing.JTextField edCidade;
    private javax.swing.JFormattedTextField edCnpj;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edId;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisar;
    private javax.swing.JTextField edRazao;
    private javax.swing.JTextField edResponsavel;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
