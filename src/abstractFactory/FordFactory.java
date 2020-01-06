package abstractFactory;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedat() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public Jeep createJeep() {
        return new FordJeep();
    }
}
