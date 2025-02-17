package App;

import Gestion.*;
import Input.Input;

public class EstudianteApp {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        Alta alta = gestion.getAlta();
        Baja baja = gestion.getBaja();
        Listado listado = gestion.getListado();
        Modificacion modificacion = gestion.getModificacion();

        int opcion;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Crear 2 Estudiantes");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Actualizar Nota");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Salir");
            opcion = Input.obtenerInt("Selecciona una opción:");

            switch (opcion) {
                case 1:
                    alta.crearEstudiantes();
                    break;

                case 2:
                    listado.listarEstudiantes();
                    break;

                case 3:
                    int idModificar = Input.obtenerInt("Introduce el ID del estudiante para modificar la nota:");
                    String asignaturaModificar = Input.obtenerString("Introduce el nombre de la asignatura para modificar la nota:");
                    double nuevaNota = Input.obtenerDouble("Introduce la nueva nota:");
                    modificacion.actualizarNota(idModificar, asignaturaModificar, nuevaNota);
                    break;

                case 4:
                    int idEliminar = Input.obtenerInt("Introduce el ID del estudiante para eliminar:");
                    baja.eliminarEstudiante(idEliminar);
                    break;

                case 5:
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 5);
    }
}
