package SegundaEva.Herencia.Objetos.Contraseñas;

import java.util.Random; 

public class Password {
    private int longitud; // Longitud de la contraseña.
    private String contraseña; // La contraseña.

    // Constructor por defecto
    public Password() {
        this.longitud = 8; // Longitud predeterminada de 8.
        this.contraseña = generarPassword(); // Generamos una contraseña aleatoria.
    }

    // Constructor con longitud específica
    public Password(int longitud) {
        this.longitud = longitud; // Establecemos la longitud especificada.
        this.contraseña = generarPassword(); // Generamos una contraseña aleatoria.
    }

    private String generarPassword() {
        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?/"; // Agregar símbolos si necesitamos
        Random generadorRandom = new Random();
        char[] passwordArray = new char[longitud];
    
        for (int i = 0; i < longitud; i++) {
            int caracterAleatorioIndex = generadorRandom.nextInt(caracteresPermitidos.length());
            passwordArray[i] = caracteresPermitidos.charAt(caracterAleatorioIndex);
        }
    
        return new String(passwordArray);
    }


    public boolean esFuerte() {
        int contadorMayusculas = 0; 
        int contadorMinusculas = 0; 
        int contadorNumeros = 0; 
    
        // Recorremos cada carácter de la contraseña.
        for (int i = 0; i < contraseña.length(); i++) {
            char caracterActual = contraseña.charAt(i); // Obtenemos el carácter actual.
    
            // Verificamos si el carácter actual es una mayúscula.
            if (Character.isUpperCase(caracterActual)) {
                contadorMayusculas++; // Aumentamos el contador de mayúsculas.
            }
            // Verificamos si el carácter actual es una minúscula.
            else if (Character.isLowerCase(caracterActual)) {
                contadorMinusculas++; // Aumentamos el contador de minúsculas.
            }
            // Verificamos si el carácter actual es un número.
            else if (Character.isDigit(caracterActual)) {
                contadorNumeros++; // Aumentamos el contador de números.
            }
        }
    
        // Devolvemos true (verdadero) si la contraseña es "fuerte".
        return contadorMayusculas > 2 && contadorMinusculas > 1 && contadorNumeros > 5;
    }
    

    // Métodos get para  la longitud y contraseña
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    // Método set para cambiar la longitud y generar una nueva contraseña
    public void setLongitud(int longitud) {
        this.longitud = longitud; // Actualizamos la longitud.
        this.contraseña = generarPassword(); // Generamos una nueva contraseña.
    }
}
