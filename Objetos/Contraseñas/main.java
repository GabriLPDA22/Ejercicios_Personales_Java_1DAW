package Objetos.Contraseñas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de passwords a generar: ");
        int tamao = scanner.nextInt();
        System.out.print("Introduce la longitud de los passwords: ");
        int longitud = scanner.nextInt();

        Password[] passwords = new Password[tamao];
        boolean[] esFuerte = new boolean[tamao];

        for (int i = 0; i < tamao; i++) {
            passwords[i] = new Password(longitud);
            esFuerte[i] = passwords[i].esFuerte();
        }

        for (int i = 0; i < tamao; i++) {
            System.out.println(passwords[i].getContraseña() + " " + esFuerte[i]);
        }

        scanner.close();
    }
}

