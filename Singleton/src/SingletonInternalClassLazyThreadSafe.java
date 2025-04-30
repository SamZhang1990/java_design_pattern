public class SingletonInternalClassLazyThreadSafe {
    private static class Holder {
        private static final SingletonInternalClassLazyThreadSafe INSTANCE = new SingletonInternalClassLazyThreadSafe();
    }

    private SingletonInternalClassLazyThreadSafe() {}

    public static SingletonInternalClassLazyThreadSafe getInstance() {
        return Holder.INSTANCE;
    }
}
