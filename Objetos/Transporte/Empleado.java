public class Empleado extends Persona {
    private double sueldo;

    // Constructor
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); // Llama al constructor de la superclase Persona
        this.sueldo = sueldo;
    }

    // Método para imprimir datos personales 
    @Override
    public void imprimirDatosPersonales() {
        super.imprimirDatosPersonales(); // Llamo al método de la superclase para imprimir nombre y edad
    }

    // Método para imprimir sueldo
    public void imprimirSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }

    // Getter para sueldo
    public double getSueldo() {
        return sueldo;
    }

    // Setter para sueldo
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}




