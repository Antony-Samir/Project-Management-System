package Forms;
import Forms.SignUpForm;

public class LoginForm extends javax.swing.JFrame
{

    static SignUpForm SignObj = new SignUpForm();
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
        emailText = new javax.swing.JTextField();
        SignInBtn = new javax.swing.JButton();
        SignUpBtn = new javax.swing.JButton();
        PasswordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        email.setText("E-mail:");
        getContentPane().add(email);
        email.setBounds(160, 110, 46, 19);

        password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        password.setText("Password:");
        getContentPane().add(password);
        password.setBounds(161, 159, 72, 19);
        getContentPane().add(emailText);
        emailText.setBounds(310, 110, 140, 24);

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
        SignInBtn.setBounds(320, 240, 110, 35);

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

        PasswordText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PasswordTextActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordText);
        PasswordText.setBounds(310, 160, 140, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SignUpBtnActionPerformed
    {//GEN-HEADEREND:event_SignUpBtnActionPerformed
        
        SignObj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SignInBtnActionPerformed
    {//GEN-HEADEREND:event_SignInBtnActionPerformed
         
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PasswordTextActionPerformed
    {//GEN-HEADEREND:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

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
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JButton SignInBtn;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel password;
    // End of variables declaration//GEN-END:variables
}
