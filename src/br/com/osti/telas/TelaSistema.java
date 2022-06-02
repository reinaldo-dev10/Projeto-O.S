package br.com.osti.telas;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;

/**
@author Reinaldo - Chefe de Seção de TI
 **/
public class TelaSistema extends javax.swing.JFrame {
    /**
     * Creates new form principal
     */
    public TelaSistema() {
        initComponents();
        setIcon();//criar este método para poder desenvolver o próprio método para inserir icone no JFrame.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPlanodeFundo = new javax.swing.JPanel();
        jlData = new javax.swing.JLabel();
        jlSistema = new javax.swing.JLabel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jmUsuarios = new javax.swing.JMenuItem();
        jmSetores = new javax.swing.JMenuItem();
        jmMateriais = new javax.swing.JMenuItem();
        jmEquipamento = new javax.swing.JMenuItem();
        jmTrocarUsuario = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenuItem();
        jMenuOrdem = new javax.swing.JMenu();
        jmCadastroOS = new javax.swing.JMenuItem();
        jmConsultaOS = new javax.swing.JMenuItem();
        jmRelatorioOS = new javax.swing.JMenuItem();
        jMenuBackup = new javax.swing.JMenu();
        jmBackup = new javax.swing.JMenuItem();
        jmImportar = new javax.swing.JMenuItem();
        jMenuOSTI = new javax.swing.JMenu();
        jmAjuda = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("O. S. - TI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpPlanodeFundo.setBackground(new java.awt.Color(0, 102, 153));
        jpPlanodeFundo.setPreferredSize(new java.awt.Dimension(1915, 623));

        jlData.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jlData.setForeground(new java.awt.Color(255, 255, 255));

        jlSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/imgs/sobre.jpg"))); // NOI18N
        jlSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpPlanodeFundoLayout = new javax.swing.GroupLayout(jpPlanodeFundo);
        jpPlanodeFundo.setLayout(jpPlanodeFundoLayout);
        jpPlanodeFundoLayout.setHorizontalGroup(
            jpPlanodeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPlanodeFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpPlanodeFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSistema)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPlanodeFundoLayout.setVerticalGroup(
            jpPlanodeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPlanodeFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuPrincipal.setToolTipText("");

        jMenuCadastro.setBorder(null);
        jMenuCadastro.setText("CADASTRO");
        jMenuCadastro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jmUsuarios.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/usuario.png"))); // NOI18N

        jmUsuarios.setText("USUÁRIOS");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmUsuarios);

        jmSetores.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmSetores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/setores.png"))); // NOI18N
        jmSetores.setText("SETORES");
        jMenuCadastro.add(jmSetores);

        jmMateriais.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/materiais.png"))); // NOI18N
        jmMateriais.setText("MATERIAIS");
        jMenuCadastro.add(jmMateriais);

        jmEquipamento.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/equipamentos.png"))); // NOI18N
        jmEquipamento.setText("EQUIPAMENTOS");
        jMenuCadastro.add(jmEquipamento);

        jmTrocarUsuario.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmTrocarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/trocar usuario.png"))); // NOI18N
        jmTrocarUsuario.setText("TROCAR USUÁRIO");
        jmTrocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTrocarUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmTrocarUsuario);

        jmSair.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/sair 03.png"))); // NOI18N
        jmSair.setText("SAIR");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jmSair);

        jMenuPrincipal.add(jMenuCadastro);

