/**
 * DCL mean double-checking locking
 */
public class SingletonDCLLazyThreadSafe {
    private volatile static SingletonDCLLazyThreadSafe instance;

    private SingletonDCLLazyThreadSafe() {}

    public static SingletonDCLLazyThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonDCLLazyThreadSafe.class) {
                if (instance == null)
                    instance = new SingletonDCLLazyThreadSafe();
            }
        }

        return instance;
    }
}
