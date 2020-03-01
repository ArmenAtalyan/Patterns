package abstractFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory = new ToyotaFactory();
        factory.createCoupe();
        factory.createCrossover();
        factory.createSedan();
        factory = new FordFactory();
        factory.createSedan();
        factory.createCrossover();
        factory.createCoupe();
    }
}
