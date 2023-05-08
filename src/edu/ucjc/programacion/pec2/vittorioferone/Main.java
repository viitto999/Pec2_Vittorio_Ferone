package edu.ucjc.programacion.pec2.vittorioferone;

import edu.ucjc.programacion.pec2.vittorioferone.Empleado.Turno;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor("Marcos", "García", "12345678A", "D001", 10, Turno.MAÑANA, "Cardiología");
        Enfermero enfermero = new Enfermero("Belén", "Vidal", "23456789B", "E001", 5, Turno.MAÑANA, "Planta 1");

        System.out.println(doctor);
        System.out.println(enfermero);

        Paciente paciente1 = new Paciente("Carlos", "Sánchez", "34567890C", "Dolor de cabeza", "Resfriado", 101);
        Paciente paciente2 = new Paciente("Laura", "González", "45678901D", "Dolor de estómago", "Gastroenteritis", 102);
        Paciente paciente3 = new Paciente("Marta", "Fernández", "56789012E", "Tos", "Bronquitis", 103);
        Paciente paciente4 = new Paciente("Pedro", "Ruiz", "67890123F", "Fiebre", "Gripe", 104);

        Clinica clinica = new Clinica("Clinica Fundación Jiménez Díaz", "Av. de los Reyes Católicos, 2", enfermero, doctor);

        clinica.agregarPaciente(paciente1);
        clinica.agregarPaciente(paciente2);
        clinica.agregarPaciente(paciente3);
        clinica.agregarPaciente(paciente4);

        clinica.ficharEmpleados();
        clinica.comerTodos();
        clinica.atenderPacientes();
    }
}
