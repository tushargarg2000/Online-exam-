/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OXS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MainT extends javax.swing.JFrame {
ButtonGroup b1 = new ButtonGroup();
    /**
     * Creates new form MainT
     */
    public MainT() {
        initComponents();
        
        b1.add(jRadioButton1);
        b1.add(jRadioButton2);
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quiz Id");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Frame Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Modify Quiz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Stop Quiz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Resume Quiz");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("ADD");

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("UPDATE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("RESULT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton5)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection con = DBConnection.getDatabaseConnection();
             String sql = "select quizId from QuizQ where quizId=? ";
               PreparedStatement pst;
               
                pst = con.prepareStatement(sql);
                    pst.setString(1, jTextField1.getText());
                ResultSet rs = pst.executeQuery();
                
                PreparedStatement pst1;
            
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, jTextField1.getText() + " Quiz Id Exists...");
                }
                else if(jPasswordField1.getText().equals(""))
                {
                       JOptionPane.showMessageDialog(null, jTextField1.getText() + " Password Field Empty");
                }
                else
                {
                    String info[]=new String[2];
                    info[0]=jTextField1.getText();
                    info[1]=jPasswordField1.getText();
                    AddQ.main(info); 
                    this.setVisible(false);
                
               
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(jRadioButton1.isSelected())
       {
           try {
            Connection con = DBConnection.getDatabaseConnection();
             String sql = "select quizId from QuizQ where quizId=? ";
               PreparedStatement pst;
               
                pst = con.prepareStatement(sql);
                    pst.setString(1, jTextField1.getText());
                ResultSet rs = pst.executeQuery();
                PreparedStatement pst1;
               String sql1="Select password from QuizQ where quizId=?";
               pst1= con.prepareStatement(sql1);
               pst1.setString(1, jTextField1.getText());
               ResultSet rs1=pst1.executeQuery();
               String s;
                if(rs1.next())
                {
                    s=rs1.getString(1);
               if(jPasswordField1.getText().equals(s)){
                if(rs.next())
                {
                    String info[]=new String[2];
                    info[0]=jTextField1.getText();
                    info[1]=jPasswordField1.getText();
                    AddQ.main(info); 
                    //this.setVisible(false);
                    //this.setVisible(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, jTextField1.getText() + " Quiz Id Must Exist...");
                }}
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       else if(jRadioButton2.isSelected())
               {
                   try {
            Connection con = DBConnection.getDatabaseConnection();
             String sql = "select quizId from QuizQ where quizId=? ";
               PreparedStatement pst;
               
                pst = con.prepareStatement(sql);
                    pst.setString(1, jTextField1.getText());
                ResultSet rs = pst.executeQuery();
                 PreparedStatement pst1;
               String sql1="Select password from QuizQ where quizId=?";
               pst1= con.prepareStatement(sql1);
               pst1.setString(1, jTextField1.getText());
               ResultSet rs1=pst1.executeQuery();
               String s;
                if(rs1.next())
                {
                    s=rs1.getString(1);
               if(jPasswordField1.getText().equals(s))
               {
                   if(rs.next())
                {
                    String info[]=new String[2];
                    info[0]=jTextField1.getText();
                    info[1]=jPasswordField1.getText();
                    ModifyQ.main(info); 
                    this.setVisible(false);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, jTextField1.getText() + " Quiz Id Must Exist...");
                }
                }
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
               }
       else
       {
           JOptionPane.showMessageDialog(null, "Select any button ");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
             
            Connection con = DBConnection.getDatabaseConnection();
             String sql = "UPDATE  QuizQ  SET quizAllow=false where quizId = ? ";
               PreparedStatement pst;
               PreparedStatement pst1;
               String sql1="Select password from QuizQ where quizId=?";
               pst1= con.prepareStatement(sql1);
               pst1.setString(1, jTextField1.getText());
               ResultSet rs1;
               rs1=pst1.executeQuery();
               String s;
                if(rs1.next())
                {
                    s=rs1.getString(1);
                
                if(jTextField1.getText().equals(null))               
                {
                JOptionPane.showMessageDialog(null, "Cant Leave Anything Empty ");
                }
                else if(jPasswordField1.getText().equals(s))
                {
                    pst = con.prepareStatement(sql);
                    pst.setString(1,jTextField1.getText());
                    pst.executeUpdate();
                    //con.commit();
                    con.close();
                }
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
             
            Connection con = DBConnection.getDatabaseConnection();
             String sql = "UPDATE  QuizQ  SET quizAllow=true where quizId = ? ";
               PreparedStatement pst;
               PreparedStatement pst1;
               String sql1="Select password from QuizQ where quizId=?";
               pst1= con.prepareStatement(sql1);
               pst1.setString(1, jTextField1.getText());
               ResultSet rs1=pst1.executeQuery();
               String s;
                if(rs1.next())
                {
                    s=rs1.getString(1);
                
                
                if(jTextField1.getText().equals(null))               
                {
                JOptionPane.showMessageDialog(null, "Cant Leave Anything Empty ");
                }
                else if(jPasswordField1.getText().equals(s)){
                    pst = con.prepareStatement(sql);
                    pst.setString(1,jTextField1.getText());
                    pst.executeUpdate();
//                    con.commit();
                    con.close();
                }
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTextField1.getText().equals("")||jPasswordField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Details");
        }
        else 
        {
            try {
                Connection con = DBConnection.getDatabaseConnection();
                PreparedStatement pst;
                ResultSet rs;
                String sql="select password from QuizQ where quizId=?";
                
                pst = con.prepareStatement(sql);
                pst.setString(1,jTextField1.getText());
                rs=pst.executeQuery();
                if(rs.next())
                {
                    if(jPasswordField1.getText().equals(rs.getString("password")))
                     new Result(jTextField1.getText()).setVisible(true);
                    else
                        JOptionPane.showMessageDialog(null,"Wrong Password");
                }
                else{
                    JOptionPane.showMessageDialog(null,"QuizId doesn't exist ");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MainT.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
