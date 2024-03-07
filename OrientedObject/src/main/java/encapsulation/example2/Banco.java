package encapsulation.example2;

public class Banco {
    public static void main(String[] args) {
        Conta contaFilipe = new Conta(500);
        contaFilipe.showSaldo();
        contaFilipe.depositar(5000);
        contaFilipe.showSaldo();
        contaFilipe.sacar(3000);
        contaFilipe.showSaldo();
        contaFilipe.sacar(3000);
        contaFilipe.showSaldo();
    }
}
