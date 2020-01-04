package factory2;

public class Ship implements Transport  {
    @Override
    public void deliver() {
        System.out.println("Cargo delivered by ship.");
    }
}
