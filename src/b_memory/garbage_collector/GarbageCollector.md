## Garbage Collector
1. **Definition**:
   - The Garbage Collector is a thread that keeps track of all objects in the heap.
   - Periodically, it runs and deletes objects that are no longer needed (no longer reachable from the stack).
   - In Java, objects are dynamically allocated in the heap memory. Over time, objects that are no longer reachable or referenced by the program become “garbage” and need to be collected to free up memory for new objects. Garbage collection automates this process by identifying and reclaiming memory occupied by unreachable objects.
2. **How it works**:
   - **Mark** – this is where the garbage collector identifies which pieces of memory are in use and which aren’t.
   - **Sweep** – this step removes objects identified during the “mark” phase. 
3. **JVM has 6 types of GC implementations**:
   1. Serial Garbage Collector
      - It uses a “stop-the-world” approach.
      - It basically works with a single thread. As a result, this GC implementation freezes all application threads when it runs. Therefore, it’s not a good idea to use it in multi-threaded applications, like server environments.
   2. Parallel Garbage Collector
      - It’s the default GC of the JVM from Java 5 until Java 8 and is sometimes called Throughput Collectors. Unlike Serial Garbage Collector, it uses multiple threads for managing heap space, but it also freezes other application threads while performing GC.
      -  It divides the heap into smaller regions and uses multiple threads to perform garbage collection concurrently, reducing the duration of stop-the-world pauses.
   3. G1 Garbage Collector - Garbage-First
      - G1 (Garbage First) Garbage Collector is designed for applications running on multi-processor machines with large memory space. It’s available from the JDK7 Update 4 and in later releases.
      - Unlike other collectors, the G1 collector partitions the heap into a set of equal-sized heap regions, each a contiguous range of virtual memory. When performing garbage collections, G1 shows a concurrent global marking phase (i.e. phase 1, known as Marking) to determine the liveness of objects throughout the heap.
      - After the mark phase is complete, G1 knows which regions are mostly empty. It collects in these areas first, which usually yields a significant amount of free space (i.e. phase 2, known as Sweeping). That’s why this method of garbage collection is called Garbage-First.
   4. Z Garbage Collector - ZGC
   5. Shenandoah Garbage Collector
   6. Concurrent Mark-Sweep Garbage Collector - CMS

[Learn more hh](https://medium.com/@perspectivementor/java-memory-management-and-garbage-collection-fdf227569a61)
[And more](https://medium.com/@b.stoilov/everything-you-need-to-know-about-the-java-garbage-collector-8537459bf1a2)