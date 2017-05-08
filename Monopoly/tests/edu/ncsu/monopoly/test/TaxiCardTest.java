package edu.ncsu.monopoly.test;



import edu.ncsu.monopoly.Card;
import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.TaxiCard;
import edu.ncsu.monopoly.boardScenarios.GameBoardCCTaxi;
import junit.framework.TestCase;

public class TaxiCardTest extends TestCase {
    GameMaster gameMaster;
    Card taxiCard;
    
    protected void setUp() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCTaxi());
		gameMaster.setNumberOfPlayers(1);
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
		taxiCard = new TaxiCard(Card.TYPE_CC, "2");
		gameMaster.getGameBoard().addCard(taxiCard);
    }
    
    /*public void testJailCardLabel() {
        assertEquals("Go to Blue 1", taxiCard.getLabel());
    }*/
    
   
    public void testMovePlayerCardUI() {
        gameMaster.movePlayer(0, 2);
        Cell currentPosition = gameMaster.getCurrentPlayer().getPosition();
        int oldPosition = gameMaster.getGameBoard().queryCellIndex(currentPosition.getName());
        assertTrue(gameMaster.getGUI().isDrawCardButtonEnabled());
        assertFalse(gameMaster.getGUI().isEndTurnButtonEnabled());
        gameMaster.btnDrawCardClicked();
        assertFalse(gameMaster.getGUI().isDrawCardButtonEnabled());
        currentPosition = gameMaster.getCurrentPlayer().getPosition();
        int newPosition = gameMaster.getGameBoard().queryCellIndex(currentPosition.getName());
        assertEquals((oldPosition+2)% gameMaster.getGameBoard().getCellNumber(), newPosition);
        assertTrue(gameMaster.getGUI().isEndTurnButtonEnabled());
    }
    
    
    
}
