package inheritance.overloadExample;

public class Calculadora {
    public double sum(double... args) {
        double total = 0;
        for(double d: args) {
            total += d;
        }
        return total;
    }
    public int sum(int... args) {
        int total = 0;
        for(int d: args) {
            total += d;
        }
        return total;
    }
    public float sum(float... args) {
        float total = 0;
        for(float d: args) {
            total += d;
        }
        return total;
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        System.out.println("Calculadora Double: " + cal.sum(1.1,.11234577, 2.133333));
        System.out.println("Calculadora int: " + cal.sum(1,2,3,4,5,6));
    }
}
