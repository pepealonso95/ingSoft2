/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Manager;

/**
 *
 * @author Dolores
 */
public class ManagePlayers extends javax.swing.JFrame {

    private Manager myManager;

    public ManagePlayers(Manager m) {
        initComponents();
        myManager = m;
    }

    public Manager getManager() {
        return myManager;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        newPlayerBtn = new javax.swing.JButton();
        newGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        titleLbl.setText("Manage Players");

        newPlayerBtn.setText("Add Player");
        newPlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPlayerBtnActionPerformed(evt);
            }
        });

        newGameBtn.setText("Edit Player");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPlayerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(newGameBtn))
                    .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(titleLbl)
                .addGap(37, 37, 37)
                .addComponent(newPlayerBtn)
                .addGap(18, 18, 18)
                .addComponent(newGameBtn)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPlayerBtnActionPerformed
        NewPlayer newPlayerWindow = new NewPlayer(getManager());
        newPlayerWindow.setVisible(true);

    }//GEN-LAST:event_newPlayerBtnActionPerformed

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        EditPlayers editPlayers = new EditPlayers(getManager());
        editPlayers.setVisible(true);
    }//GEN-LAST:event_newGameBtnActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton newGameBtn;
    private javax.swing.JButton newPlayerBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
