package classrelationship.questao05;

public class Professor {
    public String nomeProfessor;
    public int id;
    public Disciplina disciplina;

    public Professor(String nomeProfessor, int id) {
        this.nomeProfessor = nomeProfessor;
        this.id = id;
    }
}
