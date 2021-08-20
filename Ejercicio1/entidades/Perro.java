package Ejercicio1.entidades;

import Ejercicio1.enumeradores.Raza;
import Ejercicio1.enumeradores.Tamanio;

public class Perro {

    //Atributos
    private String nombre;
    private Integer edad;
    private Raza raza;
    private Tamanio tamanio;

    //Constructor vacío
    public Perro() {
    }

    //Constructor básico
    public Perro(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Constructor completo
    public Perro(String nombre, Integer edad, Raza raza, Tamanio tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    //To String
    @Override
    public String toString() {
        return nombre + " Edad:" + edad + " Raza: " + raza + " Tamaño: " + tamanio;
    }
}
