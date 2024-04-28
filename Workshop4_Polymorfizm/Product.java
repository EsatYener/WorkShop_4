package OOP.Workshop4_Polymorfizm;

public class Product<T> {

    private T id;
    private double price;

    public Product(T id, double price) {
        this.id = id;
        this.price = price;
    }
    public Product() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Polymorphic method
    public double calculateVAT() {
        return 0.18 * price;
    }
}
