package inheritance.questao04;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id, String name, Departamento departamento) {
        super(id, departamento);
        setName(name);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
