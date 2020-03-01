package abstractFactory;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
    Crossover createCrossover();
}
