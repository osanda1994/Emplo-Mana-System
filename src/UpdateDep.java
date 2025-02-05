
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farzan
 */
public class UpdateDep extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDep
     */
    public UpdateDep() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtloc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combostatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Department");
        setMinimumSize(new java.awt.Dimension(983, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setText("Update Department ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 340, 50));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DepName", "DepCode", "Location", "TP", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 820, 240));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/pngwing.com (1) (1).png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 40, 40));

        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 130, 40));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 130, 40));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 130, 40));

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 130, 40));

        jLabel2.setText("Department Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 250, -1));

        jLabel3.setText("Department Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        txtcode.setEditable(false);
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 250, -1));

        jLabel4.setText("Location");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));
        getContentPane().add(txtloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 250, -1));

        jLabel6.setText("Telephone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));
        getContentPane().add(txttp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 250, -1));

        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        combostatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        getContentPane().add(combostatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 250, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel tblmodel = (DefaultTableModel)jTable1.getModel();
         
        String name = tblmodel.getValueAt(jTable1.getSelectedRow(),0).toString();
        String code = tblmodel.getValueAt(jTable1.getSelectedRow(),1).toString();
        String loc = tblmodel.getValueAt(jTable1.getSelectedRow(),2).toString();
        String tp = tblmodel.getValueAt(jTable1.getSelectedRow(),3).toString();
        String status = tblmodel.getValueAt(jTable1.getSelectedRow(),4).toString();
        
        
        //Set values to the textfields
        txtname.setText(name);
        txtcode.setText(code);
        txtloc.setText(loc);
        txttp.setText(tp);
        combostatus.setSelectedItem(status);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:

        HRManager hr =new HRManager();
        hr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        depView();
        clear();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        HRManager hrmanager = new HRManager();
        hrmanager.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
      updateData();
      depView();
      clear();
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        
       try
           
       {
           String code = txtcode.getText();
        Connection con = DBConnection.connectDB();
        String sql = "DELETE FROM department WHERE DepCode ='"+code+"' ";
        PreparedStatement pst = con.prepareStatement(sql);
        
        
        int i = pst.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"there is an error");
            }
            pst.close();
            con.close();
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,e);
       } 
       depView();
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDep().setVisible(true);
            }
        });
    }

     private void depView() {
         
      Connection dbconn = DBConnection.connectDB();
    if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("Select * from department");

         ResultSet rs=st.executeQuery();
          DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            
            // clear existing data in the table
            tblModel.setRowCount(0);
         
         while(rs.next()){
         //data will be added until finish
         String name = rs.getString("DepName");
         String depcode =rs.getString("DepCode");
         String loc = rs.getString("Location");
         String tp =rs.getString("TP");
         String status = rs.getString("Status");
       
         
         //String array to store data to table
         String tbData[] = {name,depcode,loc,tp,status};
             
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
     
     
      public void clear(){
   
        txtname.setText("");
        txtcode.setText("");
        txtloc.setText("");
        txttp.setText("");
        combostatus.setSelectedIndex(0);
    }
     
     
 private void updateData() {

        try
           
       {
           String code = txtcode.getText();
        Connection con = DBConnection.connectDB();
        String sql = "update department set DepName=?,DepCode=?,Location=?, TP=? ,Status=? where DepCode ='"+code+"' ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,txtname.getText());
        pst.setString(2,txtcode.getText());
        pst.setString(3,txtloc.getText());
        pst.setString(4,txttp.getText());
        pst.setString(5,combostatus.getSelectedItem().toString());
        
        int i = pst.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"there is an error");
            }
            pst.close();
            con.close();
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,e);
       } 
     
}

    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> combostatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
}
