/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

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
    
    
    public void setPlayerList(ArrayList<PlayerInfo> playerList) {
        this.playerInfoList = playerList;
    }
    
    public void addPlayerToList(PlayerInfo aPlayer){
        this.playerInfoList.add(aPlayer);
    }
    
    public boolean playerAlreadyExists(String name) {
        boolean ok = true;

        for (int i = 0; i < playerInfoList.size(); i++) {  
            PlayerInfo p = playerInfoList.get(i);
            if(p.getName().equals(name)){
                ok=false;
            }
        }
        return ok;
    }
   
}
