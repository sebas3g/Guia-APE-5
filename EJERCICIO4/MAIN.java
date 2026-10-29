
public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Maria", 500);
        Cuenta c2 = new Cuenta("Juan", 100);

        c1.mostrarSaldo();
        c2.mostrarSaldo();

        // transferencia valida
        c1.transferir(c2, 200);
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        // transferencia que falla
        c1.transferir(c2, 1000);
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
