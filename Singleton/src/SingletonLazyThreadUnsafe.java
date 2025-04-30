public class SingletonLazyThreadUnsafe {
    private static SingletonLazyThreadUnsafe instance;

    private SingletonLazyThreadUnsafe() {}

    public static SingletonLazyThreadUnsafe getInstance() {
        if (instance == null)
            instance =  new SingletonLazyThreadUnsafe();

        return instance;
    }
}
