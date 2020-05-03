package Forms;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.management.system.ReadFile;
import project.management.system.WriteFile;

/**
 *
 * @author Dr Toni
 */
public class PrintTaskForm extends javax.swing.JFrame
{

   static ManagerForm MF = new ManagerForm();
    
    public PrintTaskForm()
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

        SelectedTaskBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        DelayedTasksBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        SelectedTaskBtn.setText("View Task");
        SelectedTaskBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SelectedTaskBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SelectedTaskBtn);
        SelectedTaskBtn.setBounds(580, 70, 120, 32);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(450, 70, 110, 26);

        jLabel1.setText("OR, Select A Specific Project?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 40, 170, 16);

        DelayedTasksBtn.setText("Print All Delayed Tasks?");
        DelayedTasksBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DelayedTasksBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DelayedTasksBtn);
        DelayedTasksBtn.setBounds(80, 70, 200, 32);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(20, 20, 100, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "Task ID", "Project ID", "Title", "From Date", "To Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 140, 580, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectedTaskBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SelectedTaskBtnActionPerformed
    {//GEN-HEADEREND:event_SelectedTaskBtnActionPerformed


    }//GEN-LAST:event_SelectedTaskBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DelayedTasksBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DelayedTasksBtnActionPerformed
    {//GEN-HEADEREND:event_DelayedTasksBtnActionPerformed
        for (int i = 0; i < ReadFile.TaskNums; i++)
        {
            if (ReadFile.TASK.get(i).getStatus() == "In Progress")
            {
                try
                {
                    WriteFile.writeDelayedTask(String.valueOf(ReadFile.TASK.get(i).getID()), String.valueOf(ReadFile.TASK.get(i).getProjectID()), ReadFile.TASK.get(i).getTitle(), ReadFile.TASK.get(i).getFromDate(), ReadFile.TASK.get(i).getToDate());
                } catch (IOException ex)
                {
                    Logger.getLogger(PrintTaskForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_DelayedTasksBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PrintTaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PrintTaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PrintTaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PrintTaskForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PrintTaskForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DelayedTasksBtn;
    private javax.swing.JButton SelectedTaskBtn;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
