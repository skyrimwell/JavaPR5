public class ThirdSingleton {
    private ThirdSingleton() {
        System.out.println("ThirdSingleton");
    }

    private static class ThirdSingletonImplHolder {
        private final static ThirdSingleton instance = new ThirdSingleton();
    }

    public static ThirdSingleton getInstance() {
        return ThirdSingletonImplHolder.instance;
    }
}
