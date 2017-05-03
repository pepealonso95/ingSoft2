/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dolores
 */
public class ArchivoLectura {
    
    private String linea;
    private BufferedReader in;

    public ArchivoLectura(String unNombre) {
        try {
            in = new BufferedReader(new FileReader(unNombre));
        } catch (FileNotFoundException e) {

        }
    }

    public boolean hayMasLineas() {
        try {
            linea = in.readLine();
        } catch (IOException e) {
            linea = null;
        }

        return (linea != null);
    }
        
    public String linea(){
        return linea;
    }
        
    public boolean cerrar(){
    boolean ok = true;
      try {
            in.close();
        } catch (Exception e) {
            ok = false;
        }
      return ok;
    }
    
    public static boolean chequearLinea(String linea) {

        boolean ok = true;

        try {
            String[] tokens = linea.split("#");
            
            if(tokens.length!=4){
                ok=false;
            }
            else{
                
            String name = tokens[1];
            String image = tokens[2];
            int gamesPlayed =  Integer.parseInt(tokens[3]);
            int gamesWon =  Integer.parseInt(tokens[4]);
            
            }      
        } catch (Exception err) {
            ok=false;
        }

        return ok;
    }
    
}
