public class AirCar extends Car {
    AirCar(String model, Fuel fuelType) {
        super(brand, model, Transmition.auto, 0, fuelType);
    }

    private boolean enabledCondicioner = false;
    private static final String brand = "AirCar";

    void swithCondicioner() {
        enabledCondicioner = !enabledCondicioner;
        if (enabledCondicioner)
            System.out.println("condicioner enabled");
        else
            System.out.println("condicioner disabled");
    }

    @Override
    void move() {
        System.out.println(brand+" is moving");
    }

    @Override
    void service() {
        System.out.println(brand+" is servicing");
        System.out.println("Tuning is done");
    }

    @Override
    void turnOnHeadlights() {
        System.out.println("Headlights is on");
    }
}
