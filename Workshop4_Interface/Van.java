package OOP.Workshop4_Interface;

public class Van implements Vehicle {
    @Override
    public void start() {
        System.out.println("Van started");
    }

    @Override
    public void stop() {
        System.out.println("Van stopped");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Van accelerating at " + speed + " km/h");
    }

    @Override
    public void brake() {
        System.out.println("Van braking");
    }
}
