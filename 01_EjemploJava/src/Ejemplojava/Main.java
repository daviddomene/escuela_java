/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplojava;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Empezamos POO");
        Coche miCoche = new Coche("citroen", true, "roJO", TipoCarburante.GASOLINA);


        miCoche.setArrancado(true);
        miCoche.echarCarburante(50.0f);

        System.out.println("Marca: " + miCoche.getMarca());

        System.out.println("Capacidad deposito " + miCoche.CAPACIDAD_DEPOSITO);
        System.out.println("¿Es Gasolina? " + miCoche.isEsGasolina());
        System.out.println("Numero de ruedas: " + miCoche.getNumRuedas());
        System.out.println("Nivel de Deposito: " + miCoche.getNivelDeposito());

        //Coche otroCoche = new Coche();
        //otroCoche.marca = "Ferrari";
        //otroCoche.capacidadDeposito = 100;

        miCoche.vaciarDeposito();

        for (int i = 0; i < 3; i++) {
            miCoche.acelerar();
        }
        
        
        miCoche.mostrar();

    }

}
