public class Prestamo {
    Usuario usuario;
    Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Prestamo exitoso: " + usuario.nombre
                + " (CI: " + usuario.cedula + ") se llevo \"" + libro.titulo + "\"");
        } else {
            System.out.println("No se pudo: el libro \"" + libro.titulo
                + "\" ya esta prestado, " + usuario.nombre + " debe esperar.");
        }
    }
}

