package Gestion;

public class Baja {
    public void eliminarEstudiante(int id) {
        Listado.estudiantes.removeIf(estudiante -> estudiante.getId() == id);
    }
}
