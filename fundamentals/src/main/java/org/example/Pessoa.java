package org.example;

import java.util.Calendar;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public float altura;

    public Pessoa(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcularIdade() {
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoCorrente - anoNascimento;
        return idade;
    }
}
