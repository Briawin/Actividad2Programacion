package actividad.com;

// Clase base
public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Getters (necesarios para que las clases hijas puedan acceder si es privado)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
