public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Cuaderno", 2.50, 10);
        p.mostrarProducto();

        Venta v1 = new Venta(4);
        v1.aplicar(p);
        p.mostrarProducto();

        Venta v2 = new Venta(20);
        v2.aplicar(p);
        p.mostrarProducto();
    }
}
