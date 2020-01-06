package abstractFactory;

public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedat() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

    @Override
    public Jeep createJeep() {
        return new ToyotaJeep();
    }
}
