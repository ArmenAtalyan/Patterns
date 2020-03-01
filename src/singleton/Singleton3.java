package singleton;

public class Singleton3 {

    public static class SingletonHolder{
        public static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
