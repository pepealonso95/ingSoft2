/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.test;

import edu.ncsu.monopoly.PlayerInfo;
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
public class PlayerInfoTest extends TestCase{
    

    @Test
    public void testNewPlayer() {
        PlayerInfo instance = new PlayerInfo("dolo");
        String expResult = "dolo";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetName() {
        PlayerInfo instance = new PlayerInfo("dolo");
        String expResult = "dolo";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSetName() {
         PlayerInfo instance = new PlayerInfo("dolo");
        String expResult = "jacinta";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    
}
