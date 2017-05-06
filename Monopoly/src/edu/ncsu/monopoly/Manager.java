/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.util.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dolores
 */
public class Manager implements Serializable{
    private ArrayList<PlayerInfo> playerInfoList;
    
    
    public Manager(ArrayList<PlayerInfo> playerList) {
        this.playerInfoList = playerList;
        
    }
    
    public Manager(){
        this.playerInfoList = new ArrayList<PlayerInfo>();
    }
    
    public ArrayList<PlayerInfo> getPlayerList() {
        return playerInfoList;
    }
    
    public ArrayList<String> getPlayerNames(){
        ArrayList<String> playerNames = new ArrayList<String>();
        for (int i = 0; i < playerInfoList.size(); i++) {  
            PlayerInfo p = playerInfoList.get(i);
            playerNames.add(p.getName());
        }
        return playerNames;
    }
    
    public void setPlayerList(ArrayList<PlayerInfo> playerList) {
        this.playerInfoList = playerList;
    }
    
    public void addPlayerToList(PlayerInfo aPlayer){
        this.playerInfoList.add(aPlayer);
    }
    
    public boolean playerAlreadyExists(String name) {
        boolean ok = false;

        for (int i = 0; i < playerInfoList.size(); i++) {  
            PlayerInfo p = playerInfoList.get(i);
            if(p.getName().equals(name)){
                ok=true;
            }
        }
        return ok;
    }
    
    public PlayerInfo getPlayer(String name) {
        PlayerInfo player = null;
        for (int i = 0; i < playerInfoList.size(); i++) {  
            PlayerInfo p = playerInfoList.get(i);
            if(p.getName().equals(name)){
                player=p;
            }
        }
        return player;
    }
   
}
