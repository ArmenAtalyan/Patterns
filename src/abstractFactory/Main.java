package abstractFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory = new ToyotaFactory();
        factory.createCoupe();
        factory.createJeep();
        factory = new FordFactory();
        factory.createSedat();
        factory.createJeep();
    }
}
