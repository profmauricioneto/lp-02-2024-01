package polimorphism.exercise01;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularImovelVelho() {
        double value = getPreco() - getPreco()*desconto/100;
        return value;
    }
}
