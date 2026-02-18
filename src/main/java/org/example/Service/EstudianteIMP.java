package org.example.Service;

import org.example.Model.Estudiante;

import java.time.LocalDate;
import java.util.ArrayList;

public class EstudianteIMP implements EstudianteService {


    @Override
    public Estudiante CrearEstudiante(String nombre) {
        return new Estudiante(nombre); // este metodo va a retornar el nombre.

    }

    @Override
    public boolean MarcarAsistencia(Estudiante estudiante) {
        estudiante.setAsistencia(true); // con el set modifico la asitencia y la pongo en true
        return estudiante.isAsistencia(); // aqui retorno o devuelvo esta asistencia en true
    }

    @Override
    public void ConsultarAsistencia(ArrayList<Estudiante> ListaEstudiantes) {
        for (Estudiante estudianteEnLaLista: ListaEstudiantes){ // entregamos un objeto tipo estudiante llamado estudianteEnLaLista: que estra en la lista ListaEstudiantes, y e imprimen los que hayan
            System.out.println("NOMBRE DE ESTUDIANTE"+"    "+estudianteEnLaLista.getNombre()+"   "+"ESTADO"+estudianteEnLaLista.getSiNo());
        }

    }

    @Override
    public void EliminarEstudiantes(ArrayList<Estudiante> ListaEstudiantes, Estudiante estudiante) {
    ListaEstudiantes.remove(estudiante); // aqui de la lista estudiantes removemos el estudiante, osea a este metodo se le entrega la lista y el objeto estudiante.
    }

    @Override
    public String AsistioONo(Estudiante estudiante) {
        if (estudiante.isAsistencia()){
            estudiante.setSiNo("Asistio a la clase ");
            return "asistio";
        }else {
            estudiante.setSiNo("no asistio a la clase");
            return "no asistio ";
        }
    }


}
