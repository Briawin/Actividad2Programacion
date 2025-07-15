package actividad.com;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad); // llama al constructor de Persona
        this.materia = materia;
    }

    public void enseñar() {
        System.out.println(getNombre() + " enseña la materia de " + materia + ".");
    }
}
