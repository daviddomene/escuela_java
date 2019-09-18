package Ejemplojava;

/**
 *
 * @author David Domene
 */
public class Coche {
    
    public static final int CAPACIDAD_DEPOSITO = 60;

    private final byte numRuedas;
    private final String marca;
    //private final int capacidadDeposito;
    private final boolean esGasolina;
    private double nivelDeposito;
    private boolean arrancado;
    private TipoColor color;
    //private String color;
    private final TipoCarburante carburante;

    public Coche(String marca, boolean esGasolina, TipoColor color, TipoCarburante carburante) {
        this.numRuedas = 4;
        this.marca = marca;
        this.esGasolina  = esGasolina;
        this.color = color;
        this.carburante = carburante;
        
    }
    
    public Coche(String marca, boolean esGasolina, String color, TipoCarburante carburante) {
        this.numRuedas = 4;
        this.marca = marca;
        this.esGasolina  = esGasolina;
        /*switch(color){
            case "ROJO": this.color = TipoColor.ROJO; break;
        }*/
        this.color = TipoColor.valueOf(color.toUpperCase());
        this.carburante = carburante;
        
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public TipoCarburante getCarburante() {
        return carburante;
    }
    
   
    
    public double getNivelDeposito(){  
        return nivelDeposito;
    }

    public byte getNumRuedas() {
        return numRuedas;
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
        
        if(nivelDeposito > CAPACIDAD_DEPOSITO)
            nivelDeposito = CAPACIDAD_DEPOSITO;
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
        return "coche " + marca + " nivel " + nivelDeposito + " color: " + color;
    }

    public String getMarca() {
        return marca;
    }

}
