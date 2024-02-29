package classrelationship.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public Universidade universidade;
    public List<Estudante> estudantes;
    public String nomeCurso;
    public int codigo;

    public Curso(String nomeCurso, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.estudantes = new ArrayList<>();
        this.universidade = universidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public int getTotalEstudantes() {
//        int cont = 0;
//        for(Estudante e: estudantes) {
//            cont++;
//        }
        return estudantes.size();

    }
}
