package utils;

import java.util.ArrayList;

public class Persona {
    int clave, edad, numero, codigoPostal;
    String nombre, apellido, calle;
    public static ArrayList<Persona>listaPersonas = new ArrayList<>();
    public Persona(int clave, int edad, int numero, int codigoPostal, String nombre, String apellido, String calle) {
        this.clave = clave;
        this.edad = edad;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
