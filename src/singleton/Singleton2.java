package singleton;

public class Singleton2 {
    private static volatile Singleton2 Instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(Instance == null){
            synchronized (Singleton2.class){
                if(Instance == null)
                    Instance = new Singleton2();
            }
        }
        return Instance;
    }
}
