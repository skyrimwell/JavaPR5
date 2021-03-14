public class SecondSingleton {
    private static SecondSingleton instance = new SecondSingleton();

    private SecondSingleton() {
        System.out.println("SecondSingletonImpl");
    }

    public static SecondSingleton getInstance() {
        return instance;
    }
}
