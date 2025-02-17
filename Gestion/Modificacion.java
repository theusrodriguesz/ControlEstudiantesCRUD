package Gestion;

public class Modificacion {
    public void actualizarNota(int id, String nombreAsignatura, double nuevaNota) {
        for (Estudiante estudiante : Listado.estudiantes) {
            if (estudiante.getId() == id) {
                for (Asignatura asignatura : estudiante.getAsignaturas()){
                    if (asignatura.getNombre().equals(nombreAsignatura)) {
                        asignatura.setNota(nuevaNota);
                    }
                }
            }
        }
    }
}
