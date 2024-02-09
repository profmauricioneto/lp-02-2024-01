package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        int qtdNomes;
        String nome;
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.print("Quantidade de nomes: ");
        qtdNomes = scan.nextInt();

        for (int i = 0; i < qtdNomes; i++) {
            System.out.print("Nome: ");
            nome = scan.next();
            nomes.add(nome);
        }

        for (String i: nomes) {
            System.out.println(i);
        }

        System.out.println(nomes);
    }
}
