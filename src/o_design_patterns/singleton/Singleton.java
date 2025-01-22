package o_design_patterns.singleton;

class Singleton {

    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
