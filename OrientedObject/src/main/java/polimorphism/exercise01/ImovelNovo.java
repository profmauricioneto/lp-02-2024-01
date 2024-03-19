package polimorphism.exercise01;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double calcularImovelNovo() {
        double value = getPreco() + getPreco()*adicional/100;
        return value;
    }
}
