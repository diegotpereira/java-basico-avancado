public class Singleton {
    
    private Singleton() {}
    public String str;

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleInstance() {

        return singleton;
    }
}
