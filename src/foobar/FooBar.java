package foobar;

import java.util.Scanner;

public class FooBar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("Ingresa un número entero positivo: ");
            int n = scanner.nextInt();

            // Verificar las condiciones y mostrar el resultado
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FooBar");
            } else if (n % 3 == 0) {
                System.out.println("Foo");
            } else if (n % 5 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(n);
            }

            // Preguntar al usuario si desean ingresar otro número
            System.out.print("¿Quieres ingresar otro número? (Sí/No): ");
            String respuesta = scanner.next().toLowerCase();

            if (!respuesta.equals("si")) {
                continuar = false;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }

}
