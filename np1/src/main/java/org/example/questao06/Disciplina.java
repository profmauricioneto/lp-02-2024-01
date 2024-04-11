package org.example.questao06;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    public List<Turma> turmas;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = 0;
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarTurma(Turma t) {
        turmas.add(t);
    }
}
