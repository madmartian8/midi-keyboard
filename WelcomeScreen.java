/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboard;

import java.awt.event.ActionListener;

/**
 *
 * @author Yorick
 */
public class WelcomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeScreen
     */
    public WelcomeScreen() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void addActionListener(ActionListener listen){
        birthdayButton.addActionListener(listen);
        maryButton.addActionListener(listen);
        boatButton.addActionListener(listen);
        jingleButton.addActionListener(listen);
    }
    
    public boolean isMary(Object source){
        return source == maryButton;
    }
    public boolean isBirthday(Object source){
        return source == birthdayButton;
    }
    public boolean isBoat(Object source){
        return source == boatButton;
    }
    public boolean isJingle(Object source){
        return source == jingleButton;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        birthdayButton = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        maryButton = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        boatButton = new javax.swing.JToggleButton();
        jSeparator7 = new javax.swing.JSeparator();
        jingleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(378, 312));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Keyboard");
        jPanel1.add(jLabel1);

        jSeparator4.setPreferredSize(new java.awt.Dimension(5000, 20));
        jPanel1.add(jSeparator4);

        jLabel3.setText("made by");
        jPanel1.add(jLabel3);

        jSeparator6.setPreferredSize(new java.awt.Dimension(5000, 0));
        jPanel1.add(jSeparator6);

        jLabel4.setText("Glenn Williams, Martin Le, Yorick van de Water");
        jPanel1.add(jLabel4);

        jSeparator1.setPreferredSize(new java.awt.Dimension(5000, 40));
        jPanel1.add(jSeparator1);

        birthdayButton.setText("Happy Birthday");
        jPanel1.add(birthdayButton);

        jSeparator2.setPreferredSize(new java.awt.Dimension(5000, 0));
        jPanel1.add(jSeparator2);

        maryButton.setText("Mary Had A Little Lamb");
        jPanel1.add(maryButton);

        jSeparator3.setPreferredSize(new java.awt.Dimension(5000, 0));
        jPanel1.add(jSeparator3);

        boatButton.setText("Row, Row, Row Your Boat");
        jPanel1.add(boatButton);

        jSeparator7.setMinimumSize(new java.awt.Dimension(0, 0));
        jSeparator7.setPreferredSize(new java.awt.Dimension(5000, 0));
        jPanel1.add(jSeparator7);

        jingleButton.setText("Jingle Bells");
        jPanel1.add(jingleButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton birthdayButton;
    private javax.swing.JToggleButton boatButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToggleButton jingleButton;
    private javax.swing.JToggleButton maryButton;
    // End of variables declaration//GEN-END:variables
}
