package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el valor de A: ");
            int a = scanner.nextInt();

            System.out.print("Introduce el valor de B: ");
            int b = scanner.nextInt();

            int resultado = dividir(a, b);
            System.out.println("El resultado de A/B es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un valor entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            scanner.close();
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}

