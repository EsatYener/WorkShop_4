package OOP.Workshop4_Interface;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Car accelerating at " + speed + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }
}
