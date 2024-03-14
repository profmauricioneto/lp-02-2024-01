package inheritance.questao05;

public class Pessoa {
    private int codigo;
    protected String nome;

    public Pessoa(int codigo) {
        this.codigo = codigo;
        this.nome = "Unknown";
    }

    public int getCodigo() {
        return codigo;
    }

    protected String getNome() {
        return nome;
    }

}
