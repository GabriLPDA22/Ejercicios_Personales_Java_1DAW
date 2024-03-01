package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. Implementa un programa que cree un vector tipo double de tamaño 5 y luego, utilizando un bucle, 
//pida cinco valores por teclado y los introduzca en el vector. Tendrás que manejar la/las posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.


public class Exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        int indice = 0;

        while (indice <= 5) {
            try {
                System.out.print("Introduce un valor para la posición " + indice + ": ");
                vector[indice] = sc.nextDouble();
                indice++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un valor numérico.");
                sc.nextLine(); 
            }
        }

        System.out.println("Vector ingresado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }

        sc.close();
    }
}
