/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package job_portal;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arnim
 */
public class Search_1 extends javax.swing.JFrame {

    /**
     * Creates new form Search_1
     */
    public Search_1() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\arnim\\Documents\\NetBeansProjects\\Job_Portal\\src\\job_portal\\rm373batch5-18.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Jobify-Your one stop Destination");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 80));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 450, 37));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, 37));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "zip_code", "Name", "Field", "Future_Plans", "Strength"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 320));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("CHOOSE YOUR DESIRED COMPANY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 450, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 573, -1, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("SHOW ENLISTED COMPANIES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 270, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/job_portal/php.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Recruiter_page2 f=new Recruiter_page2();
        f.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{
         Class.forName("com.mysql.jdbc.Driver");  
         Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useSSL=false","root","Arnim27#");
         Statement stmt = con.createStatement();
         String sql="select * from company_i";
         ResultSet rs=stmt.executeQuery(sql);
         while(rs.next()){
             String zip=rs.getString("zip");
             String Name=rs.getString("cn");
             String Field=rs.getString("cf");
             String Future_Plans=rs.getString("cfp");
             String Strength=rs.getString("cs");
             String tbData[]={zip,Name,Field,Future_Plans,Strength};
             DefaultTableModel tb1Model=(DefaultTableModel)jTable1.getModel();
             tb1Model.addRow(tbData);
         }
         
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {  
 
           String st2=t1.getText();
          
           
        Class.forName("com.mysql.jdbc.Driver");  
           try ( // establish connection
                   Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","Arnim27#"); Statement stmt = con.createStatement()) {
               stmt.executeUpdate ("insert into company_name "

                  + "(id,name)"

                  + "values ('"+1+"', '"+st2+"')");
               JOptionPane.showMessageDialog(null, "Record inserted...");
           }  

       } catch (Exception e) {  
        JOptionPane.showMessageDialog(null, e);  
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
            java.util.logging.Logger.getLogger(Search_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

    
}