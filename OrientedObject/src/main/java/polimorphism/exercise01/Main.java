package polimorphism.exercise01;

public class Main {
    public static void main(String[] args) {
        ImovelNovo apBeiraMar = new ImovelNovoCorretor(500000, 15, 5);
        System.out.println("Valor total do Imovel Novo Corretor: " + apBeiraMar.calcularImovelNovo());
        ImovelNovo apBeiraMar2 = new ImovelNovo(500000, 15);
        System.out.println("Valor total do Imovel Novo: " + apBeiraMar2.calcularImovelNovo());
    }
}
