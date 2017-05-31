package Vista;

import Model.Player;
import Model.User;

/**
 *
 * @author GROUP 1 UNC
 */
public class InitialSetupHostGUI extends javax.swing.JFrame {
    
    User user;
    Player player;
    /**
     * Creates new form InitialSetupGUI
     */
    public InitialSetupHostGUI(User user) {
        this.user = user;
       // player = new Player (this.user);
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

        chooseMap = new javax.swing.JComboBox<>();
        title2Label = new javax.swing.JLabel();
        title1Label = new javax.swing.JLabel();
        chooseMapLabel = new javax.swing.JLabel();
        typeOfGame = new javax.swing.JComboBox<>();
        typeOfGameLabel = new javax.swing.JLabel();
        numberOfPlayersLabel = new javax.swing.JLabel();
        userTable = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        inviteContact = new javax.swing.JButton();
        startSession = new javax.swing.JButton();
        deleteSession = new javax.swing.JButton();
        aboutLabel = new javax.swing.JLabel();
        numberOfPlayers = new javax.swing.JSpinner();
        imageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooseMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(chooseMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 113, 120, -1));

        title2Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2Label.setText("Initial Setup");
        getContentPane().add(title2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 73, 119, -1));

        title1Label.setFont(new java.awt.Font("AR DESTINE", 0, 48)); // NOI18N
        title1Label.setForeground(new java.awt.Color(255, 0, 0));
        title1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1Label.setText("DSDRisk Game");
        title1Label.setMinimumSize(new java.awt.Dimension(100, 55));
        title1Label.setPreferredSize(new java.awt.Dimension(50, 55));
        getContentPane().add(title1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, -1));

        chooseMapLabel.setText("Choose map");
        getContentPane().add(chooseMapLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 116, 90, -1));

        typeOfGame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(typeOfGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 144, 120, -1));

        typeOfGameLabel.setText("Type of game");
        getContentPane().add(typeOfGameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 147, 90, -1));

        numberOfPlayersLabel.setText("Numbers of players");
        getContentPane().add(numberOfPlayersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 182, 121, -1));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Username");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        jLabel9.setText("Color");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 80, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        userTable.setViewportView(jPanel1);

        getContentPane().add(userTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 202, 157));

        inviteContact.setText("Invite contact");
        inviteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteContactActionPerformed(evt);
            }
        });
        getContentPane().add(inviteContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        startSession.setText("Start session");
        getContentPane().add(startSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        deleteSession.setText("Delete session");
        deleteSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSessionActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        aboutLabel.setForeground(new java.awt.Color(0, 0, 204));
        aboutLabel.setText("About this game");
        getContentPane().add(aboutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));
        getContentPane().add(numberOfPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 60, -1));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background700400.jpg"))); // NOI18N
        getContentPane().add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inviteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviteContactActionPerformed
        new InviteContactGUI(this.user).setVisible(true);
    }//GEN-LAST:event_inviteContactActionPerformed

    private void deleteSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSessionActionPerformed
        this.setVisible(false);
        new SessionGUI(this.user).setVisible(true);
    }//GEN-LAST:event_deleteSessionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JComboBox<String> chooseMap;
    private javax.swing.JLabel chooseMapLabel;
    private javax.swing.JButton deleteSession;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JButton inviteContact;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner numberOfPlayers;
    private javax.swing.JLabel numberOfPlayersLabel;
    private javax.swing.JButton startSession;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title2Label;
    private javax.swing.JComboBox<String> typeOfGame;
    private javax.swing.JLabel typeOfGameLabel;
    private javax.swing.JScrollPane userTable;
    // End of variables declaration//GEN-END:variables
}
