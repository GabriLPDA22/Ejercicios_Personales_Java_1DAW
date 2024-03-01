package Objetos.Herencia.SubClases;

import Objetos.Herencia.ClasePricipal.*;

public class Local extends Inmueble {
    private int numeroDeVentanas;

    public Local(String direccion, double metrosCuadrados, int antiguedad, double precioBase, int numeroDeVentanas) {
        super(direccion, metrosCuadrados, antiguedad, precioBase);
        this.numeroDeVentanas = numeroDeVentanas;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = this.calcularAjustePorAntiguedad();
        if (metrosCuadrados > 50) {
            precioFinal *= 1.01; // Incremento del 1%
        }
        if (numeroDeVentanas <= 1) {
            precioFinal *= 0.98; // Reducción del 2%
        } else if (numeroDeVentanas > 4) {
            precioFinal *= 1.02; // Incremento del 2%
        }
        return precioFinal;
    }
}

