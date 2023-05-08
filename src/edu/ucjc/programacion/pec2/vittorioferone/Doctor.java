package edu.ucjc.programacion.pec2.vittorioferone;

import java.util.Random;

public class Doctor extends Empleado {

    private String especialidad;

    public Doctor(String nombre, String apellidos, String dni, String id, int añosExperiencia, Turno turno, String especialidad) {
        super(nombre, apellidos, dni, id, añosExperiencia, turno);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void atenderPaciente(Paciente paciente) {
        System.out.println("El doctor " + getNombre() + " está atendiendo al paciente " + paciente.getNombre() + ".");

        boolean estaGrave = new Random().nextBoolean();
        if (estaGrave) {
            System.out.println("El paciente " + paciente.getNombre() + " está grave y necesita ser hospitalizado.");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " no está grave y puede irse a casa.");
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre=" + getNombre() +
                ", apellidos=" + getApellidos() +
                ", dni=" + getDni() +
                ", id='" + getId() + '\'' +
                ", añosExperiencia=" + getAñosExperiencia() +
                ", turno=" + getTurno() +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
