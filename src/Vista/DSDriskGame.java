package Vista;

import Model.User;

/**
 *
 * @author GROUP 1 UNC
 */
public class DSDriskGame extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form DSDriskGame
     */
    public DSDriskGame() {
        initComponents();
        user = new User();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1Label = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        logIn = new javax.swing.JButton();
        createAccount = new javax.swing.JButton();
        aboutLabel = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DSDrisk Game");
        setMinimumSize(new java.awt.Dimension(489, 344));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        getContentPane().add(title1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 78));

        title2Label.setText("What would you like to do?");
        getContentPane().add(title2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        logIn.setText("Log in");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        getContentPane().add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 40));

        createAccount.setText("Create account");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        getContentPane().add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 120, 40));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 10));

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Warriors.jpg"))); // NOI18N
        getContentPane().add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 110));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 510, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        LogInGUI login = new LogInGUI(user);
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logInActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        CreateAccountGUI c = new CreateAccountGUI(user);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSDriskGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSDriskGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton createAccount;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    // End of variables declaration//GEN-END:variables
}
