public class SimuladorFila {

    private static final int MINUTOS_TOTALES = 120;
    private static final double PROBABILIDAD_LLEGADA = 0.6;
    private static final double PROBABILIDAD_ATENCION = 0.4;
    private static final double PROBABILIDAD_PRIORIDAD = 0.2;

    private Cola colaEspera;
    private int personasAtendidas;
    private Console console;

    public SimuladorFila() {
        this.colaEspera = new Cola();
        this.personasAtendidas = 0;
        this.console = new Console();
    }

    public void ejecutar() {
    }

    private void evaluarLlegadaCliente() {
    }

    private void evaluarAperturaCaja() {
    }

    private void mostrarResultados() {
    }
}
