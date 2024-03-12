package inheritance.questao04;

import java.util.List;
import java.util.ArrayList;
public class Departamento {
    private int idDepartamento;
    public String descricao;
    public List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    protected int getIdDepartamento() {
        return idDepartamento;
    }

    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void showPessoas() {
        for(Pessoa i: pessoas) {
            System.out.println(i.name);
        }
    }
}
