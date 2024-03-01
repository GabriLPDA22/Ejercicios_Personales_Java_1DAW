package Excepciones;

//*1. Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido: ...”. 
//Se deberá tratar la excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero válido. 
//En tal caso se mostrará el mensaje “Valor introducido incorrecto” */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un valor entero: ");
            int valor = sc.nextInt();
            System.out.println("Valor introducido: " + valor);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        } finally {
            sc.close();
        }
    }
}

