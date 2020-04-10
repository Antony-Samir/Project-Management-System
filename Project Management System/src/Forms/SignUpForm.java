package Forms;

import project.management.system.Manager;
import project.management.system.Employee;
import project.management.system.ReadFile;
import project.management.system.WriteFile;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

 
public class SignUpForm extends javax.swing.JFrame 
{

    static LoginForm LG = new LoginForm();
    WriteFile WF = new WriteFile();
    

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        IdTxt.setEditable(false);
        BackBtn.setVisible(false);
    }

    SignUpForm(LoginForm aThis) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        AddTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        EmailTxt = new javax.swing.JTextField();
        IdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(223, 66, 60, 16);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 100, 90, 16);

        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(391, 66, 70, 16);

        jLabel4.setText("E-mail");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 140, 80, 16);

        NameTxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(NameTxt);
        NameTxt.setBounds(223, 91, 100, 24);

        AddTxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddTxtActionPerformed(evt);
            }
        });
        getContentPane().add(AddTxt);
        AddTxt.setBounds(397, 91, 100, 24);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 290, 90, 40);

        BackBtn.setText("Back To Main Menu");
        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(14, 17, 140, 32);
        getContentPane().add(EmailTxt);
        EmailTxt.setBounds(400, 170, 100, 24);
        getContentPane().add(IdTxt);
        IdTxt.setBounds(300, 280, 110, 24);

        jLabel5.setText("Your ID will Show Up Here");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 250, 150, 16);
        getContentPane().add(PasswordTxt);
        PasswordTxt.setBounds(580, 140, 100, 24);
        getContentPane().add(PhoneTxt);
        PhoneTxt.setBounds(230, 180, 90, 24);

        jLabel6.setText("Phone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 150, 36, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        String ID = null;
        
        String Name = NameTxt.getText().toString();
        String Address = AddTxt.getText().toString();
        String Phone = PhoneTxt.getText().toString();
        String Email = EmailTxt.getText().toString();
        String Password = PasswordTxt.getText().toString();
        
        
        if (Name.isEmpty() || Address.isEmpty() || Phone.isEmpty() || Password.isEmpty() || Email.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter All Empty Fields!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
           //writeMember(String ID, String Name, String Address, String Phone, String Email, String Password)
            Employee Emp = new Employee();

            Emp.setName(Name);
            Emp.setAddress(Address);
            Emp.setPhone(Phone);
            Emp.setEmail(Email);
            Emp.setPassword(Password);
            try
            {
                WF.writeMember("4", Name, Address, Phone, Email, Password);
                //WF.writeAcount(account);
            } 
            catch (IOException ex)
            {
                //Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            /*try
            {
                ReadFile.readCust();
            } 
            catch (IOException ex)
            {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }*/

            BackBtn.setVisible(true);
            jButton1.setVisible(false);
            
            NameTxt.setEditable(false);
            AddTxt.setEditable(false);
            PhoneTxt.setEditable(false);
            PasswordTxt.setEditable(false);
            EmailTxt.setEditable(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        LG.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void AddTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddTxtActionPerformed

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NameTxtActionPerformed
    {//GEN-HEADEREND:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddTxt;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JTextField IdTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
