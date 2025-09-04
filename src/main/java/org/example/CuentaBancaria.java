public class CuentaBancaria {
    // Atributo privado
    private double saldo;

    // Constructor (inicia con saldo 0)
    public CuentaBancaria() {
        this.saldo = 0;
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se depositaron $" + monto);
        } else {
            System.out.println("El depósito debe ser mayor a 0.");
        }
    }

    // Método para retirar
    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Se retiraron $" + monto);
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El retiro debe ser mayor a 0.");
        }
    }

    // Getter para consultar saldo
    public double getSaldo() {
        return saldo;
    }
}