package Forms;

import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import project.management.system.Task;
import project.management.system.WriteFile;
import project.management.system.ReadFile;
import static project.management.system.ReadFile.MemberNums;
import static project.management.system.ReadFile.ResourceNums;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskForm extends javax.swing.JFrame
{
     static public int MemCount = 0; //To Know How Many Members Where Selected
     static public int ResCount = 0; //To Know How Many Resources Where Selected
        
    static ManagerForm MF = new ManagerForm();

    JCheckBox[] boxMembers = new JCheckBox[MemberNums];
    JCheckBox[] boxResources = new JCheckBox[ResourceNums];
    
    public TaskForm()
    {
        initComponents();
        TaskStatus.setEditable(false);
        
        
        if (ReadFile.getInstance().ProjectNums != 0)
        {//Load Departments into ComboBox
            for (int i = 0; i < ReadFile.getInstance().ProjectNums; i++)
            {
                ProjectID.addItem(String.valueOf(ReadFile.getInstance().project[i].getID()));
            }
        }
        
        for (int i = 0; i < ReadFile.getInstance().MemberNums; i++)
        {//Load Members into CheckBoxes
            boxMembers[i] = new JCheckBox();
            boxMembers[i].setText(String.valueOf(ReadFile.getInstance().member[i].getID()));
            MemberPanel.add( boxMembers[i] );
        }
        for (int i = 0; i < ReadFile.getInstance().ResourceNums; i++)
        {//Load Resources into CheckBoxes
            boxResources[i] = new JCheckBox();
            boxResources[i].setText(String.valueOf(ReadFile.getInstance().resource[i].getID()));
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
        saveBtn = new javax.swing.JButton();
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
        ProjectID = new javax.swing.JComboBox();
        FromDateChooser = new datechooser.beans.DateChooserCombo();
        ToDateChooser = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
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
        BackBtn.setBounds(30, 30, 100, 32);
        getContentPane().add(TaskID);
        TaskID.setBounds(150, 100, 100, 24);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn);
        saveBtn.setBounds(580, 350, 100, 32);
        getContentPane().add(TaskTitle);
        TaskTitle.setBounds(150, 160, 100, 24);

        TaskStatus.setEditable(false);
        TaskStatus.setText("In Progress");
        getContentPane().add(TaskStatus);
        TaskStatus.setBounds(440, 160, 100, 24);

        jLabel1.setText("Task ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 100, 45, 16);

        jLabel2.setText("From Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 220, 61, 16);

        jLabel3.setText("Title:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 160, 27, 16);

        jLabel4.setText("Members:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 280, 57, 16);

        jLabel5.setText("Project ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 100, 58, 16);

        jLabel6.setText("To Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 220, 46, 16);

        jLabel7.setText("Status:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 160, 40, 16);

        jLabel8.setText("Resources:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 280, 65, 16);
        getContentPane().add(MemberPanel);
        MemberPanel.setBounds(130, 270, 170, 200);
        getContentPane().add(ResourcePanel);
        ResourcePanel.setBounds(390, 270, 170, 200);

        getContentPane().add(ProjectID);
        ProjectID.setBounds(440, 100, 100, 26);
        getContentPane().add(FromDateChooser);
        FromDateChooser.setBounds(150, 220, 100, 20);
        getContentPane().add(ToDateChooser);
        ToDateChooser.setBounds(440, 220, 100, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveBtnActionPerformed
    {//GEN-HEADEREND:event_saveBtnActionPerformed
       
        
        Boolean Mem = false; 
        Boolean Res = false;
        
        String TaskId = TaskID.getText().toString();
        String ProjectId = ProjectID.getSelectedItem().toString();
        String Title = TaskTitle.getText().toString();
        String FromDate = FromDateChooser.getText().toString();
        String ToDate = ToDateChooser.getText().toString();
        String[] members = new String[MemberNums];
        String[] resources = new String[ResourceNums];
        String Status = TaskStatus.getText().toString();
        
        
        if (TaskId.isEmpty() || Title.isEmpty() || Status.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter All Empty Fields!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            for (int i = 0; i < ReadFile.getInstance().MemberNums; i++)
            {//For Members
                if (boxMembers[i].isSelected() == true)
                {
                    members[i] = boxMembers[i].getText().toString();
                    MemCount++;
                    Mem = true;
                }
                else
                {
                }
            }
            for (int i = 0; i < ReadFile.getInstance().ResourceNums; i++)
            {//For Resources
                if (boxResources[i].isSelected() == true)
                {
                    resources[i] = boxResources[i].getText().toString();
                    ResCount++;
                    Res = true;
                }
                else
                {
                }
            }
            if (Mem == false || Res == false)
            {
                JOptionPane.showMessageDialog(this, "Please Select Members and Resources", "Select At Least One", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
               try
               {
                   WriteFile.getInstance().writeTask(TaskId, ProjectId, Title, FromDate, ToDate, members, resources, Status);
               } 
               catch (IOException ex)
               {
                   //Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
               }
               TaskID.setEditable(false);
               TaskTitle.setEditable(false);
               saveBtn.setVisible(false);
            }
            
           
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        saveBtn.setVisible(true);
        TaskID.setEditable(true);
        TaskID.setText(null);
        TaskTitle.setEditable(true);
        TaskTitle.setText(null);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private datechooser.beans.DateChooserCombo FromDateChooser;
    private javax.swing.JPanel MemberPanel;
    private javax.swing.JComboBox ProjectID;
    private javax.swing.JPanel ResourcePanel;
    private javax.swing.JTextField TaskID;
    private javax.swing.JTextField TaskStatus;
    private javax.swing.JTextField TaskTitle;
    private datechooser.beans.DateChooserCombo ToDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
