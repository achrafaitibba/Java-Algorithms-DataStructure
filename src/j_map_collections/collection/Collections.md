### Java Collections Summary

This document provides a concise summary of the fundamental Java collection interfaces: **List**, **Set**, and **Queue**, along with their specific implementations: ArrayList, Stack, LinkedList for Lists; HashSet, LinkedHashSet for Sets; and common Queue implementations.

---

#### Collection Interfaces

| Interface | Ordered | Allows Duplicates | Description |
|-----------|---------|-------------------|-------------|
| List      | Yes     | Yes               | An ordered collection that allows duplicate elements. |
| Set       | No      | No                | An unordered collection that does not allow duplicate elements. |
| Queue     | Yes     | Yes               | An ordered collection for holding elements prior to processing, typically in FIFO order. |

---

#### Lists

- **ArrayList**
    - **Ordered**: Yes
    - **Duplicates**: Allowed
    - **Implementation**:
        - Backed by a dynamic array.
        - Provides fast random access.
        - Initial capacity is 10; resizes by increasing capacity by 50% when full.
    - **Example**:
      ```
      List<String> list = new ArrayList<>();
      list.add("Apple");
      list.add("Banana");
      System.out.println(list.get(0)); // Outputs "Apple"
      ```

- **LinkedList**
    - **Ordered**: Yes
    - **Duplicates**: Allowed
    - **Implementation**:
        - Uses a doubly linked list (A type of DS where each node contains 'data, previous pointer, next pointer').
        - Efficient for insertions and deletions but slower for access.
    - **Example**:
      ```
      List<String> list = new LinkedList<>();
      list.addFirst("Apple");
      list.addLast("Banana");
      System.out.println(list.getFirst()); // Outputs "Apple"
      ```

- **Stack**
    - **Ordered**: Yes (LIFO)
    - **Duplicates**: Allowed
    - **Implementation**:
        - Extends Vector (thus synchronized).
        - Supports stack operations like push and pop.
    - **Example**:
      ```
       LinkedList<String> list = new LinkedList<>();
       list.addFirst("Apple");
       list.addLast("Banana");
       System.out.println(list.getFirst()); // Outputs "Apple"
      ```

---

#### Sets

- **Hash Table**

    - **Ordered**: No
    - **Duplicates**: Not Allowed
    - **Implementation**:
        - A hash table is a data structure that stores key-value pairs.
        - It uses a **hash function** to compute an index (hash code) for each key, which determines where the value is stored in an underlying array.
        - Offers **constant time (O(1))** performance for basic operations like insert, delete, and search on average.
        - Handles collisions (when two keys hash to the same index) using techniques like **chaining** (linked lists at each index) or **open addressing** (probing for the next available slot).
    - **Example**:
      ```
      public class Main {
          public static void main(String[] args) {
              Hashtable<String, Integer> table = new Hashtable<>();
              table.put("Apple", 1);
              table.put("Banana", 2);

              System.out.println(table.get("Apple")); // Outputs "1"
              System.out.println(table.containsKey("Banana")); // Outputs "true"
          }
      }
- **HashSet**
    - **Ordered**: No
    - **Duplicates**: Not Allowed
    - **Implementation**:
        - Based on a hash table.
        - Offers constant time performance for basic operations.
    - **Example**:
      ```
      Set<String> set = new HashSet<>();
      set.add("Apple");
      set.add("Banana");
      System.out.println(set.contains("Apple")); // Outputs "true"
      ```

---

[//]: # (#### Queues)

[//]: # ()
[//]: # (- **LinkedList as Queue**)

[//]: # (    - **Ordered**: Yes &#40;FIFO&#41;)

[//]: # (    - **Duplicates**: Allowed)

[//]: # (    - **Implementation**:)

[//]: # (        - Implements Queue interface.)

[//]: # (        - Supports FIFO operations.)

[//]: # (    - **Example**:)

[//]: # (      ```)

[//]: # (      Queue<String> queue = new LinkedList<>&#40;&#41;;)

[//]: # (      queue.offer&#40;"Apple"&#41;;)

[//]: # (      queue.offer&#40;"Banana"&#41;;)

[//]: # (      System.out.println&#40;queue.poll&#40;&#41;&#41;; // Outputs "Apple")

[//]: # (      ```)

[//]: # ()
[//]: # (- **PriorityQueue**)

[//]: # (    - **Ordered**: Yes &#40;priority order&#41;)

[//]: # (    - **Duplicates**: Allowed)

[//]: # (    - **Implementation**:)

[//]: # (        - Based on a priority heap.)

[//]: # (        - Elements are ordered according to their natural ordering or a custom comparator.)

[//]: # (    - **Example**:)

[//]: # (      ```)

[//]: # (      Queue<Integer> priorityQueue = new PriorityQueue<>&#40;&#41;;)

[//]: # (      priorityQueue.offer&#40;5&#41;;)

[//]: # (      priorityQueue.offer&#40;3&#41;;)

[//]: # (      System.out.println&#40;priorityQueue.poll&#40;&#41;&#41;; // Outputs "3")

[//]: # (      ```)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (### Differences and Comparisons)

[//]: # ()
[//]: # (- **List vs Set**:)

[//]: # (    - Lists allow duplicates and maintain order.)

[//]: # (    - Sets do not allow duplicates and do not maintain order &#40;except LinkedHashSet&#41;.)

[//]: # ()
[//]: # (- **ArrayList vs LinkedList**:)

[//]: # (    - ArrayList provides faster access but slower insertions/deletions.)

[//]: # (    - LinkedList provides faster insertions/deletions but slower access.)

[//]: # ()
[//]: # (- **Queue Implementations**:)

[//]: # (    - Choose based on required order &#40;FIFO, priority, etc.&#41;.)

---

### Summary

- **Use List** when you need an ordered collection that allows duplicates and fast access by index.
- **Use Set** when you need a collection of unique elements without any specific order.
- **Use Queue** when you need to process elements in a specific order, such as FIFO or priority.

---