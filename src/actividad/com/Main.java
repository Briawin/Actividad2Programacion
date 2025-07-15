package actividad.com;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Edwin", 20, "Ingeniería");
        Profesor profesor = new Profesor("Jenifer", 45, "Matemáticas");

        estudiante.saludar();   // Heredado de Persona
        estudiante.estudiar();  // Propio de Estudiante

        profesor.saludar();     // Heredado de Persona
        profesor.enseñar();     // Propio de Profesor
    }
}

