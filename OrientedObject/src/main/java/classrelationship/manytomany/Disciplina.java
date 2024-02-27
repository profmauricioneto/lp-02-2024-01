package classrelationship.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    List<Professor> professores;
    public String nomeDisciplina;
    public int codigo;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professores = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void mostrarProfessoresDaDisciplina() {
        for(Professor p: professores) {
            System.out.println(p.getNomeProfessor());
        }
    }
}
