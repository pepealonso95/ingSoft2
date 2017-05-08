package edu.ncsu.monopoly;

import javax.swing.JOptionPane;


public class TaxiCard extends Card {
    
    private int type;
    private String positionsToMove= "0";

    public TaxiCard(int cardType) {
        this.type = cardType;
    }
    
    public TaxiCard(int cardType, String positions) {
        this.type = cardType;
        this.positionsToMove = positions;
        
    }

    public void applyAction() {
        int pos = 0;
        while (pos <= 0 || pos > 6) {
            if(this.positionsToMove == "0"){
                this.positionsToMove = JOptionPane.showInputDialog(null, "How many positions forward would you like to move?");
            }
            pos = movePlayer(pos);
        }
    }

    public int getCardType() {
        return type;
    }
    
    public int movePlayer(int pos){
        if (positionsToMove == null) {
                JOptionPane.showMessageDialog(null, "Using a taxi card is mandatory");
            } else{
                boolean isNumber = true;
                try {
                    pos = Integer.parseInt(positionsToMove);
                } catch (NumberFormatException e) {
                    isNumber = false;
                    JOptionPane.showMessageDialog(null, "Please input a number");
                }
                if(isNumber){
                    if (pos <= 0 || pos > 6) {
                        JOptionPane.showMessageDialog(null, "Please input a number between one and six");
                    } else {
                        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
                        GameMaster.instance().movePlayer(currentPlayer, pos);
                        this.positionsToMove = "0";
                    }
                }
            }
        return pos;
    }

    public String getLabel() {
        return "Taxi moves you forward "+positionsToMove+" positions";
    }

}
