package OOP.Workshop4_Polymorfizm;

public class Main {

    public static void main(String[] args) {
        // Ürünlerin fiyatları
        double electronicsPrice = 100;
        double foodPrice = 100;

        // Polymorphism: Her ürün için farklı KDV hesaplanır
        Product electronics = new Electronics("ABC321", electronicsPrice);
        Product food = new Food("ABC123", foodPrice);

        // KDV'li fiyatları hesapla ve yazdır
        System.out.println("Electronics VAT: $" + electronics.calculateVAT());
        System.out.println("Food VAT: $" + food.calculateVAT());
    }
}