public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Car", 60),
            new Airplane("Airplane", 500),
            new Bicycle("Bicycle", 15)
        };

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println(v.name + " is moving at " + v.speed + " mph.");
            v.stop();
            System.out.println();
        }

        Car car = new Car("Car", 60);
        car.refuel();
        System.out.println();

        Airplane airplane = new Airplane("Airplane", 500);
        airplane.refuel();
        airplane.safetyCheck();
    }
}
