abstract class Vehicle {
    String name;
    int speed;

    public Vehicle(String n, int s) {
        name = n;
        speed = s;
    }

    public abstract void start();
    public abstract void stop();

    public void setSpeed(int s) {
        speed = s;
    }
}

interface Refuelable {
    void refuel();
}

interface Checkable {
    void safetyCheck();
}

class Car extends Vehicle implements Refuelable {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void refuel() {
        System.out.println(name + " is refueling...");
    }
}

class Airplane extends Vehicle implements Refuelable, Checkable {
    public Airplane(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void refuel() {
        System.out.println(name + " is refueling...");
    }

    @Override
    public void safetyCheck() {
        System.out.println(name + " is performing a safety check...");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }
}
