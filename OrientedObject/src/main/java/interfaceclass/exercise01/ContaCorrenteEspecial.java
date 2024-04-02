package interfaceclass.exercise01;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial() {
        super();
    }
    public ContaCorrenteEspecial(double montante, double taxa, String nome) {
        super(montante, taxa, nome);
    }

    @Override
    public void sacar(double quantia) {
        if (quantia > montante-quantia*taxa) {
            System.out.println("Não há saldo suficiente.");
        } else {
            montante -= quantia + quantia*taxa;
        }
    }
}
