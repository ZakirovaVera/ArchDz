public class Main {
    public static void main(String[] args) {
        Lada vesta = new Lada("Vesta", Transmition.auto, FourWeelCar.numWeels, 1, Fuel.Gaz);
        vesta.move();

        Hyundai hyundai = new Hyundai("elantra", Transmition.manual, FourWeelCar.numWeels, Fuel.Gaz);
        hyundai.swithCondicioner();
        hyundai.swithCondicioner();
    }
}