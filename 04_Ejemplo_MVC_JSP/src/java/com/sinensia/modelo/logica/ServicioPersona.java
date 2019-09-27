package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Singleton porque solo queremos un servicio ppor aplicacion/servidor
 *
 * @author David Domene Domene
 */
public class ServicioPersona {

    //Codigo Singlenton
    private static ServicioPersona instancia;

    private ServicioPersona() {
        personas = new ArrayList<>();
    }

    public static ServicioPersona getInstancia() {
        if (instancia == null) {
            instancia = new ServicioPersona();
        }
        return instancia;

    }
    private ArrayList<Persona> personas;

    Pattern pattern = Pattern
            .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    public Persona addPersonas(String nombre, String edad, String email, String pass)
            throws NumberFormatException, IOException, IllegalArgumentException {

        Matcher mather = pattern.matcher(email);
        if (nombre.equals("")) {
            throw new IllegalArgumentException("El nombre es vacio");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre es demasiado corto");
        } else if (edad.equals("")) {
            throw new IllegalArgumentException("La edad esta vacia");
        } else if (mather.find() != true) {
            throw new IllegalArgumentException("El email es incorrecto");
        } else {
            int intEdad = Integer.parseInt(edad);
            if (intEdad <= 12) {
                throw new IllegalArgumentException("La edad debe ser mayor a 12");
            } else {
                Persona p = new Persona(nombre, intEdad, email, pass);
                personas.add(p);
                return p;
            }
        }

        //return null;
    }

    public Persona updatePersonas(String nombreNew, String edadNew, String emailNew, String passNew) {

        Persona actual = null;
        int edadNueva = Integer.parseInt(edadNew);

        Iterator<Persona> iterador = personas.iterator();
        while (iterador.hasNext()) {
            actual = iterador.next();
            if (actual.IgualMail(emailNew)) {
                actual.setNombre(nombreNew);
                actual.setEdad(edadNueva);
                actual.setPass(passNew);
                actual.setEmail(emailNew);
            }

        }
        return actual;

    }

    public boolean deleteP(String nombre) {
        Persona perEliminar = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                perEliminar = p;
            }

        }
        if (perEliminar == null) {
            return false;
        } else {
            personas.remove(perEliminar);
            return true;
        }
    }

    public Persona getPersona(String email) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(email)) {
                return p;
            }
        }
        return null;
    }

}
