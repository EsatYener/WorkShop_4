package OOP.Workshop4_Polymorfizm;

public class Electronics extends Product<String>{
    public Electronics(String id,double price) {
        super(id,price);
    }

    public double calculateVAT() {
        return 0.20 * getPrice(); // Electronics products have 20% VAT
    }
}
