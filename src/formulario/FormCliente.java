/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;
import dao.ClienteDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Cliente;

/**
 *
 * @author JONATAS
 */
public class FormCliente extends javax.swing.JDialog {

    /**
     * Creates new form FormCliente
     */
    public FormCliente(java.awt.Frame parent, boolean modal) {
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
        edNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edCpf = new javax.swing.JFormattedTextField();
        cbSexo = new javax.swing.JComboBox<>();
        edRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edEndereco = new javax.swing.JTextField();
        edDataNasc = new javax.swing.JFormattedTextField();
        edEmail = new javax.swing.JTextField();
        btFechar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        edId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edTelefone = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(edNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 399, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("SEXO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        try {
            edCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, 30));

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbSexo.setSelectedIndex(-1);
        jPanel1.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 122, 30));
        jPanel1.add(edRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 122, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("DATA DE NASCIMENTO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        jPanel1.add(edEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 399, 30));

        try {
            edDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 97, 30));
        jPanel1.add(edEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 399, 30));

        btFechar.setBackground(new java.awt.Color(255, 0, 0));
        btFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btFechar.setForeground(new java.awt.Color(255, 255, 255));
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/4115235-exit-logout-sign-out_114030.png"))); // NOI18N
        btFechar.setText("Sair");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 56));

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/savetheapplication_guardar_2958.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 56));

        btAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/database_refresh_icon_137697.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 56));

        btCancelar.setBackground(new java.awt.Color(255, 255, 0));
        btCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1492790846-9cancel_84247.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, 56));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("NOME:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("CPF:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("RG:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("ENDEREÇO:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("TELEFONE:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 14));

        edId.setEditable(false);
        jPanel1.add(edId, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 40, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("E-MAIL:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        try {
            edTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(edTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 143, 30));

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));
        jPanel5.setForeground(new java.awt.Color(0, 204, 51));

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastrar Cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jTabbedPane1.addTab("Cadastrar Cliente", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/353430-checkbox-edit-pen-pencil_107516.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 351, 112, 50));

        btExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_4219.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 351, 112, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("PESQUISAR:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        edPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edPesquisarActionPerformed(evt);
            }
        });
        edPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edPesquisarKeyPressed(evt);
            }
        });
        jPanel2.add(edPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 272, 30));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "SEXO", "NASCIMENTO", "ENDEREÇO", "TELEFONE", "E-MAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 630, 209));

        btNovo.setBackground(new java.awt.Color(0, 153, 51));
        btNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btNovo.setForeground(new java.awt.Color(255, 255, 255));
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1490793813-user-interface20_82328 (1).png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 352, 112, 49));

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setForeground(new java.awt.Color(0, 204, 51));

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lista de clientes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        jTabbedPane1.addTab("Listar Cliente", jPanel2);

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

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "DESEJA FECHAR ESSA APLICAÇÃO?"+JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Cliente cli = new Cliente();
        cli.setNome_cli(edNome.getText());
        cli.setCpf_cli(edCpf.getText());
        cli.setRg_cli(edRg.getText());
        cli.setEndereco_cli(edEndereco.getText());
        cli.setDatanasc_cli(edDataNasc.getText());
        cli.setTelefone_cli(edTelefone.getText());
        cli.setEmail_cli(edEmail.getText());
        cli.setSexo_cli(cbSexo.getSelectedItem().toString());
        ClienteDao cdao = new ClienteDao();
        cdao.salvar(cli);
        preencherTabela();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Cliente cli = new Cliente();
        cli.setCod_cli(Integer.parseInt(edId.getText()));
        cli.setNome_cli(edNome.getText());
        cli.setCpf_cli(edCpf.getText());
        cli.setRg_cli(edRg.getText());
        cli.setEndereco_cli(edEndereco.getText());
        cli.setDatanasc_cli(edDataNasc.getText());
        cli.setTelefone_cli(edTelefone.getText());
        cli.setEmail_cli(edEmail.getText());
        cli.setSexo_cli(cbSexo.getSelectedItem().toString());
        ClienteDao cdao = new ClienteDao();
        cdao.atualizar(cli);
        jTabbedPane1.setSelectedIndex(1);
        btAtualizar.setVisible(false);
        btSalvar.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edId.setText("");
        edCpf.setText("");
        edNome.setText("");
        edEmail.setText("");
        edEndereco.setText("");
        edPesquisar.setText("");
        edRg.setText("");
        edTelefone.setText("");
        edDataNasc.setText("");
        cbSexo.setSelectedItem(-1);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int opcao = tabela.getSelectedRow();
        if(opcao >= 0){
            edId.setText(tabela.getValueAt(opcao, 0).toString());
            edNome.setText(tabela.getValueAt(opcao, 1).toString());
            edCpf.setText(tabela.getValueAt(opcao, 2).toString());
            edRg.setText(tabela.getValueAt(opcao, 3).toString());
            cbSexo.setSelectedItem(tabela.getValueAt(opcao, 4).toString());
            edDataNasc.setText(tabela.getValueAt(opcao, 5).toString());
            edEndereco.setText(tabela.getValueAt(opcao, 6).toString());
            edTelefone.setText(tabela.getValueAt(opcao, 7).toString());
            edEmail.setText(tabela.getValueAt(opcao, 8).toString());
            jTabbedPane1.setSelectedIndex(0);
            btAtualizar.setVisible(true);
            btSalvar.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int opcao = tabela.getSelectedRow();
        if (opcao >= 0) {
            Cliente cli = new Cliente();
            cli.setCod_cli(Integer.parseInt(tabela.getValueAt(opcao, 0).toString()));
            cli.setNome_cli(tabela.getValueAt(opcao, 1).toString());
            ClienteDao cdao = new ClienteDao();
            cdao.deletar(cli);
            preencherTabela();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btSalvar.setVisible(true);
        btAtualizar.setVisible(false);
        edId.setText("");
        edCpf.setText("");
        edNome.setText("");
        edEmail.setText("");
        edEndereco.setText("");
        edPesquisar.setText("");
        edRg.setText("");
        edTelefone.setText("");
        edDataNasc.setText("");
        cbSexo.setSelectedItem(-1);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btNovoActionPerformed

    private void edPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edPesquisarActionPerformed
        preencherTabela2(edPesquisar.getText());
    }//GEN-LAST:event_edPesquisarActionPerformed

    private void edPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edPesquisarKeyPressed
        preencherTabela2(edPesquisar.getText());
    }//GEN-LAST:event_edPesquisarKeyPressed

    public void preencherTabela(){
        ClienteDao cdao = new ClienteDao();
        List<Cliente> lista = cdao.listarTodos("");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getCod_cli(), c.getNome_cli(), c.getCpf_cli(), c.getRg_cli(), c.getSexo_cli(), c.getDatanasc_cli(), c.getEndereco_cli(), c.getTelefone_cli(), c.getEmail_cli()});
        }
}
    public void preencherTabela2(String nome){
        ClienteDao cdao = new ClienteDao();
        List<Cliente> lista = cdao.BuscarNome(nome);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getCod_cli(), c.getNome_cli(), c.getCpf_cli(), c.getRg_cli(), c.getSexo_cli(), c.getDatanasc_cli(), c.getEndereco_cli(), c.getTelefone_cli(), c.getEmail_cli()});
        }
}
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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCliente dialog = new FormCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JFormattedTextField edCpf;
    private javax.swing.JFormattedTextField edDataNasc;
    private javax.swing.JTextField edEmail;
    private javax.swing.JTextField edEndereco;
    private javax.swing.JTextField edId;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edPesquisar;
    private javax.swing.JTextField edRg;
    private javax.swing.JFormattedTextField edTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
