package OOP.Workshop4_Interface;

public class Main {
    public static void main(String[] args) {
        // Arayüz kullanarak farklı araçları kontrol etme
        Vehicle car = new Car();
        Vehicle van = new Van();

        // Otomobil işlemleri
        car.start();
        car.accelerate(60);
        car.brake();
        car.stop();

        System.out.println("--------------------");

        // Kamyonet işlemleri
        van.start();
        van.accelerate(50);
        van.brake();
        van.stop();
    }
}
