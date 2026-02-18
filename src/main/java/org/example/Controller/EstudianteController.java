package org.example.Controller;

import org.example.Model.Estudiante;
import org.example.Service.EstudianteService;
import org.example.View.EstudianteView;

import javax.swing.text.View;
import java.util.ArrayList;

public class EstudianteController {

        private final EstudianteService Service;
        private final EstudianteView view;

    public EstudianteController(EstudianteService service, EstudianteView view) {
        Service = service;
        this.view = view;
    }
    public Estudiante CrearEstudiante(String nombre) {

        Estudiante estudiante = Service.CrearEstudiante(nombre);
        view.Mostrarmensaje("Estudiante creado");
        return estudiante;

    }


    public boolean MarcarAsistencia(Estudiante estudiante) {
        Service.MarcarAsistencia(estudiante);
        view.Mostrarmensaje("el estudiante ha asistido ");
        return estudiante.isAsistencia();
    }


    public void ConsultarAsistencia(ArrayList<Estudiante> ListaEstudiantes) {
        Service.ConsultarAsistencia(ListaEstudiantes);
        view.Mostrarmensaje("Consulta de asistencia por estudiantes");


    }

    public void EliminarEstudiantes(ArrayList<Estudiante> ListaEstudiantes, Estudiante estudiante) {

        Service.EliminarEstudiantes(ListaEstudiantes,estudiante);
        view.Mostrarmensaje("El estudiante ha sido eliminado");

    }
    public String AsistioONo(Estudiante estudiante) {
        String resultado = Service.AsistioONo(estudiante);
        view.Mostrarmensaje("Acabas de marcar su asistencia");
        return resultado;   // 👈 ESTO es lo que va en el return
    }


}
