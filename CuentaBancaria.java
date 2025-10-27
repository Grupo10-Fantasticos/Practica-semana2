public class CuentaBancaria {
      private String titular;
    private String numero;
    private double saldo;

    public CuentaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }

    public synchronized boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
    public String getNumero() { return numero; }

    @Override
    public String toString() {
        return "CuentaBancaria{titular='" + titular + "', numero='" + numero + "', saldo=" + saldo + "}";
    }
}
    
