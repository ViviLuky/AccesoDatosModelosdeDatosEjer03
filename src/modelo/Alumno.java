package modelo;

import java.io.Serializable;

public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private String id;
    private int asignaturas_matriculadas;

    public Alumno(String nombre, String apellidos, String id, int asignaturas_matriculadas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.asignaturas_matriculadas = asignaturas_matriculadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAsignaturas_matriculadas() {
        return asignaturas_matriculadas;
    }

    public void setAsignaturas_matriculadas(int asignaturas_matriculadas) {
        this.asignaturas_matriculadas = asignaturas_matriculadas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id='" + id + '\'' +
                ", asignaturas_matriculadas=" + asignaturas_matriculadas +
                '}';
    }
}
