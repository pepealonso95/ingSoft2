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

    private String linea = "";
    private BufferedReader in;

    public ArchivoLectura(String unNombre) {
        try {
            in = new BufferedReader(new FileReader(unNombre));
        }
        catch (FileNotFoundException e) {
            // aca se deberia manejar “mejor” el error, como todavia no se dio excepciones se deja asi
            System.out.println("no esta");
        }
    }

    public boolean hayMasLineas() {
        boolean hayMas;
        try
        {
            linea = in.readLine();
        } catch (IOException e) {
            System.out.println("error io");
            System.exit(0);
        }
        // la forma de darme cuenta del final es porque devuelve null
        hayMas = (linea != null);
        return hayMas;
    }

     // devuelve la linea actual, no avanza en el archivo
    public String linea() {
        return linea;
    }

    // podria ser boolean
    public void cerrar()
    {
        try
        {
            in.close();
        }
        catch (Exception e)
        {
            // misma aclaracion de antes, si hay error lo mejor seria manejar la excepciónadecuadamente. Por ahora se deja asi
            System.out.println("error close ");
        }
    }
}