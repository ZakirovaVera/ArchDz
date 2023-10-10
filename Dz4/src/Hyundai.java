public class Hyundai extends Car {
    Hyundai( String model, Transmition transmitionType, int numWeels, Fuel fuelType) {
        super(brand, model, transmitionType, numWeels, fuelType);
    }

    private boolean enabledCondicioner = false;
    private static final String brand = "Hyundai";

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
