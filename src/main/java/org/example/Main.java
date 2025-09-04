public class Main {
   public static void main(String[] args) {
      CuentaBancaria miCuenta = new CuentaBancaria();

      miCuenta.depositar(500.0);
      miCuenta.retirar(200.0);
      miCuenta.retirar(400.0); // Intento de sobregiro
      System.out.println("Saldo final: $" + miCuenta.getSaldo());
   }
}