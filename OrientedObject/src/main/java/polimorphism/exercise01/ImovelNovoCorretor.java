package polimorphism.exercise01;

public class ImovelNovoCorretor extends ImovelNovo {
    private double porcentagemCorretor;

    public ImovelNovoCorretor(double preco, double adicional, double porcentagemCorretor) {
        super(preco, adicional);
        this.porcentagemCorretor = porcentagemCorretor;
    }

    @Override
    public double calcularImovelNovo() {
        double value = getPreco() + getPreco()*getAdicional()/100 + getPreco()*porcentagemCorretor/100;
        return value;
    }
}
