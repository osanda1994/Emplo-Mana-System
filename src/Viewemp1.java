
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farzan
 */
public class Viewemp1 extends javax.swing.JFrame {

    /**
     * Creates new form Viewemp
     */
    public Viewemp1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Details");
        setMinimumSize(new java.awt.Dimension(912, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpName", "EPFNo", "Address", "Dob", "TP", "Email", "Department", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 820, 340));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setText("Employee Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 290, 40));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 130, 40));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pngwing.com (1) (1).png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 40, 40));

        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 130, 40));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 210, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pngwing.com_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 50, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        HRAssistant assi = new HRAssistant();
        assi.setVisible(true);
        this.dispose();
        
       
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:

        Login login = new Login ();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        empView();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            try {
                PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select from employee where Ename=? ,EPF_No=? ,Department=? ,Designation=? ");
                st.setString(1,txtsearch.getText());
                st.setString(2,txtsearch.getText());
                st.setString(3,txtsearch.getText());
                st.setString(4,txtsearch.getText());

                ResultSet rs=st.executeQuery();

                // while(rs.next()){

                    // }

            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("The Connection not Available");
        }

    }//GEN-LAST:event_txtsearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = txtsearch.getText();
          try
        {
             Connection con = DBConnection.connectDB();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee where EPF_No='"+id+"'|| Ename='"+id+"' || Department='"+id+"' || Designation='"+id+"' ");
            
            
           jTable1.setModel (DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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
            java.util.logging.Logger.getLogger(Viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewemp1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables


private void empView() {
          Connection dbconn = DBConnection.connectDB();
    if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("Select * from employee");

         ResultSet rs=st.executeQuery();
          DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            // clear existing data in the table
            tblModel.setRowCount(0);
         
         while(rs.next()){
         //data will be added until finish
         String name = rs.getString("Ename");
         String epf =rs.getString("EPF_No");
         String address =rs.getString("Address");
         String dob = rs.getString("Dob");
         String tp =rs.getString("TP");
         String email =rs.getString("Email");
         String dep = rs.getString("Department");
         String des =rs.getString("Designation");
         
         //String array to store data to table
         String tbData[] = {name,epf,address,dob,tp,email,dep,des};
             
             //add string data to jtable
             tblModel.addRow(tbData);
             
         }
         
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("The Connection not Available");
    }
    }

}
