package factory2;

public class Train implements Transport {

    @Override
    public void deliver() {
        System.out.println("Cargo delivered by train.");
    }
}
