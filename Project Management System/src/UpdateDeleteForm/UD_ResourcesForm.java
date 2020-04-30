package UpdateDeleteForm;
import Forms.ManagerForm;
import static UpdateDeleteForm.UD_ProjectForm.MF;
import project.management.system.ReadFile;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.management.system.Resource;
import project.management.system.WriteFile;

public class UD_ResourcesForm extends javax.swing.JFrame
{

    static ManagerForm MF = new ManagerForm();
    
    
    
    
    public UD_ResourcesForm()
    {
        initComponents();        
        ResId.setEditable(false);
        ResName.setEditable(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResName = new javax.swing.JTextField();
        ResId = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        jLabel1.setText("Resource Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 190, 100, 16);

        jLabel2.setText("Resource ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 190, 80, 16);
        getContentPane().add(ResName);
        ResName.setBounds(380, 240, 90, 24);
        getContentPane().add(ResId);
        ResId.setBounds(190, 240, 90, 24);

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

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(40, 30, 100, 32);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(570, 110, 100, 26);

        jLabel3.setText("Select Resource  you want to Update or Delete");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 70, 280, 16);

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
        ViewBtn.setBounds(570, 160, 100, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveBtnActionPerformed
    {//GEN-HEADEREND:event_SaveBtnActionPerformed
        
        if (ResId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Project!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        ResId.setEditable(false);
        ResId.setText(null);
        ResName.setEditable(false);
        ResName.setText(null);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteBtnActionPerformed
    {//GEN-HEADEREND:event_DeleteBtnActionPerformed
        
        if (ResId.getText().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Project!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            //other logic
        }
        
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ViewBtnActionPerformed
    {//GEN-HEADEREND:event_ViewBtnActionPerformed
        
        ResId.setEditable(true);
        ResName.setEditable(true);

        String SelectedResource  = jComboBox1.getSelectedItem().toString();

        for (int i = 0; i < ReadFile.getInstance().ResourceNums; i++)
        {
            if (ReadFile.getInstance().RESOURCE.get(i).getName() == SelectedResource)
            {
                ResId.setText(String.valueOf(ReadFile.getInstance().RESOURCE.get(i).getID()));
                ResName.setText(ReadFile.getInstance().RESOURCE.get(i).getName());
                break;
            }
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(UD_ResourcesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(UD_ResourcesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(UD_ResourcesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(UD_ResourcesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new UD_ResourcesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField ResId;
    private javax.swing.JTextField ResName;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton ViewBtn;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
