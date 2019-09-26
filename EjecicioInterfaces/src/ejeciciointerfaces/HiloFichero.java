package ejeciciointerfaces;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Domene Domene
 */
public class HiloFichero implements StringAux1{

    public void leerFicherosEjem(String rutaFich) {
        File fich = new File(rutaFich);
        Scanner escaner = null;
        try {
            escaner = new Scanner(fich);
            while (escaner.hasNextLine()) {
                String linea = escaner.nextLine();
                System.out.println(linea);
                StringAux1 strAux = new StringAux1(linea);
                System.out.println(strAux.quitarEspSobrantes());
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            try {
                if (escaner != null) {
                    escaner.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(HiloFichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
