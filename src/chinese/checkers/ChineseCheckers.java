/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinese.checkers;

/**
 *
 * @author david
 */
public class ChineseCheckers extends javax.swing.JFrame {

   
    public ChineseCheckers() {
        initComponents();
        this.setSize(900,655);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Load = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Load1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Load.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        Load.setText("High Scores");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Load);
        Load.setBounds(10, 180, 230, 50);

        New.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        New.setText("New Game");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jLayeredPane1.add(New);
        New.setBounds(370, 350, 230, 50);

        Load1.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        Load1.setText("Load Game");
        Load1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Load1);
        Load1.setBounds(370, 430, 230, 50);

        jLabel1.setFont(new java.awt.Font("Rage Italic", 3, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chinese Checkers");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(290, 20, 440, 120);

        ExitButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        ExitButton.setText("Exit Game");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ExitButton);
        ExitButton.setBounds(650, 530, 150, 50);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\Home.jpg")); // NOI18N
        jLayeredPane1.add(background);
        background.setBounds(0, 0, 900, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        Main.DisplayScores();// TODO add your handling code here:
    }//GEN-LAST:event_LoadActionPerformed

    private void Load1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load1ActionPerformed
        Main.LoadGame();// TODO add your handling code here:
    }//GEN-LAST:event_Load1ActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        Main.NewGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_NewActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChineseCheckers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChineseCheckers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChineseCheckers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChineseCheckers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChineseCheckers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Load;
    private javax.swing.JButton Load1;
    private javax.swing.JButton New;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
