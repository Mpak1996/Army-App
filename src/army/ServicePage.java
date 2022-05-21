/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package army;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author 30697
 */
public class ServicePage extends javax.swing.JFrame {
Connection con;
PreparedStatement pst;
ResultSet rs;

    /**
    /**
     * Creates new form HomePage
     */
    public ServicePage() {
         setIconImage();
        initComponents();
        table();
    }

    
    void table(){
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/army?useUnicode=yes?&characterEncoding=UTF-8","root","");
        pst= con.prepareStatement("select surname from soldier");
        
        
        rs=pst.executeQuery();
        txtsur.getSelectedItem().equals("Επιλέξτε Οπλίτη");
        
      while(rs.next()){
           txtsur.addItem(rs.getString("surname"));
       }
        
                
                } catch (ClassNotFoundException ex) {
        Logger.getLogger(SoldierPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(SoldierPage.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtsur = new javax.swing.JComboBox<>();
        txtser = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_add_new_30px.png"))); // NOI18N
        jLabel5.setText("Προσθήκη Υπηρεσίας");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_close_window_30px.png"))); // NOI18N
        jLabel6.setText("Έξοδος");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/army1.jpg"))); // NOI18N
        jLabel4.setText(" ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ΣΠΒ ΤΓΧ ΓΕΩΡΓΙΑΔΗ ΘΩΜΑ ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 230, 530));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Εφαρμογή Διαχείρισης Οπλιτών");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 320, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Καλωσήρθατε στην 98 ΜΕΘ!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 400, -1));

        txtsur.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsur.setMaximumRowCount(50);
        txtsur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Οπλίτη:" }));
        jPanel2.add(txtsur, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 510, 30));

        txtser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtser.setMaximumRowCount(20);
        txtser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Υπηρεσία:", "401 Κ.Ε.ΕΔ.", "Αλλαγές Δεκανέα Αλλαγής (15:00-18:00,00:00-02:00,06:00-09:00)", "Αλλαγές Δεκανέα Αλλαγής (18:00-21:00,02:00-04:00,09:00-12:00)", "Αλλαγές Δεκανέα Αλλαγής (21:00-00:00,04:00-06:00,12:00-15:00)", "Απογευματινή Σημαία", "ΑΥΔΜ (24ωρο)", "ΒΕΑΣ (24ωρο)", "Ε.Y.", "ΕΑΣ (24ωρο) ", "Εξοδούχοι", "Εκτός Φρουράς", "Εστιάτορας (24ωρο)", "Κτηριοφύλακας (15:00-18:00,00:00-02:00,06:00-09:00)", "Κτηριοφύλακας (18:00-21:00,02:00-04:00,09:00-12:00)", "Κτηριοφύλακας (21:00-00:00,04:00-06:00,12:00-15:00)", "ΗΣΑ (15:00-18:00,00:00-02:00,06:00-09:00)", "ΗΣΑ (18:00-21:00,02:00-04:00,09:00-12:00)", "ΗΣΑ (21:00-00:00,04:00-06:00,12:00-15:00)", "Κεντρική Πύλη (15:00-18:00,00:00-02:00,06:00-09:00)", "Κεντρική Πύλη (18:00-21:00,02:00-04:00,09:00-12:00)", "Κεντρική Πύλη (21:00-00:00,04:00-06:00,12:00-15:00)", "ΚΨΑ (15:00-18:00,00:00-02:00,06:00-09:00)", "ΚΨΑ (18:00-21:00,02:00-04:00,09:00-12:00)", "ΚΨΑ (21:00-00:00,04:00-06:00,12:00-15:00)", "Ξενοκράτης Κύριο", "Ξενοκράτης Εφεδρικό", "Ομάδα Πυρασφάλειας Κύριο", "Ομάδα Πυρασφάλειας Εφεδρικό", "Όργανο (24ωρο)", "Περίπολο (15:00-18:00,00:00-02:00,06:00-09:00)", "Περίπολο (18:00-21:00,02:00-04:00,09:00-12:00)", "Περίπολο (21:00-00:00,04:00-06:00,12:00-15:00)", "Τ.Α.Ε Κύριο", "Τ.Α.Ε Εφεδρικό" }));
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 510, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Προσθήκη Υπηρεσίας");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 210, 40));

        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/army/pic/icons8_back_30px.png"))); // NOI18N
        Back.setText("Πίσω");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 580, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
       int a = JOptionPane.showConfirmDialog(this,"Θέλετε να κλείσετε την εφαρμογή;","Μήνυμα Εξόδου",JOptionPane.YES_NO_OPTION);
        if (a==JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        HomePage a = new HomePage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String surname= (String) txtsur.getSelectedItem();
        String service= (String) txtser.getSelectedItem();
        
       if (surname.equals("Επιλέξτε Οπλίτη:") || service.equals("Επιλέξτε Υπηρεσία:"))
       {
          JOptionPane.showMessageDialog(this,"Δεν έχετε επιλέξει Οπλίτη ή Υπηρεσία! ","Μήνυμα Αποτυχίας",JOptionPane.CANCEL_OPTION); 
       }
       else{
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/army?useUnicode=yes?&characterEncoding=UTF-8","root","");
        pst=con.prepareStatement("insert into addservice (surname,service) values(?,?)");
        pst.setString(1, surname);
        pst.setString(2, service);
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this,"Η Υπηρεσία προστέθηκε επιτυχώς!","Μήνυμα Επιτυχίας",JOptionPane.INFORMATION_MESSAGE);
        
        txtsur.setSelectedItem("Επιλέξτε Οπλίτη:");
        txtser.setSelectedItem("Επιλέξτε Υπηρεσία:");
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ServicePage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(ServicePage.class.getName()).log(Level.SEVERE, null, ex);
    }
        
       }   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> txtser;
    private javax.swing.JComboBox<String> txtsur;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/army/pic/army1.jpg")));
    }
}
