/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import poo.Coche;
import poo.CocheRally;
import poo.TipoCarburante;
import poo.TipoColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.Pelota;

/**
 *
 * @author alumno
 */
public class TestColecciones {

    //@Test
    public void arrays() {
        Coche[] coches = new Coche[3]; //  Coche coches[];
        coches[0] = new Coche("Fiat", TipoCarburante.DIESEL, TipoColor.AZUL);
        coches[1] = new Coche("Audi", TipoCarburante.GASOLINA, TipoColor.ROJO);
        coches[2] = new Coche("Kia", TipoCarburante.ELECTRICO, TipoColor.VERDE);

        Coche[] cochesBis = {coches[2],
            coches[1],
            new Coche("Kia", TipoCarburante.ELECTRICO, TipoColor.VERDE)
        };
        Coche elMio = new Coche("Kia", TipoCarburante.ELECTRICO, TipoColor.ROJO);
        elMio = coches[2];
        elMio.setArrancado(true);
        elMio.acelerar();
        ///////////////
        coches[2].mostrar();

        ArrayList arrayListObj = new ArrayList(); // ArrayList NO genérico, 
        arrayListObj.add(42);               // Todos los elementos son objetos
        arrayListObj.add("Aaaaaa");
        arrayListObj.add(elMio);
        arrayListObj.add(false);
        for (Object obj : arrayListObj) {
            System.out.println(" OBJ: " + obj);
        }
        ArrayList<Integer> ventasAnuales = new ArrayList<Integer>();
        Integer objEntero = new Integer(200);
        objEntero.longValue();
        ventasAnuales.add(objEntero);
        ventasAnuales.add(30000);
        // ventasAnuales.add("oooooo no");

        ArrayList<Coche> cochesParaVender = new ArrayList<>();
        cochesParaVender.add(new Coche("Sinca", TipoCarburante.GASOLINA, TipoColor.AZUL));
        cochesParaVender.add(coches[0]);
        cochesParaVender.add(coches[1]);
        cochesParaVender.add(coches[2]);

        cochesParaVender.add(new CocheRally("Subaru Imprezza"));
        if (cochesParaVender.contains(coches[0])) {
            System.out.println("El coche existe");
        }
        TestColecciones.mostrarCoche(elMio);
        cochesParaVender.forEach(TestColecciones::mostrarCoche);
        // FUNCION LAMBDA
        cochesParaVender.forEach((coche) -> {
            System.out.println(" -> " + coche.toString());
        });
//        cochesParaVender.add("Que no se puede");
    }

    public static void mostrarCoche(Coche coche) {
        System.out.println(" -> " + coche.toString());
    }

    //@Test
    public void sets() {
        HashSet<Pelota> pelotas = new HashSet<>();
        Pelota p1 = new Pelota();
        Pelota p2 = new Pelota();
        Pelota p3 = new Pelota();

        pelotas.add(p1);
        pelotas.add(p2);
        pelotas.add(p3);
        System.out.println("Set pelotas " + pelotas);

        assertEquals(pelotas.size(), 3);

        for (Pelota p : pelotas) {

            System.out.println(p.toString());
        }

    }

    //@Test
    public void maps() {
        HashMap<String, Boolean> coloresCalidos = new HashMap<>();
        coloresCalidos.put("BLANCO", Boolean.FALSE);
        coloresCalidos.put("ROJO", true);
        coloresCalidos.put("AZUL", false);
        coloresCalidos.put("VERDE", false);
        coloresCalidos.put("AMARILLO", true);
        
        if(coloresCalidos.get("AZUL")){
            System.out.println("Azul es un color calido");
        }
        if(coloresCalidos.get("ROJO")){
            System.out.println("Rojo es un color calido");
        }
        System.out.println("VERDE en " + coloresCalidos.get("VERDE"));
        
        for (Map.Entry<String, Boolean> par : coloresCalidos.entrySet()){
            System.out.println("Clave " + par.getKey());
            System.out.println("Valor " + par.getValue());
        }
        
        assertEquals(coloresCalidos.get("AZUL"), false);
        assertEquals(coloresCalidos.size(), 5);
    }
    
    @Test
    public void mapsCoche(){
    TreeMap<String, Coche> coches = new TreeMap<>();
        //HashMap<String, Boolean> coloresCalidos = new HashMap<>();
        Coche coche1 = new Coche("Seat", "matricula1");
        Coche coche2 = new Coche("Reanault","matricula2");
        Coche coche3 = new Coche("Citroen","matricula3");
        
        coches.put(coche1.getMatricula(), coche1);
        coches.put(coche2.getMatricula(), coche2);
        coches.put(coche3.getMatricula(), coche3);
        
        for (Map.Entry<String, Coche> coche : coches.entrySet()){
            System.out.println("Clave " + coche.getKey());
            System.out.println("Valor " + coche.getValue());
        }
    
    }

}
