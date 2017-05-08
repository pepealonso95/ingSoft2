package edu.ncsu.monopoly;

import static java.awt.SystemColor.window;
import javax.swing.JOptionPane;


public class TaxiCard extends Card {
    
    private int type;

    public TaxiCard(int cardType) {
        this.type = cardType;
    }

    public void applyAction() {
        int pos = 0;
        while (pos <= 0 || pos > 6) {
            String numberOfPlayers = JOptionPane.showInputDialog(null, "How many positions forward would you like to move?");
            if (numberOfPlayers == null) {
                JOptionPane.showMessageDialog(null, "Using a taxi card is mandatory");
            } else{
                boolean isNumber = true;
                try {
                    pos = Integer.parseInt(numberOfPlayers);
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
                    }
                }
            }
        }
    }

    public int getCardType() {
        return type;
    }

    public String getLabel() {
        return "Taxi moves you forward";
    }

}
