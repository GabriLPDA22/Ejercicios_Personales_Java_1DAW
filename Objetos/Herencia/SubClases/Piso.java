package Objetos.Herencia.SubClases;

import Objetos.Herencia.ClasePricipal.*;

public class Piso extends Inmueble {
    private int piso;

    public Piso(String direccion, double metrosCuadrados, int antiguedad, double precioBase, int piso) {
        super(direccion, metrosCuadrados, antiguedad, precioBase);
        this.piso = piso;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = this.calcularAjustePorAntiguedad();
        if (piso >= 3) {
            precioFinal *= 1.03; // Incremento del 3%
        }
        return precioFinal;
    }
}

