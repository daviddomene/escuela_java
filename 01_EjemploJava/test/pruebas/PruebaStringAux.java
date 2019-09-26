/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import Ejemplojava.StringAux;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class PruebaStringAux {
    public PruebaStringAux() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void probandoQitarESpacios(){
            
         String texto = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, vivia...";
         String texto2 = "En un lugar de Madrid...";
         String texto3 = "Lugar";
         
         String resultadoOk = "en un LUGAR";
         String resultadoAux = "";
         StringAux texto3aux = new StringAux(texto3);
         String resultado =  texto3aux.quitarEspacios();
         int resultado2 = texto3aux.contarPalabras();
         
         assertEquals(resultado, "LUGAR");
         
         assertEquals(resultado2, 1);
         
         //assertEquals(resultadoOk, resultadoAux);
     }
}