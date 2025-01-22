### Thread
1. **Definition**
   - Threads are lightweight subprocesses, representing the smallest unit of execution with separate paths.
2. **Implementation in two different ways**
   1. #### Extending Thread class
      - [Implementation](ThreadClass.java)
      - The Thread class provides built-in support for multithreading
   2. #### Implementing Runnable interface
      - [Implementation](RunnableClass.java)
      - Runnable interface defines a single method, run() that contains the code to be executed by the thread.
      - By implementing the Runnable interface, we can decouple the task from the thread itself, promoting better code organization and reusability.
3. **Thread lifecycle**
   - New State
   - Active State
     - Runnable : Thread is ready to run
     - Running
   - Waiting/Blocked State
   - Timed Waiting State
   - Terminated State

### MultiThreading
1. **Definition**
   - Multithreading is a specific implementation of concurrency where multiple threads are used to execute tasks simultaneously.
   - Multithreading allows a program to perform multiple tasks at the same time by leveraging multiple CPU cores
### Concurrency
1. **Definition**
    - The ability of a system to perform multiple operations or tasks simultaneously
    - Allows us to use and benefit from multi-core processor systems
    - Concurrency Can Be Achieved Without Multithreading



https://docs.oracle.com/cd/E19253-01/816-5137/mtintro-25092/index.html#:~:text=In%20a%20multithreaded%20process%20on,are%20not%20actually%20running%20simultaneously.
https://www.geeksforgeeks.org/java-threads/
https://medium.com/@AlexanderObregon/beginners-guide-to-java-threads-80ee370b3cb5
https://medium.com/@lakshyachampion/a-comprehensive-guide-to-multithreading-and-concurrency-in-java-9bf8a0a0bb82
https://medium.com/@AlexanderObregon/concurrent-programming-in-java-simplifying-complex-tasks-d7adab6d25c6
https://medium.com/@AlexanderObregon/java-multithreading-and-concurrency-best-practices-39c86602e666
https://www.baeldung.com/java-concurrency
-----
/Thread safety with lambda [Example](/src/l_concurrency_threads_multithreading/threads/ThreadSafetyExample.java)
https://medium.com/@nagarjun_nagesh/lambda-functions-and-thread-safety-in-java-6a391a0a80ec#:~:text=If%20lambda%20functions%20do%20not,they%20are%20inherently%20thread%2Dsafe.&text=In%20this%20example%2C%20the%20lambda%20function%20simply%20prints%20the%20task,lambda%20function%20is%20thread%2Dsafe
https://www.baeldung.com/java-thread-safety
