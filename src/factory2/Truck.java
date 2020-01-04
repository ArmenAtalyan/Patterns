package factory2;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Cargo delivered by truck.");
    }
}
