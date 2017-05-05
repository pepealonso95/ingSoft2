package edu.ncsu.monopoly;


public class TaxiCard extends Card {
    
    private int type;

    public TaxiCard(int cardType) {
        this.type = cardType;
    }

    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
        GameMaster.instance().movePlayer(currentPlayer, 6);
    }

    public int getCardType() {
        return type;
    }

    public String getLabel() {
        return "Taxi moves you forward 6 positions";
    }

}
