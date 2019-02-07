/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinese.checkers;
import java.awt.Color;
import java.io.*;

/**
 *
 * @author david
 */
public class End extends javax.swing.JFrame {
    final static String FILE = "C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\HighScores.txt";
    static int Score;
    static int[] HighScores = new int[10];
    static String[] Names = new String[10];
    /**
     * Creates new form End
     */
    public End() {
        initComponents();
        HSButton.setVisible(false);
        HSField.setVisible(false);
        HSPrompt.setVisible(false);
        HSNotice.setVisible(false);
    }
    
    public static void display(int x, int s, Color c) {
        Names = Main.getNames();
        HighScores = Main.getScores();
        Score = s;
        String player = "";
                switch (x) {
            case 0: player = "Orange"; break;
            case 1: player = "Purple"; break;
            case 2: player = "Red"; break;
            case 3: player = "Green"; break;
            case 4: player = "Blue"; break;
            case 5: player = "Yellow"; break;
        }
        Label.setText(player + " player has won!");
        Panel.setBackground(c);
        if (HighScores[9] > Score) {
            HSButton.setVisible(true);
            HSField.setVisible(true);
            HSPrompt.setVisible(true);
            HSNotice.setVisible(true);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        HSField = new javax.swing.JTextField();
        HSPrompt = new javax.swing.JLabel();
        HSButton = new javax.swing.JButton();
        HSNotice = new javax.swing.JLabel();
        NewButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label.setBackground(new java.awt.Color(108, 0, 0));
        Label.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Label.setForeground(new java.awt.Color(240, 240, 240));

        HSPrompt.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        HSPrompt.setForeground(new java.awt.Color(240, 240, 240));
        HSPrompt.setText("Enter Your Name:");

        HSButton.setBackground(new java.awt.Color(108, 0, 0));
        HSButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        HSButton.setForeground(new java.awt.Color(153, 153, 153));
        HSButton.setText("Submit to High Scores");
        HSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HSButtonActionPerformed(evt);
            }
        });

        HSNotice.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        HSNotice.setForeground(new java.awt.Color(240, 240, 240));
        HSNotice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HSNotice.setText("New High Score!");

        NewButton.setBackground(new java.awt.Color(180, 0, 0));
        NewButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        NewButton.setForeground(new java.awt.Color(153, 153, 153));
        NewButton.setText("New Game");
        NewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(180, 0, 0));
        ExitButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(153, 153, 153));
        ExitButton.setText("Exit Game");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(HSPrompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(HSField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(HSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(HSNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(HSNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HSField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HSPrompt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(HSButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButtonActionPerformed
        this.setVisible(false);
        Main.NewGame();        // TODO add your handling code here:
    }//GEN-LAST:event_NewButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void HSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HSButtonActionPerformed
        for (int x = 9; x >= 0; x--) {
           if (HighScores [x] > Score) {
               if (x == 9) {
               HighScores[x] = Score;
               Names[x] = HSField.getText();
               }
               else {
                   HighScores[x+1] = HighScores[x];
                   HighScores[x] = Score;
                   Names[x+1] = Names[x];
                   Names[x] = HSField.getText();
               }
           }
       }
       Main.SaveHS(HighScores, Names);
        HSButton.setVisible(false);
        HSField.setVisible(false);
        HSPrompt.setVisible(false);
        HSNotice.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_HSButtonActionPerformed

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
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new End().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private static javax.swing.JButton HSButton;
    private static javax.swing.JTextField HSField;
    private static javax.swing.JLabel HSNotice;
    private static javax.swing.JLabel HSPrompt;
    private static javax.swing.JLabel Label;
    private javax.swing.JButton NewButton;
    private static javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables

    
}
