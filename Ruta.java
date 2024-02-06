import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private List<String> paradas = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<>();
    private String horaInicio;
    private String horaLlegada;

    public void añadirParada(String parada) {
        paradas.add(parada);
    }

    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public String nombreParadaActual(int indice) {
        return paradas.get(indice);
    }

    // Métodos para configurar la hora de inicio y llegada
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    // Método para imprimir información de la ruta
    public void imprimirInfoRuta() {
        System.out.println("Hora de Inicio: " + horaInicio + ", Hora de Llegada: " + horaLlegada);
        System.out.println("Paradas: ");
        for(String parada : paradas) {
            System.out.println("- " + parada);
        }
        System.out.println("Empleados en la ruta:");
        for(Empleado empleado : empleados) {
            empleado.imprimirDatosPersonales();
        }
    }
}

