package org.example.questao04;

public class Produto {
    public String nome;
    public String descricao;
    public String codigo;
    public double preco;

    public Produto(String nome, String descricao, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void mostrarDadosDoProduto() {
        System.out.println(nome);
        System.out.println(codigo);
        System.out.println(descricao);
        System.out.println(preco);
    }

    public double calcularPreco(int quantidade) {
        return quantidade * preco;
    }
}
