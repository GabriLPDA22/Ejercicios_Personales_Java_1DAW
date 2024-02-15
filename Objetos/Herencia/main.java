package Objetos.Herencia;

import Objetos.Herencia.SubClases.Piso;
import Objetos.Herencia.SubClases.Local;

public class main {
    public static void main(String[] args) {
        Piso piso = new Piso("Calle Falsa 123", 90, 10, 200000, 3);
        Local local = new Local("Plaza Real 21", 60, 16, 150000, 5);
    
        System.out.println("Precio del piso: " + piso.calcularPrecio());
        System.out.println("Precio del local: " + local.calcularPrecio());
    }
}    
