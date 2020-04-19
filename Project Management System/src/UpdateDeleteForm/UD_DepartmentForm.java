package UpdateDeleteForm;
import Forms.ManagerForm;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.management.system.Department;
import project.management.system.ReadFile;
import project.management.system.WriteFile;

public class UD_DepartmentForm extends javax.swing.JFrame
{
    static ManagerForm MF = new ManagerForm();
    
    
    public UD_DepartmentForm()
    {
        initComponents();
        
        if (ReadFile.getInstance().DepartmentNums != 0)
        {
            for (int i = 0; i < ReadFile.getInstance().DepartmentNums; i++)
            {
                jComboBox1.addItem(ReadFile.getInstance().department[i].getName().toString());
            }
        }
        
        DepId.setEditable(false);
        DepName.setEditable(false);
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

        BackBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DepName = new javax.swing.JTextField();
        DepId = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(40, 40, 100, 32);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 330, 100, 32);

        jLabel1.setText("Department Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 190, 120, 16);

        jLabel2.setText("Department ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 190, 120, 16);
        getContentPane().add(DepName);
        DepName.setBounds(370, 240, 110, 24);
        getContentPane().add(DepId);
        DepId.setBounds(190, 240, 110, 24);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(570, 110, 100, 26);

        jLabel3.setText("Select Department you want to Update or Delete");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 70, 280, 16);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 330, 100, 32);

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(567, 160, 100, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        DepId.setEditable(false);
        DepName.setEditable(false);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        
        if (DepId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Department!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        
        if (DepId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Department!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        
        if (ReadFile.getInstance().DepartmentNums != 0)
        {
            DepId.setEditable(true);
            DepName.setEditable(true);
            
            String SelectedDepartment  = jComboBox1.getSelectedItem().toString();
            
            for (int i = 0; i < ReadFile.getInstance().DepartmentNums; i++)
            {
                if (ReadFile.getInstance().department[i].getName() == SelectedDepartment)
                {
                    DepId.setText(String.valueOf(ReadFile.getInstance().department[i].getId()));
                    DepName.setText(ReadFile.getInstance().department[i].getName());
                    break;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No Departments Were Added!", "Add Departments First", JOptionPane.ERROR_MESSAGE);
            MF.setVisible(true);
            this.dispose();
        }
                
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UD_DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UD_DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UD_DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UD_DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UD_DepartmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DepId;
    private javax.swing.JTextField DepName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
