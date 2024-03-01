package Objetos.Herencia.ClasePricipal;

public abstract class Inmueble {
    protected String direccion;
    protected double metrosCuadrados;
    protected int antiguedad; // Años de antigüedad del inmueble
    protected double precioBase;

    public Inmueble(String direccion, double metrosCuadrados, int antiguedad, double precioBase) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.antiguedad = antiguedad;
        this.precioBase = precioBase;
    }

    // Método para calcular el ajuste de precio por antigüedad
    public double calcularAjustePorAntiguedad() {
        if (antiguedad < 15) {
            return precioBase * 0.99; // Rebaja del 1%
        } else {
            return precioBase * 0.98; // Rebaja del 2%
        }
    }

    // Método abstracto para calcular el precio final del inmueble
    public abstract double calcularPrecio();
}
