package inheritance.questao05;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private double salario;
    public List<Venda> vendas;
    public Funcionario(int codigo, String nomeFuncionario) {
        super(codigo);
        this.nome = nomeFuncionario;
        this.vendas = new ArrayList<>();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
