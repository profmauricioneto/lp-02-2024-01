package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Carro pajero = new Carro();
//        pajero = null;

        Pessoa mauricio = new Pessoa("Mauricio Neto", 1900, 1.62f);

        mauricio.imprimirDados();
        System.out.println("Sua idade é: " + mauricio.calcularIdade());
    }
}