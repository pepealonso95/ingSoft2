/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;
import persistencia.ArchivoGrabacion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import edu.ncsu.monopoly.Manager;
import persistencia.Persistencia;

/**
 *
 * @author Dolores
 */
public class Menu extends javax.swing.JFrame {

    private Manager myManager;

    public Menu(Manager m) {
        initComponents();
        myManager = m;
    }

    public Manager getManager() {
        return myManager;
    }

    public void setManager(Manager m) {
        this.myManager = m;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        newPlayerBtn = new javax.swing.JButton();
        newGameBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        titleLbl.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        titleLbl.setText("MONOPOLY");

        newPlayerBtn.setText("Manage Players");
        newPlayerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPlayerBtnActionPerformed(evt);
            }
        });

        newGameBtn.setText("Start new game");
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
                .addGap(305, 305, 305)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newGameBtn, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPlayerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(339, Short.MAX_VALUE))
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
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        NewGame newGame = new NewGame(getManager());
        newGame.setVisible(true);
    }//GEN-LAST:event_newGameBtnActionPerformed

    private void newPlayerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPlayerBtnActionPerformed
        ManagePlayers managePlayersWindow = new ManagePlayers(getManager());
        managePlayersWindow.setVisible(true);

    }//GEN-LAST:event_newPlayerBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("monopoly_data.dat"));
            out.writeObject(myManager);
            out.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton newGameBtn;
    private javax.swing.JButton newPlayerBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
