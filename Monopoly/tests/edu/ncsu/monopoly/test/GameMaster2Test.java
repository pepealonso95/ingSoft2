package edu.ncsu.monopoly.test;

import java.util.ArrayList;

import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.Manager;
import edu.ncsu.monopoly.MonopolyGUI;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.RespondDialog;
import edu.ncsu.monopoly.TradeDeal;
import edu.ncsu.monopoly.TradeDialog;
import edu.ncsu.monopoly.boardScenarios.GameBoardFull;

import junit.framework.TestCase;

public class GameMaster2Test extends TestCase {

    GameMaster gameMaster;
    

    protected void setUp() throws Exception {
        gameMaster = GameMaster.instance();
        gameMaster.setGameBoard(new GameBoardFull());
        gameMaster.setNumberOfPlayers(2);
        gameMaster.getPlayer(0).setName("Player 1");
        gameMaster.getPlayer(1).setName("Player 2");
        gameMaster.reset();
        gameMaster.setTestMode(true);
        gameMaster.setGUI(new MockGUI());
        gameMaster.startGame();
    }

    
   
    public void testEndGame() {
        gameMaster.getPlayer(0).setInJail(true);
        
        assertEquals(true, gameMaster.getPlayer(0).isInJail());
        assertEquals(0, gameMaster.getTurn());
        gameMaster.getPlayer(0).setMoney(0);
        
        assertEquals(true, gameMaster.getPlayer(0).isBankrupt());
        gameMaster.btnGetOutOfJailClicked();
        assertEquals(true,gameMaster.ended);
    }
    

}
