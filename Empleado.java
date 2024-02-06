public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); // Llama al constructor de la clase base (Persona)
        this.sueldo = sueldo;
    }

    public void imprimirSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }
}


