/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LaLax5
 */
public class Add_tour_guide extends javax.swing.JPanel {

    /**
     * Creates new form Add_tour_guide1
     */
     ArrayList<Tour_Guide> t;
    public Add_tour_guide(ArrayList<Tour_Guide> t) {
        initComponents();
        this.t=t;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        agetext = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idlabel1 = new javax.swing.JLabel();
        salarytext = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        namelabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        namelabel.setForeground(new java.awt.Color(255, 204, 0));
        namelabel.setText("Name");

        agelabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        agelabel.setForeground(new java.awt.Color(255, 204, 0));
        agelabel.setText("Age");

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        idlabel.setForeground(new java.awt.Color(255, 204, 0));
        idlabel.setText("ID");

        nametext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        agetext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        idtext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel_management/iconfinder_square-add_226562.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idlabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        idlabel1.setForeground(new java.awt.Color(255, 204, 0));
        idlabel1.setText("Salary");

        salarytext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salarytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarytextActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel_management/Tour_Guide-128.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Tour Guide");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(agetext)
                            .addComponent(nametext)
                            .addComponent(idtext, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(idlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agetext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(salarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        Tour_Guide t1=new Tour_Guide();
        t1.setName(nametext.getText());
        t1.setID(idtext.getText());
        t1.setAge(Integer.valueOf(agetext.getText()));
        t1.setSalary(Double.valueOf(salarytext.getText()));
        t.add(t1);
        nametext.setText(null);
        idtext.setText(null);
        agetext.setText(null);
        salarytext.setText(null);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please Enter All Data and Correct","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void salarytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarytextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelabel;
    private javax.swing.JTextField agetext;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel idlabel1;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField salarytext;
    // End of variables declaration//GEN-END:variables
}