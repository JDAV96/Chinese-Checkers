/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinese.checkers;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author david
 */
public class HighScores extends javax.swing.JFrame {
    static int[] HighScores = new int[10];
    static String[] Names = new String[10];
    static ArrayList<JLabel> NLabels = new ArrayList<>();
    static ArrayList<JLabel> SLabels = new ArrayList<>();
    /**
     * Creates new form HighScores
     */
    
    public HighScores() {
        initComponents();
        this.setSize(550,585);
        Names = Main.getNames();
        HighScores = Main.getScores();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        Score5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
        Name7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Score1 = new javax.swing.JLabel();
        Score2 = new javax.swing.JLabel();
        Score3 = new javax.swing.JLabel();
        Score4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Score6 = new javax.swing.JLabel();
        Score7 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        Name9 = new javax.swing.JLabel();
        Name10 = new javax.swing.JLabel();
        Score8 = new javax.swing.JLabel();
        Score9 = new javax.swing.JLabel();
        Score10 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("High Scores");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(150, 0, 240, 40);

        Score5.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score5.setText("1.");
        jLayeredPane1.add(Score5);
        Score5.setBounds(330, 280, 90, 30);

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel4.setText("2.");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(120, 160, 90, 30);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel5.setText("3.");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(120, 200, 90, 30);

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel6.setText("4.");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(120, 240, 90, 30);

        jLabel7.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel7.setText("5.");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(120, 280, 90, 30);

        jLabel8.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel8.setText("6.");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(120, 320, 90, 30);

        jLabel9.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel9.setText("8.");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(120, 400, 90, 30);

        jLabel10.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel10.setText("Name");
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(200, 80, 90, 30);

        Name1.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name1.setText("bla");
        jLayeredPane1.add(Name1);
        Name1.setBounds(200, 120, 90, 30);

        Name2.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name2.setText("1.");
        jLayeredPane1.add(Name2);
        Name2.setBounds(200, 160, 90, 30);

        jLabel13.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel13.setText("Rank");
        jLayeredPane1.add(jLabel13);
        jLabel13.setBounds(120, 80, 90, 30);

        Name4.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name4.setText("1.");
        jLayeredPane1.add(Name4);
        Name4.setBounds(200, 240, 90, 30);

        Name5.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name5.setText("1.");
        jLayeredPane1.add(Name5);
        Name5.setBounds(200, 280, 90, 30);

        Name6.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name6.setText("1.");
        jLayeredPane1.add(Name6);
        Name6.setBounds(200, 320, 90, 30);

        Name7.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name7.setText("1.");
        jLayeredPane1.add(Name7);
        Name7.setBounds(200, 360, 90, 30);

        jLabel18.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel18.setText("Score");
        jLayeredPane1.add(jLabel18);
        jLabel18.setBounds(330, 80, 90, 30);

        Score1.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score1.setText("1.");
        jLayeredPane1.add(Score1);
        Score1.setBounds(330, 120, 90, 30);

        Score2.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score2.setText("1.");
        jLayeredPane1.add(Score2);
        Score2.setBounds(330, 160, 90, 30);

        Score3.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score3.setText("1.");
        jLayeredPane1.add(Score3);
        Score3.setBounds(330, 200, 90, 30);

        Score4.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score4.setText("1.");
        jLayeredPane1.add(Score4);
        Score4.setBounds(330, 240, 90, 30);

        jLabel23.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel23.setText("1.");
        jLayeredPane1.add(jLabel23);
        jLabel23.setBounds(120, 120, 90, 30);

        Score6.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score6.setText("1.");
        jLayeredPane1.add(Score6);
        Score6.setBounds(330, 320, 90, 30);

        Score7.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score7.setText("1.");
        jLayeredPane1.add(Score7);
        Score7.setBounds(330, 360, 90, 30);

        Name3.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name3.setText("1.");
        jLayeredPane1.add(Name3);
        Name3.setBounds(200, 200, 90, 30);

        jLabel26.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel26.setText("9.");
        jLayeredPane1.add(jLabel26);
        jLabel26.setBounds(120, 440, 90, 30);

        jLabel27.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel27.setText("10.");
        jLayeredPane1.add(jLabel27);
        jLabel27.setBounds(120, 480, 90, 30);

        Name8.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name8.setText("7.");
        jLayeredPane1.add(Name8);
        Name8.setBounds(200, 400, 90, 30);

        Name9.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name9.setText("7.");
        jLayeredPane1.add(Name9);
        Name9.setBounds(200, 440, 90, 30);

        Name10.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Name10.setText("7.");
        jLayeredPane1.add(Name10);
        Name10.setBounds(200, 480, 90, 30);

        Score8.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score8.setText("7.");
        jLayeredPane1.add(Score8);
        Score8.setBounds(330, 400, 90, 30);

        Score9.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score9.setText("7.");
        jLayeredPane1.add(Score9);
        Score9.setBounds(330, 440, 90, 30);

        Score10.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Score10.setText("7.");
        jLayeredPane1.add(Score10);
        Score10.setBounds(330, 480, 90, 30);

        jLabel35.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel35.setText("7.");
        jLayeredPane1.add(jLabel35);
        jLabel35.setBounds(120, 360, 90, 30);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\High.jpg")); // NOI18N
        jLabel1.setText("High Scores");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void display() {
        Name1.setText(Names[0]);
        Name2.setText(Names[1]);
        Name3.setText(Names[2]);
        Name4.setText(Names[3]);
        Name5.setText(Names[4]);
        Name6.setText(Names[5]);
        Name7.setText(Names[6]);
        Name8.setText(Names[7]);
        Name9.setText(Names[8]);
        Name10.setText(Names[9]);
        Score1.setText(Integer.toString(HighScores[0]));
        Score2.setText(Integer.toString(HighScores[1]));
        Score3.setText(Integer.toString(HighScores[2]));
        Score4.setText(Integer.toString(HighScores[3]));
        Score5.setText(Integer.toString(HighScores[4]));
        Score6.setText(Integer.toString(HighScores[5]));
        Score7.setText(Integer.toString(HighScores[6]));
        Score8.setText(Integer.toString(HighScores[7]));
        Score9.setText(Integer.toString(HighScores[8]));
        Score10.setText(Integer.toString(HighScores[9]));
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
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HighScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HighScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name10;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name7;
    private javax.swing.JLabel Name8;
    private javax.swing.JLabel Name9;
    private javax.swing.JLabel Score1;
    private javax.swing.JLabel Score10;
    private javax.swing.JLabel Score2;
    private javax.swing.JLabel Score3;
    private javax.swing.JLabel Score4;
    private javax.swing.JLabel Score5;
    private javax.swing.JLabel Score6;
    private javax.swing.JLabel Score7;
    private javax.swing.JLabel Score8;
    private javax.swing.JLabel Score9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
