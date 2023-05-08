package edu.ucjc.programacion.pec2.vittorioferone;

public class Empleado extends Persona {

    public enum Turno {
        MAÑANA, TARDE, NOCHE
    }

    private String id;
    private int añosExperiencia;
    private Turno turno;

    public Empleado(String nombre, String apellidos, String dni, String id, int añosExperiencia, Turno turno) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.añosExperiencia = añosExperiencia;
        this.turno = turno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void fichar() {
        System.out.println("Empleado con ID " + id + " está fichando.");
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo en la cafetería del hospital.");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + getNombre() +
                ", apellidos=" + getApellidos() +
                ", dni=" + getDni() +
                ", id='" + id + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", turno=" + turno +
                '}';
    }
}
