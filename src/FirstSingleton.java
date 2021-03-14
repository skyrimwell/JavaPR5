
public class FirstSingleton {
    private static FirstSingleton instance;

    private FirstSingleton() {
        System.out.println("FirstSingletonImpl");
    }

    public static FirstSingleton getInstance() {
        if(instance == null)
            instance = new FirstSingleton();
        return instance;
    }
}