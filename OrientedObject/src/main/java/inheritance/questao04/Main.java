package inheritance.questao04;

public class Main {
    public static void main(String[] args) {
        Departamento unichristus = new Departamento(123);
        PessoaFisica mauricio = new PessoaFisica(1, "Mauricio", unichristus);
        PessoaFisica joao = new PessoaFisica(1, "Joao", unichristus);

        unichristus.addPessoa(mauricio);
        unichristus.addPessoa(joao);
        unichristus.showPessoas();
    }
}
