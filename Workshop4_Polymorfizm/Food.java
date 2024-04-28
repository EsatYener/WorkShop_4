package OOP.Workshop4_Polymorfizm;

public class Food extends Product<String> {
    public Food(String id, double price) {
        super(id, price);
    }

    // Food class overrides the calculateVAT method

    public double calculateVAT() {
        return 0.08 * getPrice(); // Food products have 8% VAT
    }
}
