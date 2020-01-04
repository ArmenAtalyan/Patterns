package factory2;

public class Main {

    public static void main(String[] args) {
        Transport a = TransportFactory.createTransport(0);
        a.deliver();
        Transport t = TransportFactory.createTransport(1);
        t.deliver();
        Transport sh = TransportFactory.createTransport(2);
        sh.deliver();
    }
}
