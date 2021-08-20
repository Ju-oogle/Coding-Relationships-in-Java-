/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Ejercicio1.main;

import Ejercicio1.entidades.Perro;
import Ejercicio1.entidades.Persona;
import Ejercicio1.servicios.ServicioAdopcion;

public class NewMain {

    public static void main(String[] args) {
        ServicioAdopcion sa = new ServicioAdopcion();

        //String nombre, Integer edad, Raza raza, Tamanio tamanio
        Perro perro1 = new Perro("Pelusa the cat", 2);
        sa.adoptaPerro(perro1);
        Perro perro2 = new Perro("Mamba", 4);
        sa.adoptaPerro(perro2);

        //String nombre, String apellido, Integer edad, long dni, Perro mascota
        Persona persona1 = new Persona("Ale Jandro", "DeEGG", 17, 99999999, perro1);
        Persona persona2 = new Persona("Ju", "Lieta", 25, 32000000, perro2);

        System.out.println(persona1);
        System.out.println(persona2);

    }

}

