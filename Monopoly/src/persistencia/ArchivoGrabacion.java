package persistencia;

import java.io.*;

public class ArchivoGrabacion {

    private BufferedWriter out;

    // crea un archivo de nombre dado
    public ArchivoGrabacion(String unNombre) {
        try {
            out = new BufferedWriter(new FileWriter(unNombre));
        } catch (IOException e) {
            System.out.println("no se puede crear");
        } //ESTO ES DESPROLIJO; ES PARA EL EJEMPLO
    }
    // graba de a linea
    public boolean grabarLinea(String linea) {
        boolean ok = true;
        try {
            out.write(linea);
            out.newLine();
        } catch (IOException e) {
            ok = false;
        }
        return ok;
    }

    public boolean cerrar() {
        boolean ok = true;
        try {
            out.flush();
            out.close();
        } catch (Exception e) {
            ok = false;
        }
        return ok;
    }
}
