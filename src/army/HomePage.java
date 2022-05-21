/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author 30697
 */
public class HomePage extends javax.swing.JFrame {

    
    public HomePage() {
        setIconImage();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddSoldier = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        Programm = new javax.swing.JLabel();
        AddServices = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EditSoldiers = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ΣΠΒ ΤΓΧ ΓΕΩΡΓΙΑΔΗ ΘΩΜΑ ");

        AddSoldier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddSoldier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_soldier_30px.png"))); // NOI18N
        AddSoldier.setText("Προσθήκη Οπλίτη");
        AddSoldier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSoldierMouseClicked(evt);
            }
        });

        HomePage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_home_30px_1.png"))); // NOI18N
        HomePage.setText("Αρχική Σελίδα");
        HomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageMouseClicked(evt);
            }
        });

        Programm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Programm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_calendar_30px.png"))); // NOI18N
        Programm.setText("Πρόγραμμα Ημέρας");
        Programm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgrammMouseClicked(evt);
            }
        });

        AddServices.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_add_new_30px.png"))); // NOI18N
        AddServices.setText("Προσθήκη Υπηρεσίας");
        AddServices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddServicesMouseClicked(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_close_window_30px.png"))); // NOI18N
        Exit.setText("Έξοδος");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/army1.jpg"))); // NOI18N
        jLabel11.setText(" ");

        EditSoldiers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditSoldiers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_edit_30px.png"))); // NOI18N
        EditSoldiers.setText("Επεξεργασία Οπλιτών");
        EditSoldiers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditSoldiersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HomePage)
                                .addComponent(AddSoldier)
                                .addComponent(EditSoldiers))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Programm)
                                .addComponent(AddServices)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(AddSoldier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(EditSoldiers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(AddServices, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Programm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 230, 530));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Εφαρμογή Διαχείρισης Οπλιτών");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 320, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Καλωσήρθατε στην Σχολή Πυροβολικού!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 490, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/ΠΕΖΙΚΟ.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 210, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 580, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       
       int a = JOptionPane.showConfirmDialog(this,"Θέλετε να κλείσετε την εφαρμογή;","Μήνυμα Εξόδου",JOptionPane.YES_NO_OPTION);
        if (a==JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_ExitMouseClicked

    private void AddSoldierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSoldierMouseClicked
       SoldierPage a= new SoldierPage();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AddSoldierMouseClicked

    private void AddServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddServicesMouseClicked
        ServicePage a= new ServicePage();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AddServicesMouseClicked

    private void ProgrammMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgrammMouseClicked
        ProgrammPage a= new ProgrammPage();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ProgrammMouseClicked

    private void EditSoldiersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditSoldiersMouseClicked
        SoldierEditPage a= new SoldierEditPage();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_EditSoldiersMouseClicked

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseClicked
         HomePage a = new HomePage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomePageMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddServices;
    private javax.swing.JLabel AddSoldier;
    private javax.swing.JLabel EditSoldiers;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel HomePage;
    private javax.swing.JLabel Programm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
 private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/army/pic/army1.jpg")));
    }

}
