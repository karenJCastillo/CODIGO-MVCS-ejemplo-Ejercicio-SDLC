package org.example;


import org.example.Controller.EstudianteController;
import org.example.Model.Estudiante;
import org.example.Service.EstudianteIMP;
import org.example.Service.EstudianteService;
import org.example.View.EstudianteView;

import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> ListaEstudiantesMAIN = new ArrayList<>(); //creo la lista que almacenaran los estudiantes

        EstudianteService service =  new EstudianteIMP(); // creacion de un objeto tipo estudiante

        EstudianteView view = new EstudianteView();

        EstudianteController controller = new EstudianteController(service, view    );
        Estudiante estudiante1 = null; // es para que la variable exista fuera del switch
        int opcion;
        do {

            System.out.printf(
                    "\"1. Crear estudiante\" +\n" +
                    "\"2. registrar asistencia del estuidante\" +\n" +
                    "\"3. checar lista de asistencia \" +\n" +
                    " \"4. eliminar estudiante del registro de asistencia\"");

             opcion = scanner.nextInt();
            scanner.nextLine(); //para limpiar el teclado




            switch (opcion){
                case 1:
                    System.out.println("Introduce nombre del estudiante");
                    String nombreAgregoYO = scanner.nextLine();
                    estudiante1 = controller.CrearEstudiante(nombreAgregoYO); // agrego el nombre por medio del usuario

                    ListaEstudiantesMAIN.add(estudiante1); // agrego estudiante  a la lista
                    break;

                case 2: //registrar asistencia
                    // pide
                    System.out.println("ingresa el nombre del estudiante");
                    String nombreEstudiante = scanner.nextLine();
                    boolean find = false;

                    for (Estudiante o : ListaEstudiantesMAIN){
                        if(o.getNombre().equals(nombreEstudiante)){
                            find = true;
                            System.out.println("ingresa la fecha de tu clase ");
                            String fechaT = scanner.nextLine();

                            DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/y"); // para que java acepte este fomrato de fecha
                            LocalDate fecha = LocalDate.parse(fechaT,formato); // convertir el string en tipo fecha para el normal es d-m-a



                            if (o.getFecha() != null && o.getFecha().equals(fecha)){
                                System.out.println("el estudiante ya ha sido registrado");
                            }else{
                                o.setFecha(fecha); // se guarda la fecha
                                System.out.println("tu estudiante asistio si: 1 no: cualquier numero");
                                int opcion2 = scanner.nextInt();
                                if (opcion2 == 1 ){
                                    controller.MarcarAsistencia(o);
                                   controller.AsistioONo(o);
                                } else{
                                    System.out.println("no asistio");
                                    o.setAsistencia(false);
                                   controller.AsistioONo(o);
                                }


                            }
                        }else {
                            System.out.println("el estudiante no existe");
                        }
                    }


                    break;
                case 3:
                    System.out.println("La lista de asistencia es ");
                    controller.ConsultarAsistencia(ListaEstudiantesMAIN);
                    break;
                case 4:
                    boolean findd = false;

                    System.out.println("ingrese el nombre de su estudiante ");
                    String nombreE = scanner.nextLine();
                    for (Estudiante i: ListaEstudiantesMAIN){
                        if (i.getNombre().equals(nombreE)){
                            controller.EliminarEstudiantes(ListaEstudiantesMAIN,i);
                            findd = true;
                            break;
                        }
                        System.out.println("no se ha encontrado un estudiante registrado con este nombre");
                    }


            }


        }while  (opcion != 0);























    }
}