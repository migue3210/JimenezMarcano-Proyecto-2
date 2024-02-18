/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author Miguel
 */
public class BattleInterface extends javax.swing.JFrame {

    /**
     * Creates new form BattleInterface
     */
    public BattleInterface() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        victoriesLabel = new javax.swing.JLabel();
        vsLabel = new javax.swing.JLabel();
        avatarPanel = new javax.swing.JPanel();
        avatarLogo = new javax.swing.JLabel();
        avatarVictories1 = new javax.swing.JLabel();
        level1Label = new javax.swing.JLabel();
        level1Avatar = new javax.swing.JLabel();
        level2Label = new javax.swing.JLabel();
        level2Avatar = new javax.swing.JLabel();
        level3Label = new javax.swing.JLabel();
        level3Avatar = new javax.swing.JLabel();
        reinforceLabel = new javax.swing.JLabel();
        reinforceAvatar = new javax.swing.JLabel();
        regularShowPanel = new javax.swing.JPanel();
        regularShowLogo = new javax.swing.JLabel();
        regularShowVictories = new javax.swing.JLabel();
        level1Label1 = new javax.swing.JLabel();
        level1RegularShow = new javax.swing.JLabel();
        level2Label1 = new javax.swing.JLabel();
        level2RegularShow = new javax.swing.JLabel();
        level3Label1 = new javax.swing.JLabel();
        level3RegularShow = new javax.swing.JLabel();
        reinforceLabel1 = new javax.swing.JLabel();
        reinforcRegularShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        victoriesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        victoriesLabel.setText("VICTORIAS");
        getContentPane().add(victoriesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        vsLabel.setFont(new java.awt.Font("Segoe UI", 3, 90)); // NOI18N
        vsLabel.setText("VS");
        getContentPane().add(vsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        avatarPanel.setBackground(new java.awt.Color(255, 243, 207));
        avatarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        avatarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/Logo_de_Avatar_la_leyenda_de_Aang-420.png"))); // NOI18N
        avatarPanel.add(avatarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        avatarVictories1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avatarVictories1.setText("0");
        avatarPanel.add(avatarVictories1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 130, -1));

        level1Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level1Label.setText("Nivel 1");
        avatarPanel.add(level1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        level1Avatar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level1Avatar.setText("| id1 | id2 |");
        avatarPanel.add(level1Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        level2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level2Label.setText("Nivel 2");
        avatarPanel.add(level2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        level2Avatar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level2Avatar.setText("| id1 | id2 |");
        avatarPanel.add(level2Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        level3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level3Label.setText("Nivel 3");
        avatarPanel.add(level3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        level3Avatar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level3Avatar.setText("| id1 | id2 |");
        avatarPanel.add(level3Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        reinforceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reinforceLabel.setText("Refuerzo");
        avatarPanel.add(reinforceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        reinforceAvatar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reinforceAvatar.setText("| id1 | id2 |");
        avatarPanel.add(reinforceAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        getContentPane().add(avatarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 640));

        regularShowPanel.setBackground(new java.awt.Color(83, 92, 145));
        regularShowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regularShowLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/Regular_Show_Logo-450.png"))); // NOI18N
        regularShowPanel.add(regularShowLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        regularShowVictories.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regularShowVictories.setForeground(new java.awt.Color(255, 255, 255));
        regularShowVictories.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        regularShowVictories.setText("0");
        regularShowPanel.add(regularShowVictories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, -1));

        level1Label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level1Label1.setForeground(new java.awt.Color(255, 255, 255));
        level1Label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level1Label1.setText("Nivel 1");
        regularShowPanel.add(level1Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        level1RegularShow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level1RegularShow.setForeground(new java.awt.Color(255, 255, 255));
        level1RegularShow.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level1RegularShow.setText("| id2 | id1 |");
        regularShowPanel.add(level1RegularShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        level2Label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level2Label1.setForeground(new java.awt.Color(255, 255, 255));
        level2Label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level2Label1.setText("Nivel 2");
        regularShowPanel.add(level2Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        level2RegularShow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level2RegularShow.setForeground(new java.awt.Color(255, 255, 255));
        level2RegularShow.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level2RegularShow.setText("| id2 | id1 |");
        regularShowPanel.add(level2RegularShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        level3Label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        level3Label1.setForeground(new java.awt.Color(255, 255, 255));
        level3Label1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level3Label1.setText("Nivel 3");
        regularShowPanel.add(level3Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        level3RegularShow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        level3RegularShow.setForeground(new java.awt.Color(255, 255, 255));
        level3RegularShow.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        level3RegularShow.setText("| id2 | id1 |");
        regularShowPanel.add(level3RegularShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        reinforceLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reinforceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        reinforceLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        reinforceLabel1.setText("Refuerzo");
        regularShowPanel.add(reinforceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        reinforcRegularShow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reinforcRegularShow.setForeground(new java.awt.Color(255, 255, 255));
        reinforcRegularShow.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        reinforcRegularShow.setText("| id2 | id1 |");
        regularShowPanel.add(reinforcRegularShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        getContentPane().add(regularShowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 620, 640));

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
            java.util.logging.Logger.getLogger(BattleInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatarLogo;
    private javax.swing.JPanel avatarPanel;
    private javax.swing.JLabel avatarVictories1;
    private javax.swing.JLabel level1Avatar;
    private javax.swing.JLabel level1Label;
    private javax.swing.JLabel level1Label1;
    private javax.swing.JLabel level1RegularShow;
    private javax.swing.JLabel level2Avatar;
    private javax.swing.JLabel level2Label;
    private javax.swing.JLabel level2Label1;
    private javax.swing.JLabel level2RegularShow;
    private javax.swing.JLabel level3Avatar;
    private javax.swing.JLabel level3Label;
    private javax.swing.JLabel level3Label1;
    private javax.swing.JLabel level3RegularShow;
    private javax.swing.JLabel regularShowLogo;
    private javax.swing.JPanel regularShowPanel;
    private javax.swing.JLabel regularShowVictories;
    private javax.swing.JLabel reinforcRegularShow;
    private javax.swing.JLabel reinforceAvatar;
    private javax.swing.JLabel reinforceLabel;
    private javax.swing.JLabel reinforceLabel1;
    private javax.swing.JLabel victoriesLabel;
    private javax.swing.JLabel vsLabel;
    // End of variables declaration//GEN-END:variables
}
