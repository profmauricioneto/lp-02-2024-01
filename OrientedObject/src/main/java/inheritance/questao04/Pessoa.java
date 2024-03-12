package inheritance.questao04;

public class Pessoa {
    private int id;
    protected String name;
    public Departamento departamento;

    public Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
        this.name = "Unknown";
    }

    protected int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
