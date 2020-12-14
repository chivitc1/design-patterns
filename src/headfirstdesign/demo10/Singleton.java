package demo10;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        // Double-checked locking
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
