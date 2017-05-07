/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.test;

import edu.ncsu.monopoly.Manager;
import edu.ncsu.monopoly.PlayerInfo;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dolores
 */
public class ManagerTest extends TestCase{
   // Manager manager;
    
    
    
    @Test
    public void testGetPlayerList(){
         Manager instance = new Manager();
         ArrayList<PlayerInfo> expResult = new ArrayList<PlayerInfo>();
         ArrayList<PlayerInfo> result = instance.getPlayerList();
         assertEquals(expResult, result);
    }
    

    
    @Test
    public void testEmptyPlayerList() {
        Manager instance = new Manager();
        int expResult = 0;
        int result = instance.getPlayerList().size();
        assertEquals(expResult, result);
    }
    

    @Test
    public void testAddNullPlayerToList() {
        PlayerInfo aPlayer = null;
        Manager instance = new Manager();
        instance.addPlayerToList(aPlayer);
        int expResult = 0;
        int result = instance.getPlayerList().size();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testAddPlayerToListOK() {
        PlayerInfo aPlayer = new PlayerInfo("dolo");
        Manager instance = new Manager();
        instance.addPlayerToList(aPlayer);
        int expResult = 1;
        int result = instance.getPlayerList().size();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testPlayerAlreadyExistsTrue() {
        PlayerInfo aPlayer = new PlayerInfo("dolo");
        Manager instance = new Manager();
        instance.addPlayerToList(aPlayer);
        boolean expResult = true;
        boolean result = instance.playerAlreadyExists("dolo");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerAlreadyExistsFalse() {
        PlayerInfo aPlayer = new PlayerInfo("dolo");
        Manager instance = new Manager();
        instance.addPlayerToList(aPlayer);
        boolean expResult = false;
        boolean result = instance.playerAlreadyExists("dolores");
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayerAlreadyExistsCaseSensitive() {
        PlayerInfo aPlayer = new PlayerInfo("dolo");
        Manager instance = new Manager();
        instance.addPlayerToList(aPlayer);
        boolean expResult = true;
        boolean result = instance.playerAlreadyExists("Dolo");
        assertEquals(expResult, result);
    }
}
