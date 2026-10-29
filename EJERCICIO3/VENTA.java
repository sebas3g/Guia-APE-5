public class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.precio;
            System.out.println("Venta realizada de " + cantidad + " " + producto.nombre);
            System.out.println("Total a pagar: $" + total);
        }
    }
}
