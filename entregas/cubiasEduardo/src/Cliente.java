public class Cliente {

    private int items;
    private boolean tienePrioridad;
    private Console console;

    public Cliente() {
        this(false);
    }

    public Cliente(boolean tienePrioridad) {
        this.tienePrioridad = tienePrioridad;
        items = this.generarItems();
        console = new Console();
    }

    private int generarItems() {
        final int MAXIMO_ITEMS = 10;
        final int MINIMO_ITEMS = 1;
        return (int) (Math.random() * (MAXIMO_ITEMS - MINIMO_ITEMS) + MINIMO_ITEMS);
    }

    public boolean tienePrioridad() {
        return tienePrioridad;
    }

    public int obtenerItems() {
        return items;
    }

    public void mostrar() {
        console.write("[" + items + "]_O/");
    }
}
