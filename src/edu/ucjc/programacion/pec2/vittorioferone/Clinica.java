package edu.ucjc.programacion.pec2.vittorioferone;

import java.util.LinkedList;
import java.util.Queue;

public class Clinica {

    private String nombre;
    private String direccion;
    private Enfermero enfermero;
    private Doctor doctor;
    private Queue<Paciente> salaEspera;

    public Clinica(String nombre, String direccion, Enfermero enfermero, Doctor doctor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.enfermero = enfermero;
        this.doctor = doctor;
        this.salaEspera = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void agregarPaciente(Paciente paciente) {
        if (salaEspera.size() < 4) {
            salaEspera.add(paciente);
        } else {
            System.out.println("La sala de espera está llena. No se puede agregar más pacientes.");
        }
    }

    public void ficharEmpleados() {
        enfermero.fichar();
        doctor.fichar();
    }

    public void comerTodos() {
        enfermero.comer();
        doctor.comer();
        for (Paciente paciente : salaEspera) {
            paciente.comer();
        }
    }

    public void atenderPacientes() {
        while (!salaEspera.isEmpty()) {
            Paciente paciente = salaEspera.poll();
            StringBuilder sb = new StringBuilder();
            sb.append("Atendiendo al paciente: ");
            sb.append(paciente.getNombre());
            System.out.println(sb.toString());

            enfermero.examinarPaciente(paciente);
            doctor.atenderPaciente(paciente);
        }
    }
}