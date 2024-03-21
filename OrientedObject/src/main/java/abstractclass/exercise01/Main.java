package abstractclass.exercise01;

public class Main {
    public static void main(String[] args) {
        Product heman = new Toy("Masters of Universe", 100);
        Product squareball = new Ball("Bola Quadrada do Kiko", 200);

        heman.showInfo();
        squareball.showInfo();
    }
}
