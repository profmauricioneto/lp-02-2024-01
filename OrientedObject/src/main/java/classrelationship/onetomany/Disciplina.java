package classrelationship.onetomany;

public class Disciplina {
    public Professor professor;
    public String nomeDisciplina;
    public int id;



    public Disciplina(String nomeDisciplina, int id, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.id = id;
        this.professor = professor;
    }

    public int getIdDisciplina() {
        return id;
    }

    public String getNameDisciplina() {
        return nomeDisciplina;
    }
}
