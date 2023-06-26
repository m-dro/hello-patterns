package pl.mirekdrozd.singleton.example2;

public final class TheClassSingleton {
    private static volatile TheClassSingleton INSTANCE;

    private TheClassSingleton() {
    }

    public static TheClassSingleton getInstance(){
        if(INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (TheClassSingleton.class){
            if(INSTANCE == null){
                INSTANCE = new TheClassSingleton();
            }
            return INSTANCE;
        }
    }
}
