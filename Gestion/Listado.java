package Gestion;

import java.util.ArrayList;

public class Listado {
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para listar. ");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
}
