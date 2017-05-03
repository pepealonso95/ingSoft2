/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import edu.ncsu.monopoly.Manager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dolores
 */
public class Persistencia {
    
    public boolean savePlayerInfo(Manager man) {
        boolean ok = true;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("salida"));
            out.writeObject(man);
            out.close();

        } catch (Exception err) {
            ok = false;
        }
        return ok;
    }

    public Manager loadPLayerInfo() {

        Manager man = null;

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("salida"));
            man = (Manager) in.readObject();

        } catch (Exception err) {
            man = new Manager();
        }
        return man;
    } 
}
