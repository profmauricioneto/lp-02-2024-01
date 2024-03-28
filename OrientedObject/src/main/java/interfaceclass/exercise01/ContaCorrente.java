package interfaceclass.exercise01;

public class ContaCorrente implements OperacoesBancarias {
    protected double montante;
    protected double taxa;
    public ContaCorrente() {
        this.montante = 0;
        this.taxa = 0.05;

    }
    public ContaCorrente(double montante, double taxa) {
        this.montante = montante;
        this.taxa = taxa;
    }

    @Override
    public void depositar(double quantia) {
        montante += quantia;
    }

    @Override
    public void sacar(double quantia) {
        if (quantia > montante-quantia*taxa) {
            System.out.println("Não há saldo suficiente.");
        } else {
            montante -= quantia + quantia*taxa;
        }
    }

    @Override
    public double saldo() {
        return montante;
    }
}
