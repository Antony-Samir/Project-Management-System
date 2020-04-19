package Forms;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.management.system.Department;
import project.management.system.WriteFile;

public class DepartmentForm extends javax.swing.JFrame
{
    static ManagerForm MF = new ManagerForm();
    
    public DepartmentForm()
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

        BackBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DepName = new javax.swing.JTextField();
        DepId = new javax.swing.JTextField();

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
        BackBtn.setBounds(40, 20, 90, 32);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 350, 90, 32);

        jLabel1.setText("Department Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 110, 120, 16);

        jLabel2.setText("Department ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 110, 120, 16);
        getContentPane().add(DepName);
        DepName.setBounds(420, 170, 110, 24);
        getContentPane().add(DepId);
        DepId.setBounds(200, 170, 110, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackBtnActionPerformed
    {//GEN-HEADEREND:event_BackBtnActionPerformed
        DepId.setEditable(true);
        DepName.setEditable(true);
        DepId.setText(null);
        DepName.setText(null);
        MF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        String ID = DepId.getText().toString();
        String Name = DepName.getText().toString();
        
        try
        {
            WriteFile.getInstance().writeDepartment(ID, Name);
        } catch (IOException ex)
        {
            Logger.getLogger(ResourcesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        DepId.setEditable(false);
        DepName.setEditable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DepId;
    private javax.swing.JTextField DepName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
