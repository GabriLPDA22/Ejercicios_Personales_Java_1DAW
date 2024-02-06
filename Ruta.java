import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private List<String> paradas;
    private List<Empleado> empleados;

    public Ruta() {
        paradas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void añadirParada(String parada) {
        paradas.add(parada);
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void imprimirRuta() {
        System.out.println("Paradas de la ruta:");
        for(String parada : paradas) {
            System.out.println(parada);
        }
        System.out.println("Empleados asignados a la ruta:");
        for(Empleado empleado : empleados) {
            empleado.imprimirDatosPersonales();
            empleado.imprimirSueldo();
        }
    }
}

