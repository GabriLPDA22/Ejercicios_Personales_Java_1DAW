import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private List<String> paradas;
    private List<Empleado> empleados;
    private String horaInicio;
    private String horaLlegada;
    private int indiceParadaActual;


    public Ruta() {
        paradas = new ArrayList<>();
        empleados = new ArrayList<>();
        this.indiceParadaActual = 0;
    }

    public void añadirParada(String parada) {
        paradas.add(parada);
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void quitarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    // Método para establecer la hora de inicio de la ruta
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    // Método para establecer la hora de llegada de la ruta
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    // Método para obtener la hora de inicio de la ruta
    public String getHoraInicio() {
        return horaInicio;
    }

    // Método para obtener la hora de llegada de la ruta
    public String getHoraLlegada() {
        return horaLlegada;
    }

    // Método para obtener la hora de Subida del Empleado
    public void subirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //Método para obtener la hora de Bajada del Empleado
    public void bajarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public String getNombreParadaActual() {
        if (indiceParadaActual < paradas.size()) {
            return paradas.get(indiceParadaActual);
        } else {
            return "No hay más paradas";
        }
    }

    public void avanzarParada() {
        if (indiceParadaActual < paradas.size() - 1) {
            indiceParadaActual++;
        } else {
            System.out.println("La ruta ha llegado a su destino final.");
        }
    }

    public void imprimirRuta() {
        System.out.println("Paradas de la ruta:");
        for(String parada : paradas) {
            System.out.println(parada);
        }

        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de llegada: " + horaLlegada);

        System.out.println("Empleados asignados a la ruta:");
        for (Empleado empleado : empleados) {
            empleado.imprimirDatosPersonales();
            empleado.imprimirSueldo();
        }
        

    }
}

