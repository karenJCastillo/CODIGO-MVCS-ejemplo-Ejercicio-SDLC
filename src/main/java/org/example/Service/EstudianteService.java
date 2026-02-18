package org.example.Service;

import org.example.Model.Estudiante;

import java.time.LocalDate;
import java.util.ArrayList;

public  interface EstudianteService {
    // METODO PARA CREAR ESTUDIANTES
    Estudiante CrearEstudiante (String nombre);


    //METODO PARA MARCAR ASISTENCIA
        public boolean MarcarAsistencia (Estudiante estudiante);

    // METODO PARA CONSULTAR ASISTENCIA
    public void ConsultarAsistencia (ArrayList<Estudiante> ListaEstudiantes); // aqui tengo un metodo vacio que se llama consultar asistencia que recibe una lista donde iran todos los estudiantes

    //METODO PARA ELIMINAR LA ASISTENCIA
    public void EliminarEstudiantes (ArrayList<Estudiante> ListaEstudiantes, Estudiante estudiante); // aqui le paso al metodo la lista y el objetoestudiante para poder mas adelante borrar los objetos estudiante

    // METODO PARA escribir asisitido no asistido
    public String AsistioONo (Estudiante estudiante);



}

