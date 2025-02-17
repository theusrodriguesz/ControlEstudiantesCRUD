package Input;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerInt(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número entero válido.");
            scanner.next();
            System.out.print(mensaje);
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public static String obtenerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static double obtenerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next();
            System.out.print(mensaje);
        }
        double numero = scanner.nextDouble();
        scanner.nextLine();
        return numero;
    }
}
