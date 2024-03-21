package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carroMauricio = new Carro();
        carroMauricio.qtdPneus = 4;
        carroMauricio.qtdPortas = 4;
        carroMauricio.cor = "branco";
        System.out.println("O carro do Mauricio tem " + carroMauricio.qtdPneus + " pneus e " + carroMauricio.qtdPortas + " portas");
        System.out.println("A cor é " + carroMauricio.cor);
        carroMauricio.acelerar();
        carroMauricio.frear();

        System.out.println("-----------------");

        Carro carroMaria = new Carro();
        carroMaria.qtdPneus = 4;
        carroMaria.qtdPortas = 4;
        carroMaria.cor = "azul";
        System.out.println("O carro da Maria tem " + carroMaria.qtdPneus + " pneus e " + carroMaria.qtdPortas + " portas");
        System.out.println("A cor é " + carroMaria.cor);
        carroMauricio.acelerar();
        carroMauricio.frear();
    }
}