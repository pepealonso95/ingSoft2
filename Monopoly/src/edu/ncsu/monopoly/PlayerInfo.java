/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly;

import java.io.Serializable;
/**
 *
 * @author Dolores
 */
public class PlayerInfo implements Serializable{
    	private String name;
        private String picture;    
        private int gamesPlayed;
        private int gamesWon;

    public PlayerInfo(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
    
    
    @Override
    public String toString() {
        return name + " - Partidas jugadas: " + gamesPlayed + " - Partidas ganadas: " + gamesWon;
    }
    
    
        
        
        
}
