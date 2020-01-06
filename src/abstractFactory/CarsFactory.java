package abstractFactory;

public interface CarsFactory {
    Sedan createSedat();
    Coupe createCoupe();
    Jeep createJeep();
}
