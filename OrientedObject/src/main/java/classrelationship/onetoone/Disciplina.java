package classrelationship.onetoone;

public class Disciplina {
    public Professor professor;
    public String nomeDisciplina;
    public int codigo;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor() {
        return professor.nome;
    }
}
