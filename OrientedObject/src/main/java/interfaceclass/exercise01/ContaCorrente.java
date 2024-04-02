package interfaceclass.exercise01;

public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    protected double montante;
    protected double taxa;
    protected int id = 0;
    protected String nome;

    public ContaCorrente() {
        this.montante = 0;
        this.taxa = 0.05;
        this.nome = "Unknow";

    }
    public ContaCorrente(double montante, double taxa, String nome) {
        this.montante = montante;
        this.taxa = taxa;
        this.nome = nome;
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

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
