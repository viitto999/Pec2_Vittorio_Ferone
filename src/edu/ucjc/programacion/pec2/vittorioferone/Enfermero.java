package edu.ucjc.programacion.pec2.vittorioferone;

public class Enfermero extends Empleado {

    private String planta;

    public Enfermero(String nombre, String apellidos, String dni, String id, int añosExperiencia, Turno turno, String planta) {
        super(nombre, apellidos, dni, id, añosExperiencia, turno);
        this.planta = planta;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public void examinarPaciente(Paciente paciente) {
        System.out.println("El enfermero " + getNombre() + " está examinando al paciente " + paciente.getNombre() + ".");
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "nombre=" + getNombre() +
                ", apellidos=" + getApellidos() +
                ", dni=" + getDni() +
                ", id='" + getId() + '\'' +
                ", añosExperiencia=" + getAñosExperiencia() +
                ", turno=" + getTurno() +
                ", planta='" + planta + '\'' +
                '}';
    }
}
