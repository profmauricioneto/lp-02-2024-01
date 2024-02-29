package classrelationship.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public List<Curso> cursos;
    public String nomeUniversidade;
    public String descricao;

    public Universidade(String nomeUniversidade, String descricao) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = descricao;
        this.cursos = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void showNomeDosCursos() {
        for(Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }

    public int getTotalCursos() {
        return cursos.size();
    }

    public int getTotalAlunosUniversidade() {
        int soma = 0;
        for(Curso c: cursos) {
            soma += c.getTotalEstudantes();
        }
        return soma;
    }
}
