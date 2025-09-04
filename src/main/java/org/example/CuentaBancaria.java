public class CuentaBancaria {
    // Atributo privado
    private double saldo;

    // Constructor (opcional)
    public CuentaBancaria() {
        saldo = 0.0;
    }


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad);
        }
    }


    public double getSaldo() {
        return saldo;
    }
}