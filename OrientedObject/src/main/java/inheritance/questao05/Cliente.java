package inheritance.questao05;


import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    List<Venda> compras;
    public Cliente(int codigo, String nomeCliente) {
        super(codigo);
        this.nome = nomeCliente;
        this.compras = new ArrayList<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
