package a_oop.abstraction.interfaces.test2;

interface Logger {
    default void logInfo(String message) {
        log("INFO", message);
    }

    default void logError(String message) {
        log("ERROR", message);
    }

    static void logSuccess(String message) {
        log("SUCCESS", message);
    }

    private static void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }


    class Main {
        public static void main(String[] args) {
            Application app = new Application();
            app.run();
            logSuccess("Hello World!");
        }
}

class Application implements Logger {
    public void run() {
        logInfo("Application started.");
        logError("An error occurred.");
        logSuccess("Application finished.");
    }
}

}