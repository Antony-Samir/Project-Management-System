package Forms;

public class ManagerForm extends javax.swing.JFrame
{

    static TaskForm TF = new TaskForm();
    static DepartmentForm DF = new DepartmentForm();
    static ResourcesForm RF = new ResourcesForm();
    static LogProgressForm LPF = new LogProgressForm();

    public ManagerForm()
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(null);

        BackBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(10, 11, 74, 40);

        jButton3.setText("Print All Delayed Tasks");
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 130, 170, 32);

        jButton4.setText("Log Progress");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(160, 130, 120, 32);

        jButton6.setText("Add Task");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(30, 230, 110, 32);

        jButton7.setText("Update Task");
        getContentPane().add(jButton7);
        jButton7.setBounds(30, 290, 110, 32);

        jButton8.setText("Delete Task");
        getContentPane().add(jButton8);
        jButton8.setBounds(30, 350, 110, 32);

        jButton9.setText("Add Department");
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(190, 230, 140, 32);

        jButton10.setText("Update Department");
        getContentPane().add(jButton10);
        jButton10.setBounds(190, 290, 140, 32);

        jButton11.setText("Delete Department");
        getContentPane().add(jButton11);
        jButton11.setBounds(190, 350, 140, 32);

        jButton12.setText("Add Resource");
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(380, 230, 130, 32);

        jButton13.setText("Update Resource");
        getContentPane().add(jButton13);
        jButton13.setBounds(380, 290, 130, 32);

        jButton14.setText("Delete Resource");
        getContentPane().add(jButton14);
        jButton14.setBounds(380, 350, 130, 32);

        jButton15.setText("Add Project");
        jButton15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(550, 230, 130, 32);

        jButton16.setText("Update Project");
        getContentPane().add(jButton16);
        jButton16.setBounds(550, 290, 130, 32);

        jButton17.setText("Delete Project");
        getContentPane().add(jButton17);
        jButton17.setBounds(550, 350, 130, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed

        //this.dispose();
        //this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        LPF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        TF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        DF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        RF.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton15ActionPerformed
    {//GEN-HEADEREND:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
