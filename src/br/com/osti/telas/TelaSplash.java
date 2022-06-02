
package br.com.osti.telas;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reinaldo
 */
public class TelaSplash extends javax.swing.JFrame {

    /**
     * Creates new form TelaSplash
     */
    public TelaSplash() {
        initComponents();
        setIcon();//criar este método para poder desenvolver o próprio método para inserir icone no JFrame
        new Thread (){        
            public void run (){                
                for (int i = 0; i<100; i++){                
                    try {
                        sleep (60); //essa linha de comando é destinada a contagem de tempo para inicia e finalizar a barra de progresso
                        jbCarregar.setValue(i);
                        
                        if (jbCarregar.getValue()<=15){//linha de comando da contagem a partir de 15 exibir o setText (mensagem)
                        jlSplash.setText(" CARREGANDO. . .");                     
                        }
                        else{   
                        }                                                 
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaSplash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //após carregar a barra de progresso, as linhas de comando abaixo 
                //fecham a tela de splash e chamam a próxima janela de login
                dispose();
                TelaLogin telalogin = new TelaLogin();
                telalogin.setVisible(true);                                 
            }   
        }.start();
    }            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlLogoSplash = new javax.swing.JLabel();
        jbCarregar = new javax.swing.JProgressBar();
        jlSplash = new javax.swing.JLabel();
        jlEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jlLogoSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osti/imgs/logosplash.jpg"))); // NOI18N

        jbCarregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbCarregar.setForeground(new java.awt.Color(0, 102, 153));
        jbCarregar.setToolTipText("");
        jbCarregar.setBorderPainted(false);
        jbCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCarregar.setName(""); // NOI18N
        jbCarregar.setStringPainted(true);

        jlSplash.setBackground(new java.awt.Color(0, 0, 0));
        jlSplash.setFont(new java.awt.Font("Lastica", 1, 15)); // NOI18N
        jlSplash.setForeground(new java.awt.Color(255, 255, 255));
        jlSplash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlEmpresa.setFont(new java.awt.Font("Lastica", 1, 24)); // NOI18N
        jlEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jlEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmpresa.setText("ROOT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlLogoSplash)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jlSplash, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlEmpresa)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlLogoSplash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jbCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlSplash, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSplash().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jbCarregar;
    private javax.swing.JLabel jlEmpresa;
    private javax.swing.JLabel jlLogoSplash;
    private javax.swing.JLabel jlSplash;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/osti/icones/root.png")));//meu método para trocar o icone
    }
}
