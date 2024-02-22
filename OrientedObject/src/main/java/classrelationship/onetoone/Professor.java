package classrelationship.onetoone;

public class Professor {
    public Disciplina disciplina;
    public String nome;
    public int id;

    public Professor(String nome, int id, Disciplina disciplina) {
        this.nome = nome;
        this.id = id;
        this.disciplina = disciplina;
    }

}
