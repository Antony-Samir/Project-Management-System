package UpdateDeleteForm;
import Forms.AdminForm;
import project.management.system.ReadFile;


import java.io.IOException;
import javax.swing.JOptionPane;
import project.management.system.WriteFile;
import project.management.system.EditFile;

public class UD_ResourcesForm extends javax.swing.JFrame
{

    static AdminForm MF = new AdminForm();
    
    
    
    
    public UD_ResourcesForm()
    {
        initComponents();
        ResourceNameTxt.setEditable(false);
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
        ResourceNameTxt = new javax.swing.JTextField();
        ResourceIdTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resource Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 140, 100, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resource ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 140, 80, 16);
        getContentPane().add(ResourceNameTxt);
        ResourceNameTxt.setBounds(170, 180, 100, 24);

        ResourceIdTxt.setEditable(false);
        getContentPane().add(ResourceIdTxt);
        ResourceIdTxt.setBounds(40, 180, 100, 24);

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(390, 310, 100, 32);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(40, 20, 100, 32);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(540, 70, 100, 26);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Resource  you want to Update or Delete");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 30, 280, 16);

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(250, 310, 100, 32);

        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn);
        ViewBtn.setBounds(540, 190, 100, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Resource Background.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveBtnActionPerformed
    {//GEN-HEADEREND:event_SaveBtnActionPerformed
        String ID = ResourceIdTxt.getText().toString();
        String Name = ResourceNameTxt.getText().toString();
        String Used = "0";
        if (ID.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Project!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            for (int i = 0; i < ReadFile.ResourceNums; i++)
            {
                if (Integer.parseInt(ID) ==  ReadFile.RESOURCE.get(i).getID())
                {
                    try
                    {//+2 (File Description Line + Indexing from zero)
                        EditFile.deleteResource(i + 2);
                        WriteFile.writeResource(ID, Name, Used);
                        ReadFile.clearAllClasses();
                        ReadFile.fileLines();
                        ReadFile.readAllClasses();
                        JOptionPane.showMessageDialog(this, "congratulations Resource Updated Successfully", "Updated", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } 
                    catch (IOException ex)
                    {
                        //Logger.getLogger(UD_ResourcesForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            //other logic
            jComboBox1.removeAllItems();
            ResourceIdTxt.setText(null);
            ResourceNameTxt.setEditable(false);
            ResourceNameTxt.setText(null);
            MF.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        jComboBox1.removeAllItems();
        ResourceIdTxt.setText(null);
        ResourceNameTxt.setEditable(false);
        ResourceNameTxt.setText(null);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteBtnActionPerformed
    {//GEN-HEADEREND:event_DeleteBtnActionPerformed
        String ID = ResourceIdTxt.getText().toString();
        
        if (ID.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Project!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            for (int i = 0; i < ReadFile.ResourceNums; i++)
            {
                if (Integer.parseInt(ID) ==  ReadFile.RESOURCE.get(i).getID())
                {
                    try
                    {//+2 (File Description Line + Indexing from zero)
                        EditFile.deleteResource(i + 2);
                        ReadFile.clearAllClasses();
                        ReadFile.fileLines();
                        ReadFile.readAllClasses();
                        JOptionPane.showMessageDialog(this, "congratulations Resource Deleted Successfully", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } 
                    catch (IOException ex)
                    {
                        //Logger.getLogger(UD_ResourcesForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            //other logic
            jComboBox1.removeAllItems();
            ResourceIdTxt.setText(null);
            ResourceNameTxt.setEditable(false);
            ResourceNameTxt.setText(null);
            MF.setVisible(true);
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ViewBtnActionPerformed
    {//GEN-HEADEREND:event_ViewBtnActionPerformed
        
        ResourceNameTxt.setEditable(true);

        String SelectedResource  = jComboBox1.getSelectedItem().toString();

        for (int i = 0; i < ReadFile.ResourceNums; i++)
        {
            if (ReadFile.RESOURCE.get(i).getName() == SelectedResource)
            {
                ResourceIdTxt.setText(String.valueOf(ReadFile.RESOURCE.get(i).getID()));
                ResourceNameTxt.setText(ReadFile.RESOURCE.get(i).getName());
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
    private javax.swing.JTextField ResourceIdTxt;
    private javax.swing.JTextField ResourceNameTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton ViewBtn;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
