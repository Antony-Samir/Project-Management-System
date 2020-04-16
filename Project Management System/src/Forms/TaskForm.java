package Forms;

import java.io.IOException;
import javax.swing.JOptionPane;
import project.management.system.Task;
import project.management.system.WriteFile;


public class TaskForm extends javax.swing.JFrame
{
    static ManagerForm MF = new ManagerForm();
    WriteFile WF = new WriteFile();
    
    public TaskForm()
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
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
        BackBtn.setBounds(36, 19, 70, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(228, 90, 100, 24);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(228, 154, 100, 24);

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn);
        saveBtn.setBounds(590, 349, 58, 32);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(228, 218, 100, 24);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(380, 450, 100, 24);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(487, 90, 100, 24);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(487, 154, 100, 24);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(487, 218, 100, 24);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(590, 400, 100, 30);

        jLabel1.setText("Task Id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(107, 94, 44, 16);

        jLabel2.setText("From Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(107, 158, 61, 16);

        jLabel3.setText("Title:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(107, 222, 27, 16);

        jLabel4.setText("Members:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(111, 286, 57, 16);

        jLabel5.setText("Project Id:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 94, 57, 16);

        jLabel6.setText("To Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(381, 158, 46, 16);

        jLabel7.setText("Status:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(387, 222, 40, 16);

        jLabel8.setText("Resources:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(362, 286, 65, 16);

        jLabel9.setText("//Members and resources may be more than 1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 440, 280, 30);

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(50, 380, 96, 24);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null},
                {null},
                {null},
                {null}
            },
            new String []
            {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(230, 280, 80, 150);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null},
                {null},
                {null},
                {null}
            },
            new String []
            {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(500, 280, 80, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField8.setEditable(true);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveBtnActionPerformed
    {//GEN-HEADEREND:event_saveBtnActionPerformed
        String TaskId = jTextField1.getText().toString();
        String FromDate = jTextField2.getText().toString();
        String Title = jTextField3.getText().toString();
        String Members = jTextField4.getText().toString();
        String ProjectId = jTextField5.getText().toString();
        String ToDate = jTextField6.getText().toString();
        String Status = jTextField7.getText().toString();
        String Resources = jTextField8.getText().toString();

        
        if (TaskId.isEmpty() || FromDate.isEmpty() || Title.isEmpty() || Members.isEmpty() || ProjectId.isEmpty() || ToDate.isEmpty() || Status.isEmpty() || Resources.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter All Empty Fields!", "Field not entered", JOptionPane.WARNING_MESSAGE);
        } 
        else
        {
            Task task = new Task();

            //task.setId(TaskId);
            task.setFromDate(FromDate);
            task.setTitle(Title);
            //members
            //projectId          
            task.setToDate(ToDate);
            task.setStatus(Status);
            //resources
            
          /*try
            {
                WF.writeTask("4", Name, Address, Phone, Email, Password);
                //WF.writeAcount(account);
            } 
            catch (IOExceptionption ex)
            {
                //Logger.getLogger(SignUpForm.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            
            jTextField1.setEditable(false);
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);
            jTextField4.setEditable(false);
            jTextField5.setEditable(false);
            jTextField6.setEditable(false);
            jTextField7.setEditable(false);
            jTextField8.setEditable(false);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
