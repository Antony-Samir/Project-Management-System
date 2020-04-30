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
        SaveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DepName = new javax.swing.JTextField();
        DepId = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();

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

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(380, 330, 100, 32);

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

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(190, 330, 100, 32);

        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn);
        ViewBtn.setBounds(567, 160, 100, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        DepId.setEditable(false);
        DepId.setText(null);
        DepName.setEditable(false);
        DepName.setText(null);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveBtnActionPerformed
    {//GEN-HEADEREND:event_SaveBtnActionPerformed
        
        if (DepId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Department!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteBtnActionPerformed
    {//GEN-HEADEREND:event_DeleteBtnActionPerformed
        
        if (DepId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Department!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ViewBtnActionPerformed
    {//GEN-HEADEREND:event_ViewBtnActionPerformed
        
        DepId.setEditable(true);
        DepName.setEditable(true);

        String SelectedDepartment  = jComboBox1.getSelectedItem().toString();

        for (int i = 0; i < ReadFile.getInstance().DepartmentNums; i++)
        {
            if (ReadFile.getInstance().DEPARTMENT.get(i).getName() == SelectedDepartment)
            {
                DepId.setText(String.valueOf(ReadFile.getInstance().DEPARTMENT.get(i).getID()));
                DepName.setText(ReadFile.getInstance().DEPARTMENT.get(i).getName());
                break;
            }
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

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
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DepId;
    private javax.swing.JTextField DepName;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton ViewBtn;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
