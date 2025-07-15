package actividad.com;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // llama al constructor de Persona
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(getNombre() + " está estudiando " + carrera + ".");
    }
}
