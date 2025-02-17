package Gestion;

public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private Asignatura[] asignaturas;

    public Estudiante(int id, String nombre, int edad, String fechaNacimiento, Asignatura[] asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignaturas = asignaturas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Nombre: ").append(nombre).append(", Edad: ").append(edad)
                .append(", Fecha de Nacimiento: ").append(fechaNacimiento).append("\nAsignaturas:\n");
        for (Asignatura asignatura : asignaturas) {
            sb.append(" - ").append(asignatura.getNombre()).append(": ").append(asignatura.getNota()).append("\n");
        }
        return sb.toString();
    }
}
