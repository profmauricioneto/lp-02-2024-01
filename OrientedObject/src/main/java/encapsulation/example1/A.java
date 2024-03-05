package encapsulation.example1;

public class A {
    private int a = 100;
    private double altura;
    private double peso;

    private double calcIMC() {
        return peso /(altura * altura);
    }

    public double showIMC() {
        return calcIMC();
    }

    public void setAltura(double altura)  {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setA(int value) {
        a = value;
    }
    public int getA() {
        return a;
    }
}
