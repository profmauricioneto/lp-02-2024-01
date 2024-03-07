package encapsulation.example2;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldoPadrao() {
        return saldo;
    }
    public void showSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }

    public void sacar(double valor) {
        if ((saldo - valor) < 0 ) {
            System.out.println("Não há saldo suficiente!");
        } else {
            saldo -= valor;
        }
    }
}
