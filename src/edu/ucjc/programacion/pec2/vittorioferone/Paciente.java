package edu.ucjc.programacion.pec2.vittorioferone;

public class Paciente extends Persona {

    private String sintomas;
    private String enfermedad;
    private int numeroHabitacion;

    public Paciente(String nombre, String apellidos, String dni, String sintomas, String enfermedad, int numeroHabitacion) {
        super(nombre, apellidos, dni);
        this.sintomas = sintomas;
        this.enfermedad = enfermedad;
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void comer() {
        System.out.println("El paciente " + getNombre() + " está comiendo en la calle.");
    }
}
