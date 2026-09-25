public class Cliente {

    private boolean tienePrioridad;
    private int minutoLlegada;
    private Console console;

    public Cliente(boolean tienePrioridad, int minutoLlegada) {
        this.tienePrioridad = tienePrioridad;
        this.minutoLlegada = minutoLlegada;
        this.console = new Console();
    }

    public boolean tienePrioridad() {
        return tienePrioridad;
    }

    public int obtenerMinutoLlegada() {
        return minutoLlegada;
    }

    public void mostrar() {
        if (tienePrioridad) {
            console.write("[*P*]");
        } else {
            console.write("[ C ]");
        }
    }
}
