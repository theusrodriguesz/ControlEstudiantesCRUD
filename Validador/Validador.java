package Validador;


public class Validador {

    public static boolean esValidoId(int id) {
        return id > 0;
    }

    public static boolean esValidaNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public static boolean esValidoNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }


}
