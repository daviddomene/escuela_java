package Ejemplojava;

/**
 *
 * @author David Domene Domene
 */
public class StringAux {

    private String string;
    
    public StringAux(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }
    
    public void setString(String string) {
        this.string = string;
    }

    public String quitarEspacios() {
        return quitarEspacios(string);
    }

    public int contarPalabras() {
        return contarPalabras(string);
    }

    public String quitarEspacios(String cadena) {

        cadena = cadena.toUpperCase().trim();
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.replaceAll("  ", " ");
        }
        return cadena;

    }

    public int contarPalabras(String cadena) {
        int contador = 1;
        cadena = quitarEspacios(cadena);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;

    }

}
