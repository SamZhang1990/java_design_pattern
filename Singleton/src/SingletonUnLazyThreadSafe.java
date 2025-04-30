public class SingletonUnLazyThreadSafe {
    private static SingletonUnLazyThreadSafe instance = new SingletonUnLazyThreadSafe();

    private SingletonUnLazyThreadSafe(){}

    public static SingletonUnLazyThreadSafe getInstance() {
        return instance;
    }
}
