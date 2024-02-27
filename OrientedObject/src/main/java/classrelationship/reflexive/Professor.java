package classrelationship.reflexive;

import classrelationship.manytomany.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    public List<Disciplina> disciplinas;
    public String nomeProfessor;
    public int idProfessor;

    public Professor(String nomeProfessor, int idProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        this.disciplinas = new ArrayList<>();
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void addDisciplinas(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void mostrarDisciplinasMinistradas() {
        for(Disciplina d: disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
}
