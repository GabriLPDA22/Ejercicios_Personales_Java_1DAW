public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Javier López", 30, 2500.00);
        Empleado empleado2 = new Empleado("Ana Gomez", 28, 2600.00);

        Ruta ruta = new Ruta();
        ruta.añadirParada("Inicio");
        ruta.añadirParada("Parada 1");
        ruta.asignarEmpleado(empleado1);
        ruta.asignarEmpleado(empleado2);

        ruta.imprimirRuta();
    }
}



