public class Main {

    public static void main(String[] args) {
        SimuladorFila simulacionFija = new SimuladorFila(new Cola(15), "Simulacion 1: Cola con Capacidad Fija (15)");
        simulacionFija.ejecutar();

        SimuladorFila simulacionDinamica = new SimuladorFila(new ColaDinamica(15), "Simulacion 2: Cola Dinamica (Duplica Capacidad al Llenarse)");
        simulacionDinamica.ejecutar();
    }
}
