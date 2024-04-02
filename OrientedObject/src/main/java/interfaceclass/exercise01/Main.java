package interfaceclass.exercise01;

public class Main {
    public static void main(String[] args) {
        OperacoesBancarias contaNormal = new ContaCorrente(5000, 0.04, "mauricio");
        contaNormal.depositar(1000);
        contaNormal.sacar(2000);
        System.out.println("Saldo atual Normal: " + contaNormal.saldo());

        OperacoesBancarias contaEspecial = new ContaCorrenteEspecial(10000, 0.005, "mauricio");
        contaEspecial.depositar(5000);
        contaEspecial.sacar(3000);
        System.out.println("Saldo atual Especial: " + contaEspecial.saldo());
    }
}
