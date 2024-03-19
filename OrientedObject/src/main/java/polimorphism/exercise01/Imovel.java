package polimorphism.exercise01;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
        this.endereco = "Unknown";
    }

    public double getPreco() {
        return preco;
    }

}
