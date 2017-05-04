/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.*;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Dolores
 */
public class NewGame extends javax.swing.JFrame {

  
    private Manager myManager;
    

    public NewGame(Manager m) {
        initComponents();
        myManager = m;
        String[] data = new String[]{"1","2","3","4","5","6","7","8"};
        
        playerlbl3.setVisible(false);
        playerlbl4.setVisible(false);
        playerlbl5.setVisible(false);
        playerlbl6.setVisible(false);
        playerlbl7.setVisible(false);
        playerlbl8.setVisible(false);
       
       CBplayer3.setVisible(false);
       CBplayer4.setVisible(false);
       CBplayer5.setVisible(false);
       CBplayer6.setVisible(false);
       CBplayer7.setVisible(false);
       CBplayer8.setVisible(false);
        
        
        numberOfPlayersCB.setModel(new DefaultComboBoxModel(data)); 
        
        
        CBplayer1.setModel(new DefaultComboBoxModel(m.getPlayerList().toArray()));
        CBplayer2.setModel(new DefaultComboBoxModel(m.getPlayerList().toArray()));
             
    }

    public Manager getManager() {
        return myManager;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        nbrPlayerLbl = new javax.swing.JLabel();
        numberOfPlayersCB = new javax.swing.JComboBox();
        CBplayer1 = new javax.swing.JComboBox<>();
        playerlbl1 = new javax.swing.JLabel();
        CBplayer5 = new javax.swing.JComboBox<>();
        playerlbl5 = new javax.swing.JLabel();
        CBplayer2 = new javax.swing.JComboBox<>();
        playerlbl2 = new javax.swing.JLabel();
        CBplayer6 = new javax.swing.JComboBox<>();
        playerlbl6 = new javax.swing.JLabel();
        CBplayer3 = new javax.swing.JComboBox<>();
        playerlbl3 = new javax.swing.JLabel();
        CBplayer7 = new javax.swing.JComboBox<>();
        playerlbl7 = new javax.swing.JLabel();
        CBplayer4 = new javax.swing.JComboBox<>();
        playerlbl4 = new javax.swing.JLabel();
        CBplayer8 = new javax.swing.JComboBox<>();
        playerlbl8 = new javax.swing.JLabel();
        startGameBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nbrPlayerLbl.setText("Number of players:");

        numberOfPlayersCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPlayersCBActionPerformed(evt);
            }
        });

        CBplayer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl1.setText("Player 1:");

        CBplayer5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl5.setText("Player 5:");

        CBplayer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl2.setText("Player 2:");

        CBplayer6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl6.setText("Player 6:");

        CBplayer3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl3.setText("Player 3:");

        CBplayer7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl7.setText("Player 7:");

        CBplayer4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl4.setText("Player 4:");

        CBplayer8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        playerlbl8.setText("Player 8:");

        startGameBtn.setText("Start Game");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerlbl8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBplayer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startGameBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nbrPlayerLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberOfPlayersCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrPlayerLbl)
                    .addComponent(numberOfPlayersCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBplayer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBplayer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBplayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBplayer7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBplayer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBplayer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerlbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(startGameBtn)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed
        GameMaster master = GameMaster.instance();
        MainWindow window = new MainWindow();
        GameBoard gameBoard = new GameBoardFull();
        master.setGameBoard(gameBoard);
        //int numPlayers = numberOfPlayersCB.getSelectedIndex() + 1;
        int numPlayers = 2;
        GameMaster.instance().setNumberOfPlayers(numPlayers);
           // String name1 = myManager.getPlayerList().get(CBplayer1.getSelectedIndex()).getName();
            //GameMaster.instance().getPlayer(1).setName(name1);
            //String name2 = myManager.getPlayerList().get(CBplayer2.getSelectedIndex()).getName();
            //GameMaster.instance().getPlayer(2).setName(name2);
          
            for(int i=0;i<numPlayers;i++){
              GameMaster.instance().getPlayer(i).setName("a");
            }
        
        window.setupGameBoard(gameBoard);
        window.show();
        master.setGUI(window);
        master.startGame();
        
        
    }//GEN-LAST:event_startGameBtnActionPerformed

    private void numberOfPlayersCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfPlayersCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfPlayersCBActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBplayer1;
    private javax.swing.JComboBox<String> CBplayer2;
    private javax.swing.JComboBox<String> CBplayer3;
    private javax.swing.JComboBox<String> CBplayer4;
    private javax.swing.JComboBox<String> CBplayer5;
    private javax.swing.JComboBox<String> CBplayer6;
    private javax.swing.JComboBox<String> CBplayer7;
    private javax.swing.JComboBox<String> CBplayer8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nbrPlayerLbl;
    private javax.swing.JComboBox numberOfPlayersCB;
    private javax.swing.JLabel playerlbl1;
    private javax.swing.JLabel playerlbl2;
    private javax.swing.JLabel playerlbl3;
    private javax.swing.JLabel playerlbl4;
    private javax.swing.JLabel playerlbl5;
    private javax.swing.JLabel playerlbl6;
    private javax.swing.JLabel playerlbl7;
    private javax.swing.JLabel playerlbl8;
    private javax.swing.JButton startGameBtn;
    // End of variables declaration//GEN-END:variables
}
