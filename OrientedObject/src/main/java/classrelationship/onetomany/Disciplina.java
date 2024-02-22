package classrelationship.onetomany;

public class Disciplina {
    public String nomeDisciplina;
    public int id;

    public Professor professor;

    public Disciplina(String nomeDisciplina, int id) {
        this.nomeDisciplina = nomeDisciplina;
        this.id = id;
    }

    public int getIdDisciplina() {
        return id;
    }

    public String getNameDisciplina() {
        return nomeDisciplina;
    }
}
