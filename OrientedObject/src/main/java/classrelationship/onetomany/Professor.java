package classrelationship.onetomany;

import java.util.List;

public class Professor {
    public List<Disciplina> disciplinas;
    public String nomeProfessor;
    public int idProfessor;

    public Professor(String nomeProfessor, int idProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
    }

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void showAllDisciplinas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.nomeDisciplina);
        }
    }

}
