package encapsulation.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        Scanner scan = new Scanner(System.in);
        double peso, altura;

        System.out.println("Peso: ");
        peso = scan.nextDouble();
        objA.setPeso(peso);

        System.out.println("Altura: ");
        altura = scan.nextDouble();
        objA.setAltura(altura);

        System.out.println("IMC: " +  objA.showIMC());
    }
}
