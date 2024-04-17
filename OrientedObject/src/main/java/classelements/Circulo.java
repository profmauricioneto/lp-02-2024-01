package classelements;

public class Circulo {
    double raio;
    public double area() {
        return 3.14*raio*raio;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 3;
        double r = Math.PI;
        double e = Math.cos(90);
    }

}
