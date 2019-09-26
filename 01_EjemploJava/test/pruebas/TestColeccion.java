/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package pruebas;

import POO.Coche;
import POO.CocheRally;
import POO.TipoCarburante;
import POO.TipoColor;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 
public class TestColeccion {

    @Test
    public void arrays() {
        Coche[] coches = new Coche[3];
        coches[0] = new Coche("Fiat", true, TipoColor.AZUL, TipoCarburante.DISEL);
        coches[1] = new Coche("Reanault", true, TipoColor.NEGRO, TipoCarburante.GASOLINA);
        coches[2] = new Coche("Seat", true, TipoColor.PLATEADO, TipoCarburante.ELECTRICO);

        Coche elMio = new Coche("Seat", true, TipoColor.PLATEADO, TipoCarburante.ELECTRICO);
        elMio = coches[2];
        elMio.setArrancado(true);
        elMio.acelerar();

        coches[2].mostrar();
        ArrayList arrayListObj = new ArrayList();
        arrayListObj.add(42);
        arrayListObj.add("aaaaaaaaa");
        arrayListObj.add(elMio);
        for (Object obj : arrayListObj) {
            System.out.println(" Obj " + obj);
        }

        ArrayList<Integer> ventasAnuales = new ArrayList<Integer>();
        Integer objEntero = new Integer(200);
        objEntero.longValue();
        ventasAnuales.add(objEntero);
        ventasAnuales.add(300000);

        ArrayList<Coche> cochesParaVender = new ArrayList<Coche>();

        cochesParaVender.add(new Coche("Reanault", true, TipoColor.NEGRO, TipoCarburante.GASOLINA));
        cochesParaVender.add(coches[0]);
        cochesParaVender.add(coches[1]);
        cochesParaVender.add(coches[2]);

        cochesParaVender.add(new CocheRally("Fiat", true));

        if (cochesParaVender.contains(coches[1])) {
            System.out.println("El coche existe");

        }
        cochesParaVender.forEach((coche) -> {
            System.out.println(" -> " + coche.toString());
        });
        //No se puede añadir nada que no sea un coche
        //cochesParaVender.add("vsdvsdvsdv");
        
        
        

    }
}*/
