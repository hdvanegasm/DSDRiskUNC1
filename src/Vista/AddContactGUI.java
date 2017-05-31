package Vista;

import Model.User;

/**
 *
 * @author GROUP 1 UNC
 */
public class AddContactGUI extends javax.swing.JFrame {

    /**
     * Creates new form AddContactGUI
     */
    public AddContactGUI(User user) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image1 = new javax.swing.JLabel();
        titile1Label = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        aboutLabel = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Warriors.jpg"))); // NOI18N
        getContentPane().add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 110));

        titile1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        titile1Label.setForeground(new java.awt.Color(255, 0, 0));
        titile1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titile1Label.setText("DSDRisk Game");
        getContentPane().add(titile1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscarIcono.png"))); // NOI18N
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 30));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 65, -1));

        goBack.setText("Go back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        imageBackground.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_goBackActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_addActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton add;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JLabel search;
    private javax.swing.JLabel titile1Label;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}