package inheritance.questao05;

import java.util.Date;

public class Venda {
    private int codigoVenda;
    public Date data;
    public Funcionario funcionario;
    public Cliente cliente;

    public Venda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
        data = new Date();
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }
}
