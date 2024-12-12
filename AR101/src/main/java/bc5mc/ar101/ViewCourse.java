/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bc5mc.ar101;
/**
 *
 * @author MJ
 */
public class ViewCourse extends javax.swing.JFrame {

    /**
     * Creates new form ViewCourse
     */
    public ViewCourse() {
        initComponents();
        getSubjects();
        getPrograms();
    }
    
    private void getSubjects() {
        Subjects.removeAllItems();
        for (String subject : DataManager.subjects) {
            Subjects.addItem(subject);
        }
    }
    
     private void getPrograms() {
        Programs.removeAllItems();
        for (String program : DataManager.programs) {
            Programs.addItem(program);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackToHome = new javax.swing.JLabel();
        Programs = new javax.swing.JComboBox<>();
        Subjects = new javax.swing.JComboBox<>();
        SelectedSubject = new javax.swing.JTextField();
        SelectedProgram = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BackToHome1 = new javax.swing.JLabel();

        BackToHome.setText("Back");
        BackToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToHomeMouseClicked(evt);
            }
        });
        BackToHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackToHomeKeyPressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Programs.setBackground(new java.awt.Color(153, 0, 153));
        Programs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgramsActionPerformed(evt);
            }
        });

        Subjects.setBackground(new java.awt.Color(255, 0, 204));
        Subjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectsActionPerformed(evt);
            }
        });

        SelectedSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedSubjectActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECT SUBJECT");

        jLabel2.setText("SELECT PROGRAM");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("View details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BackToHome1.setText("Back");
        BackToHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToHome1MouseClicked(evt);
            }
        });
        BackToHome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackToHome1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(SelectedProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Programs, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BackToHome1)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BackToHome1)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(Programs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectedProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToHomeMouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_BackToHomeMouseClicked

    private void BackToHomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackToHomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToHomeKeyPressed

    private void BackToHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToHome1MouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_BackToHome1MouseClicked

    private void BackToHome1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackToHome1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToHome1KeyPressed

    private void SubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectsActionPerformed
        // TODO add your handling code here:
        String selectedSubject = Subjects.getSelectedItem().toString();
        SelectedSubject.setText(selectedSubject);
        DataManager.selectedSubject = selectedSubject;
    }//GEN-LAST:event_SubjectsActionPerformed

    private void SelectedSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectedSubjectActionPerformed

    private void ProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgramsActionPerformed
        // TODO add your handling code here:
        String selectedProgram = Programs.getSelectedItem().toString();
        SelectedProgram.setText(selectedProgram);
        DataManager.selectedProgram = selectedProgram;
    }//GEN-LAST:event_ProgramsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CourseDetails openCourseDetails = new CourseDetails();
        openCourseDetails.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackToHome;
    private javax.swing.JLabel BackToHome1;
    private javax.swing.JComboBox<String> Programs;
    private javax.swing.JTextField SelectedProgram;
    private javax.swing.JTextField SelectedSubject;
    private javax.swing.JComboBox<String> Subjects;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
