package Gestion;

import Input.Input;

public class Alta {
    public void crearEstudiantes() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce los datos del estudiante " + (i + 1));
            int id = Input.obtenerInt("Introduce el ID del estudiante:");
            String nombre = Input.obtenerString("Introduce el nombre completo del estudiante:");
            int edad = Input.obtenerInt("Introduce la edad del estudiante:");
            String fechaNacimiento = Input.obtenerString("Introduce la fecha de nacimiento del estudiante (DD/MM/AAAA):");

            String asignatura1Nombre = Input.obtenerString("Introduce el nombre de la primera asignatura:");
            double asignatura1Nota = Input.obtenerDouble("Introduce la nota de la primera asignatura:");
            String asignatura2Nombre = Input.obtenerString("Introduce el nombre de la segunda asignatura:");
            double asignatura2Nota = Input.obtenerDouble("Introduce la nota de la segunda asignatura:");

            Asignatura asignatura1 = new Asignatura(asignatura1Nombre, asignatura1Nota);
            Asignatura asignatura2 = new Asignatura(asignatura2Nombre, asignatura2Nota);
            Estudiante estudiante = new Estudiante(id, nombre, edad, fechaNacimiento, new Asignatura[]{asignatura1, asignatura2});
            Listado.estudiantes.add(estudiante);
        }
    }
}
