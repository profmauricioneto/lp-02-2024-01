package abstractclass.exercise01;

public abstract class Product {
    public String name;
    public double price;
    public int idProduct;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.idProduct = 0;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public abstract void update(String name, double price);
    public abstract void showInfo();
}
