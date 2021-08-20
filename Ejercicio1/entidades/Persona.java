package Ejercicio1.entidades;

public class Persona {
    //Atributos
    private String nombre, apellido;
    private Integer edad;
    private long dni;
    private Perro mascota;

    //Constructor vacío
    public Persona() {
    }

    //Constructor completo
    public Persona(String nombre, String apellido, Integer edad, long dni, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    //Getters & Setters
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    //To String
     @Override
    public String toString() {
        return "\nPersona: " + nombre + " " + apellido + "\nEdad: " + edad + " DNI Nro.: " + dni + "\nPerro: " + mascota.toString();
    }
}
