package l_concurrency_threads_multithreading;

class ThreadSafetyExample {

    private int sharedCounter = 0; // Shared mutable state

    public  void incrementCounter() {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter++; // Non-atomic operation
            }
        };
        new Thread(runnable).start();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafetyExample example = new ThreadSafetyExample();

        // Create 10 threads to increment the counter
        for (int i = 0; i < 100; i++) {
            example.incrementCounter();
        }

        // Wait for a short time (not enough for all threads to finish)
        Thread.sleep(1); // This ensures threads are interrupted, causing incorrect results

        // Print the final value of sharedCounter
        System.out.println("Final value: " + example.sharedCounter);
    }
}