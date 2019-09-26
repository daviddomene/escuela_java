/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestEjemploHilos {

    private class ProcesoA extends Thread {

        @Override
        public void run() {
            super.run();
        }

        public void mostrarLista() {

            for (int i = 0; i < 200; i++) {
                System.out.println("Lista A: " + i);
            }
        }
    }

    private class ProcesoB extends Thread {

        @Override
        public void run() {
            super.run();
        }

        public void mostrarLista() {

            for (int i = 0; i < 200; i++) {
                System.out.println("Lista B: " + i);
            }
        }
    }

    @Test
    public void probandoClasesConNombres() {
        ProcesoA procA = new ProcesoA();
        ProcesoB procB = new ProcesoB();

        procA.start();
        procB.start();

    }
}
