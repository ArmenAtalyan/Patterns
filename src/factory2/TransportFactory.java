package factory2;

import static factory2.TransportType.*;

public class TransportFactory {
    public static Transport createTransport(int transportType){
        switch (transportType){
            case TRUCK:
                return new Truck();
            case SHIP:
                return new Ship();
            case AIRPLANE:
                return new AirPlane();
        }
        return null;
    }
}
