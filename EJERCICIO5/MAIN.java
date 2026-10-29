public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ana", "1801234567");
        Usuario u2 = new Usuario("Luis", "1807654321");
        Libro libro = new Libro("Don Quijote de la Mancha");

        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar(); // Ana lo consigue
        p2.registrar(); // Luis no puede, ya esta prestado

        libro.devolver();
        p2.registrar(); // ahora Luis si puede
    }
}
