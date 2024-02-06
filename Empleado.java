public class Empleado extends Persona {
    protected double sueldo;

    public void cargarSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void imprimirSueldo() {
        System.out.println("Nombre: " + nombre + ", Sueldo: " + sueldo);
    }
}

