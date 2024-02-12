public class Main {
    public static void main(String[] args) {
        // Creación de empleados
        Empleado empleado1 = new Empleado("Javier López", 30, 2500.00);
        Empleado empleado2 = new Empleado("Ana Gomez", 28, 2600.00);

        // Creación de la ruta y asignación de empleados y paradas
        Ruta ruta = new Ruta();
        ruta.añadirParada("Inicio");
        ruta.añadirParada("Parada 1");
        ruta.añadirParada("Final");
        
        // Subida de empleados
        ruta.subirEmpleado(empleado1);
        ruta.subirEmpleado(empleado2);

        // Establecimiento de horas de inicio y llegada
        ruta.setHoraInicio("08:00 AM");
        ruta.setHoraLlegada("10:00 AM");

        // la siguiente parada y bajada de un empleado
        ruta.avanzarParada();
        ruta.bajarEmpleado(empleado1);

        // la nueva parada actual y detalles de la ruta
        System.out.println("La ruta está en la parada: " + ruta.getNombreParadaActual());
        ruta.imprimirRuta();

        
    }
}





