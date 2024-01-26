package validacion.numero.feliz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroFeliz {
	
	public static boolean esNumeroFeliz(int n) {
        Set<Integer> numerosVisitados = new HashSet<>();

        while (n != 1 && !numerosVisitados.contains(n)) {
            numerosVisitados.add(n);
            n = sumaCuadradosDigitos(n);
        }

        return n == 1;
    }

    private static int sumaCuadradosDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            suma += digito * digito;
            num /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("Ingresa un número entero positivo: ");
            int numeroIngresado = scanner.nextInt();

            // Verificar si el número ingresado es feliz
            boolean resultado = esNumeroFeliz(numeroIngresado);

            // Mostrar el resultado
            System.out.println("¿El número " + numeroIngresado + " es feliz? " + resultado);

            // Preguntar al usuario si desea ingresar otro número
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
