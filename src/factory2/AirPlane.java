package factory2;

public class AirPlane implements Transport  {
    @Override
    public void deliver() {
        System.out.println("Cargo delivered by airplane.");
    }
}
