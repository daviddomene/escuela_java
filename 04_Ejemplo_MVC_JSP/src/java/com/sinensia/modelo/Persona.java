package com.sinensia.modelo;

/**
 * Esta clase es un POJO Clases sin logicos, sin herencia o poco de... Suelen
 * corresponder a una entidad
 *
 * @author David Domene Domene
 */
public class Persona {

    private int edad;

    private String nombre;
    private String email;
    private String pass;

    public Persona(String nombre, int edad, String email, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.pass = pass;
        
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
