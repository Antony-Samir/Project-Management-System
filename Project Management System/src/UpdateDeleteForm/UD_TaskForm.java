package UpdateDeleteForm;

import Forms.AdminForm;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import project.management.system.ReadFile;
import static project.management.system.ReadFile.MemberNums;
import static project.management.system.ReadFile.ResourceNums;
import java.io.IOException;
import project.management.system.EditFile;

public class UD_TaskForm extends javax.swing.JFrame
{
    static public int MemCount = 0; //To Know How Many Members Where Selected
    static public int ResCount = 0; //To Know How Many Resources Where Selected
        
    static AdminForm MF = new AdminForm();

    JCheckBox[] boxMembers = new JCheckBox[MemberNums];
    JCheckBox[] boxResources = new JCheckBox[ResourceNums];
    
    public UD_TaskForm()
    {
        
        initComponents();
        
        TaskID.setEditable(false);
        TaskTitle.setEditable(false);
        FromDateChooser.setEnabled(false);
        ToDateChooser.setEnabled(false);
        
        
        TaskStatus.setEditable(false);
        
        for (int i = 0; i < ReadFile.MemberNums; i++)
        {//Load Members into CheckBoxes
            boxMembers[i] = new JCheckBox();
            boxMembers[i].setText(String.valueOf(ReadFile.MEMBERS.get(i).getID()));
            MemberPanel.add( boxMembers[i] );
        }
        for (int i = 0; i < ReadFile.ResourceNums; i++)
        {//Load Resources into CheckBoxes
            boxResources[i] = new JCheckBox();
            boxResources[i].setText(String.valueOf(ReadFile.RESOURCE.get(i).getID()));
            ResourcePanel.add( boxResources[i] );
        }
        
        
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
        TaskID = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        TaskTitle = new javax.swing.JTextField();
        TaskStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MemberPanel = new javax.swing.JPanel();
        ResourcePanel = new javax.swing.JPanel();
        FromDateChooser = new datechooser.beans.DateChooserCombo();
        ToDateChooser = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        DeleteBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        ProjectIdTxt = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

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
        BackBtn.setBounds(40, 20, 100, 32);
        getContentPane().add(TaskID);
        TaskID.setBounds(110, 100, 100, 24);

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(590, 290, 100, 32);
        getContentPane().add(TaskTitle);
        TaskTitle.setBounds(110, 160, 100, 24);

        TaskStatus.setEditable(false);
        TaskStatus.setText("In Progress");
        getContentPane().add(TaskStatus);
        TaskStatus.setBounds(400, 160, 100, 24);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Task ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 100, 45, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 220, 61, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 27, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Members:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 280, 57, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Project ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 100, 58, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("To Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 220, 46, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 160, 40, 16);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Resources:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 280, 65, 16);
        getContentPane().add(MemberPanel);
        MemberPanel.setBounds(90, 270, 170, 200);
        getContentPane().add(ResourcePanel);
        ResourcePanel.setBounds(350, 270, 170, 200);
        getContentPane().add(FromDateChooser);
        FromDateChooser.setBounds(110, 220, 100, 20);
        getContentPane().add(ToDateChooser);
        ToDateChooser.setBounds(400, 220, 100, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Select Task You Want To Change:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 40, 190, 16);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(520, 70, 100, 26);

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(590, 340, 100, 32);

        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ViewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ViewBtn);
        ViewBtn.setBounds(520, 110, 100, 32);

        ProjectIdTxt.setEditable(false);
        getContentPane().add(ProjectIdTxt);
        ProjectIdTxt.setBounds(410, 100, 100, 24);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(640, 70, 65, 26);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Task Background.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-2, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SaveBtnActionPerformed
    {//GEN-HEADEREND:event_SaveBtnActionPerformed
       String ID = TaskID.getText().toString();
       if (ID.isEmpty())
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
        jComboBox1.removeAllItems();
        ProjectIdTxt.setText(null);
        SaveBtn.setVisible(true);
        TaskID.setEditable(false);
        TaskID.setText(null);
        TaskTitle.setEditable(false);
        TaskTitle.setText(null);
        FromDateChooser.setEnabled(false);
        ToDateChooser.setEnabled(false);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ViewBtnActionPerformed
    {//GEN-HEADEREND:event_ViewBtnActionPerformed
        TaskID.setEditable(true);
        TaskTitle.setEditable(true);
        FromDateChooser.setEnabled(true);
        ToDateChooser.setEnabled(true);

        int SelectedResource  = Integer.parseInt(jComboBox1.getSelectedItem().toString());

        for (int i = 0; i < ReadFile.TaskNums; i++)
        {
            
            if (ReadFile.TASK.get(i).getID() == SelectedResource)
            {
                TaskID.setText(String.valueOf(ReadFile.TASK.get(i).getID()));
                TaskTitle.setText(ReadFile.TASK.get(i).getTitle());
                FromDateChooser.setText(ReadFile.TASK.get(i).getFromDate());
                ToDateChooser.setText(ReadFile.TASK.get(i).getToDate());
                ProjectIdTxt.setText(String.valueOf(ReadFile.TASK.get(i).ProjectID));
                break;
            }
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteBtnActionPerformed
    {//GEN-HEADEREND:event_DeleteBtnActionPerformed
        String ID = TaskID.getText().toString();
        
        if (ID.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select Department!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            for (int i = 0; i < ReadFile.TaskNums; i++)
            {
                if (Integer.parseInt(ID) ==  ReadFile.TASK.get(i).getID())
                {
                    try
                    {//+2 (File Description Line + Indexing from zero)
                        EditFile.deleteTask(i + 2);
                        ReadFile.clearAllClasses();
                        ReadFile.fileLines();
                        ReadFile.readAllClasses();
                        JOptionPane.showMessageDialog(this, "congratulations Task Deleted Successfully", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } 
                    catch (IOException ex)
                    {
                        //Logger.getLogger(UD_ResourcesForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            jComboBox1.removeAllItems();
            SaveBtn.setVisible(true);
            TaskID.setEditable(false);
            TaskID.setText(null);
            TaskTitle.setEditable(false);
            TaskTitle.setText(null);
            FromDateChooser.setEnabled(false);
            ToDateChooser.setEnabled(false);
            MF.setVisible(true);
            this.dispose();
            //other logic
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UD_TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UD_TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UD_TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UD_TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UD_TaskForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private datechooser.beans.DateChooserCombo FromDateChooser;
    private javax.swing.JPanel MemberPanel;
    private javax.swing.JTextField ProjectIdTxt;
    private javax.swing.JPanel ResourcePanel;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField TaskID;
    private javax.swing.JTextField TaskStatus;
    private javax.swing.JTextField TaskTitle;
    private datechooser.beans.DateChooserCombo ToDateChooser;
    private javax.swing.JButton ViewBtn;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
