package Ejemplojava;

/**
 *
 * @author David Domene
 */
public class Coche {

    private final byte numRuedas;
    private String marca;
    private int capacidadDeposito;
    private boolean esGasolina;
    private double nivelDeposito;
    private boolean arrancado;

    public Coche(String marca, int capacidadDeposito, boolean esGasolina) {
        this.numRuedas = 4;
        this.marca = marca;
        this.capacidadDeposito = capacidadDeposito;
        this.esGasolina  = esGasolina;
    }
    

    
    public double getNivelDeposito(){  
        return nivelDeposito;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
    

    public void echarCarburante(double cantidad) {
        
        if(cantidad > 0)    
        this.nivelDeposito += cantidad;
        
        if(nivelDeposito > capacidadDeposito)
            nivelDeposito = capacidadDeposito;
    }
    
    
    public void acelerar(){
        if(arrancado)
            nivelDeposito-=0.1f;
    
    }

    public void vaciarDeposito() {

        this.nivelDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString());
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    
    }
    
    public String toString(){
        return "coche " + marca + " nivel " + nivelDeposito;
    }

    public String getMarca() {
        return marca;
    }

}
