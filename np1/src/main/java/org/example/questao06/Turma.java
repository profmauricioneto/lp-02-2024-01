package org.example.questao06;

public class Turma {
    public String id;
    public int semestre;
    public Disciplina disciplina;

    public Turma(String id, int semestre, Disciplina discplina) {
        this.id = id;
        this.semestre = semestre;
        this.disciplina = discplina;
    }

    public String getId() {
        return id;
    }

    public int getSemestre() {
        return semestre;
    }

}
