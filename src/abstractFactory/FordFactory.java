package abstractFactory;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public Crossover createCrossover() {
        return new FordCrossover();
    }
}
