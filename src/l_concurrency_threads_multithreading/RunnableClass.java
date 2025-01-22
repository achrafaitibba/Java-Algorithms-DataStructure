package l_concurrency_threads_multithreading;

class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName() + " is running."
        );
    }

    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

    }

}
