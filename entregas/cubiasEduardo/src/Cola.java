public class Cola {

    private Cliente[] clientes;
    private final int CAPACIDAD_MAXIMA = 30;
    private int tamaño;
    private Console console;

    public Cola() {
        clientes = new Cliente[CAPACIDAD_MAXIMA];
        tamaño = 0;
        console = new Console();
    }

    public boolean encolar(Cliente nuevoCliente) {
        if (estaLlena() || nuevoCliente == null) {
            return false;
        }

        if (nuevoCliente.tienePrioridad()) {
            insertarPrioritario(nuevoCliente);
        } else {
            insertarAlFinal(nuevoCliente);
        }

        tamaño++;
        return true;
    }

    private void insertarAlFinal(Cliente cliente) {
        clientes[tamaño] = cliente;
    }

    private void insertarPrioritario(Cliente clientePrioritario) {
        int indiceInsercion = 0;
        for (int i = 0; i < tamaño; i++) {
            if (clientes[i].tienePrioridad()) {
                indiceInsercion = i + 1;
            }
        }

        for (int i = tamaño; i > indiceInsercion; i--) {
            clientes[i] = clientes[i - 1];
        }

        clientes[indiceInsercion] = clientePrioritario;
    }

    public Cliente desencolar() {
        if (estaVacia()) {
            return null;
        }

        Cliente atendido = clientes[0];
        for (int i = 0; i < tamaño - 1; i++) {
            clientes[i] = clientes[i + 1];
        }
        clientes[tamaño - 1] = null;
        tamaño--;
        return atendido;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño >= CAPACIDAD_MAXIMA;
    }

    public int obtenerCantidadPersonasEnCola() {
        return tamaño;
    }

    public Cliente primero() {
        if (estaVacia()) {
            return null;
        }
        return clientes[0];
    }

    public void mostrar() {
        for (int i = 0; i < tamaño; i++) {
            clientes[i].mostrar();
        }
        console.writeln();
    }
}
