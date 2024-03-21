package abstractclass.exercise01;

public class Ball extends Product {
    public Ball(String name, double price) {
        super(name, price);
    }

    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Id: " + idProduct);
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}
