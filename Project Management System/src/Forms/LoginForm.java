package Forms;

import static Forms.EmployeeForm.jComboBox1;
import javax.swing.JOptionPane;
import project.management.system.InvalidPasswordException;
import project.management.system.ReadFile;

public class LoginForm extends javax.swing.JFrame
{
    static SignUpForm SignObj = new SignUpForm();
    static EmployeeForm EF = new EmployeeForm();
    static ManagerForm MF = new ManagerForm();
    static public int accFoundID;
    
    public LoginForm()
    {
        initComponents();
        this.setLocationRelativeTo(null);
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

        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        SignInBtn = new javax.swing.JButton();
        SignUpBtn = new javax.swing.JButton();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("E-mail:");
        getContentPane().add(email);
        email.setBounds(40, 220, 46, 19);

        password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");
        getContentPane().add(password);
        password.setBounds(40, 260, 72, 19);

        SignInBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SignInBtn.setText("Log In");
        SignInBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SignInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignInBtn);
        SignInBtn.setBounds(230, 330, 110, 35);

        SignUpBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SignUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpBtn);
        SignUpBtn.setBounds(570, 20, 110, 35);
        getContentPane().add(emailTxt);
        emailTxt.setBounds(170, 220, 140, 24);
        getContentPane().add(passwordTxt);
        passwordTxt.setBounds(170, 260, 140, 24);

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login background.png"))); // NOI18N
        getContentPane().add(BackGroundLabel);
        BackGroundLabel.setBounds(0, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SignUpBtnActionPerformed
    {//GEN-HEADEREND:event_SignUpBtnActionPerformed
        SignUpBtn.setVisible(false);
        SignObj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SignInBtnActionPerformed
    {//GEN-HEADEREND:event_SignInBtnActionPerformed
        Boolean accFound = false;
        
        String Name = emailTxt.getText().toString();
        String Password = passwordTxt.getText().toString();
        
        //String Password = PasswordTxt.getPassword().toString();
        //System.out.println(Pass);
        
        if (Name.isEmpty() || Password.isEmpty())
        {//Check If Empty
            JOptionPane.showMessageDialog(this, "Enter Username OR Password", "Field Not Entered", JOptionPane.WARNING_MESSAGE);
        }
        else if (Name.equals("Admin") && Password.equals("123"))
        {//Check If Admin || Manager
            accFound = true;
            MF.setVisible(true);
            this.dispose();
            //this.setVisible(false);  
        }
        else
        {//Check If Employee
            for (int i = 0; i < ReadFile.getInstance().MemberNums; i++)
            {
                if (Name.equals(ReadFile.getInstance().MEMBERS.get(i).getEmail()) && Password.equals(ReadFile.getInstance().MEMBERS.get(i).getPassword()))
                {
                    accFound = true;
                    accFoundID = ReadFile.getInstance().MEMBERS.get(i).getID();
                    EF.NameTxt.setText(ReadFile.getInstance().MEMBERS.get(i).getName());
                    EF.setVisible(true);
                    this.dispose();
                    break;
                }                
            }
            
            for (int i = 0; i < ReadFile.getInstance().TaskNums; i++)
            {//For Loading Task ID's in Employee's Form
                for (int j = 0; j < ReadFile.getInstance().MemberNums; j++)
                {
                    if (ReadFile.getInstance().TASK.get(i).MemberID[j] == LoginForm.accFoundID)
                    {
                        System.out.println(ReadFile.getInstance().TASK.get(i).getID());
                        EmployeeForm.jComboBox1.addItem(String.valueOf(ReadFile.getInstance().TASK.get(i).getID()));
                        break;
                    }
                }
            }
            
            for (int i = 0; i < ReadFile.getInstance().TaskNums; i++)
            {//For Loading Task ID's in Employee's Form
                for (int j = 0; j < ReadFile.getInstance().MemberNums; j++)
                {
                    if (ReadFile.getInstance().TASK.get(i).MemberID[j] == LoginForm.accFoundID)
                    {
                        for (int k = 0; k < ReadFile.ProjectNums; k++)
                        {
                            if (ReadFile.getInstance().TASK.get(i).getProjectID() == ReadFile.PROJECT.get(k).getID())
                            {
                                System.out.println(ReadFile.PROJECT.get(k).getName());
                                EmployeeForm.jComboBox2.addItem(ReadFile.PROJECT.get(k).getName());
                            }
                        }
                        
                    }
                }
            }
        }
        
        if (accFound == false)
        {
            InvalidPasswordException.InvalidCount--;
            if (InvalidPasswordException.getInvalidCount() >= 1)
            {
                //throw new InvalidPasswordException("Username or Password Invalid");
                JOptionPane.showMessageDialog(this, "Please Try Again", "Username or Password Invalid", JOptionPane.WARNING_MESSAGE);
            }
            else if (InvalidPasswordException.getInvalidCount() == 0)
            {
                JOptionPane.showMessageDialog(this, "You exceeded the allowed limit, Program will terminate", "Invalid Email or Password", JOptionPane.WARNING_MESSAGE);
                this.dispose();
                System.exit(0);
            }
        }
        
    }//GEN-LAST:event_SignInBtnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        
       // JOptionPane.showMessageDialog(null, InvalidPasswordException.InvalidCount, "Email", JOptionPane.WARNING_MESSAGE);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordTxt;
    // End of variables declaration//GEN-END:variables
}
