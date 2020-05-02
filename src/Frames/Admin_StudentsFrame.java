/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Frames.Panels.Student_AddPanel;
import Frames.Panels.Student_ListPanel;
import Frames.Panels.Student_UpdatePanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Salma Hnay
 */
public class Admin_StudentsFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admin_Students
     */
    GridBagLayout layout = new GridBagLayout();

    Student_AddPanel p1;
    Student_ListPanel p2;
    Student_UpdatePanel p3;

    public Admin_StudentsFrame() {
        initComponents();
        p1 = new Student_AddPanel();
        p2 = new Student_ListPanel();
        p3 = new Student_UpdatePanel();

        DynamicPanal.setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanal.add(p1, c);
        DynamicPanal.add(p2, c);
        DynamicPanal.add(p3, c);

        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        DynamicPanal = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Students  Management");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnAddStudent.setText("Add New Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnList.setText("List All Students");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update / Delete");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        DynamicPanal.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout DynamicPanalLayout = new javax.swing.GroupLayout(DynamicPanal);
        DynamicPanal.setLayout(DynamicPanalLayout);
        DynamicPanalLayout.setHorizontalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        DynamicPanalLayout.setVerticalGroup(
            DynamicPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_btnListActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        p3.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanal;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}