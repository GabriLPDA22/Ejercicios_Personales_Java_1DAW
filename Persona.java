public class Persona {
    protected String nombre;
    protected int edad;

    public void cargarDatosPersonales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatosPersonales() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}