        jMenuOrdem.setBorder(null);
        jMenuOrdem.setText("ORDEM DE SERVIÇO");
        jMenuOrdem.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        jmCadastroOS.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmCadastroOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/cadastro.png"))); // NOI18N
        jmCadastroOS.setText("CADASTRO O.S.");
        jmCadastroOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroOSActionPerformed(evt);
            }
        });
        jMenuOrdem.add(jmCadastroOS);

        jmConsultaOS.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmConsultaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/consulta.png"))); // NOI18N
        jmConsultaOS.setText("CONSULTA O.S.");
        jMenuOrdem.add(jmConsultaOS);

        jmRelatorioOS.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmRelatorioOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/relatorios.png"))); // NOI18N
        jmRelatorioOS.setText("RELATÓRIOS O.S.");
        jMenuOrdem.add(jmRelatorioOS);

        jMenuPrincipal.add(jMenuOrdem);

        jMenuBackup.setBorder(null);
        jMenuBackup.setText("BACKUPS");
        jMenuBackup.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        jmBackup.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/backup.png"))); // NOI18N
        jmBackup.setText("GERAR BACKUP OS");
        jMenuBackup.add(jmBackup);

        jmImportar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/importar.png"))); // NOI18N
        jmImportar.setText("IMPORTAR BACKUP OS");
        jMenuBackup.add(jmImportar);

        jMenuPrincipal.add(jMenuBackup);

        jMenuOSTI.setBorder(null);
        jMenuOSTI.setText("O.S. TI");
        jMenuOSTI.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jMenuOSTI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuOSTIMousePressed(evt);
            }
        });

        jmAjuda.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/ajuda2.png"))); // NOI18N
        jmAjuda.setText("AJUDA (MANUAL)");
        jmAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAjudaActionPerformed(evt);
            }
        });
        jMenuOSTI.add(jmAjuda);

        jmSobre.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/icones/sobre.png"))); // NOI18N
        jmSobre.setText("SOBRE");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jMenuOSTI.add(jmSobre);

        jMenuPrincipal.add(jMenuOSTI);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPlanodeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPlanodeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1951, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuOSTIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOSTIMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuOSTIMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // as linhas abaixo são para fixar a data do sistema no rodapé da tela principal.
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jlData.setText(formato.format(dataSistema));
    }//GEN-LAST:event_formWindowOpened

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        // as linhas abaixo são para encerrar o sistema através de um JMenuItem.           
        int i = JOptionPane.showConfirmDialog(null , "Deseja encerrar o Sistema?" , "Sair" ,JOptionPane.YES_NO_OPTION);
 	System.out.println("I" + i);
 	if (i == JOptionPane.YES_OPTION ) {
            System.exit(0);                      
 	} else {			
            System.out.println("NÃO FECHA JANELA");				
            repaint();				
 	}									
    }//GEN-LAST:event_jmSairActionPerformed

    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
        // as linhas abaixo são para abrir a tela do menu sobre.
        TelaSobre telasobre = new TelaSobre();
        telasobre.setVisible(true);
    }//GEN-LAST:event_jmSobreActionPerformed

    private void jmAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAjudaActionPerformed
        // as linhas abaixo são para abrir a tela do menu ajuda.
        TelaAjuda telaajuda = new TelaAjuda();
        telaajuda.setVisible(true);
    }//GEN-LAST:event_jmAjudaActionPerformed

    private void jmTrocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTrocarUsuarioActionPerformed
        // as linhas abaixo são para executar a troca de usuário, abrir novamente a tela de login,
        //com as novas credenciaias de outros usuários.
        int i = JOptionPane.showConfirmDialog(null , "Deseja trocar de Usuário?" , "Sair" ,JOptionPane.YES_NO_OPTION);
 	System.out.println("I" + i);
 	if (i == JOptionPane.YES_OPTION ) {
            TelaLogin telalogin = new TelaLogin();
            telalogin.setVisible(true);
 	} else {			
            System.out.println("NÃO FECHA JANELA");				
            repaint();				
 	}
    }//GEN-LAST:event_jmTrocarUsuarioActionPerformed

    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
       // as linhas abaixo são para abrir a tela de cadastro de usuários.
       CadUsuarios cadastrousuarios = new CadUsuarios();
       cadastrousuarios.setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
       
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jmCadastroOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroOSActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuBackup;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuOSTI;
    private javax.swing.JMenu jMenuOrdem;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlSistema;
    private javax.swing.JMenuItem jmAjuda;
    private javax.swing.JMenuItem jmBackup;
    private javax.swing.JMenuItem jmCadastroOS;
    private javax.swing.JMenuItem jmConsultaOS;
    private javax.swing.JMenuItem jmEquipamento;
    private javax.swing.JMenuItem jmImportar;
    private javax.swing.JMenuItem jmMateriais;
    private javax.swing.JMenuItem jmRelatorioOS;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenuItem jmSetores;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenuItem jmTrocarUsuario;
    private javax.swing.JMenuItem jmUsuarios;
    private javax.swing.JPanel jpPlanodeFundo;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/osti/icones/root.png")));//meu método para trocar o icone
    }
}
