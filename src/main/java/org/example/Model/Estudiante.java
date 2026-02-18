package org.example.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private boolean asistencia;
    private String SiNo;
    private LocalDate fecha;
    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<>();
    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asistencia = asistencia;
        SiNo = SiNo;
        this.fecha = fecha;
        ListaEstudiantes = ListaEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String getSiNo() {
        return SiNo;
    }

    public void setSiNo(String siNo) {
        SiNo = siNo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        ListaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", asistencia=" + asistencia +
                ", SiNo='" + SiNo + '\'' +
                ", fecha=" + fecha +
                ", ListaEstudiantes=" + ListaEstudiantes +
                '}';
    }
}
