package l_concurrency_threads_multithreading;

class ThreadClass extends Thread {
    /**
     * Thread class methods
     *
        public void run(): is used to perform action for a thread.
        public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
        public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
        public void join(): waits for a thread to die.
        public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
        public int getPriority(): returns the priority of the thread.
        public int setPriority(int priority): changes the priority of the thread.
        public String getName(): returns the name of the thread.
        public void setName(String name): changes the name of the thread.
        public Thread currentThread(): returns the reference of currently executing thread.
        public int getId(): returns the id of the thread.
        public Thread.State getState(): returns the state of the thread.
        public boolean isAlive(): tests if the thread is alive.
        public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
     */
    public ThreadClass(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is running");
    }


    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass("Test");
        tc.start();
        Thread thread = new Thread("Test 2");
        thread.start();
        System.out.println(thread.getId()+ " is running");
        System.out.println(Runtime.getRuntime().availableProcessors());;
    }
}
