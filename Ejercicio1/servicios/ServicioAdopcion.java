package Ejercicio1.servicios;

import Ejercicio1.entidades.Perro;
import Ejercicio1.enumeradores.Raza;
import Ejercicio1.enumeradores.Tamanio;

import java.util.Scanner;

public class ServicioAdopcion {

    Scanner leer;

    //Buena practica
    public ServicioAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    
    public void adoptaPerro(Perro perrito) {
        
        System.out.println("---- Razas ----");
        //recorre desde los valores del enum Raza y por cada vuelta del for
        // le asigna un valor del enum a la variable aux.
        for (Raza aux : Raza.values()) {
            System.out.println(aux);
        }
        
        System.out.println("---- Tamaños ----");
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux);
        }

        System.out.println("\nEscoja la raza y el tamaño del animal: ");
        String varRaza = leer.next();
        String varTam = leer.next();

        //Chequea si la entrada del user es igual al objeto auxiliar del enum
        //convertido a String

        for (Raza aux : Raza.values()) {
            if (varRaza.equalsIgnoreCase(aux.toString())) {
                perrito.setRaza(aux);
            }
        }

        for (Tamanio aux : Tamanio.values()) {
            if (varTam.equalsIgnoreCase(aux.toString())) {
                perrito.setTamanio(aux);
            }

        }

    }

}
