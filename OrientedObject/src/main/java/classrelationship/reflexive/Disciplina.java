package classrelationship.reflexive;

import java.util.*;
public class Disciplina {
    public List<Disciplina> disciplinasComoPreRequisito;
    public List<Disciplina> disciplinasDePreRequisito;
    
    public Professor professor;
    public String nomeDisciplina;
    public int codigo;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.disciplinasDePreRequisito = new ArrayList<>();
        this.disciplinasComoPreRequisito = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addProfessor(Professor professor){
        this.professor = professor;
    }

}
