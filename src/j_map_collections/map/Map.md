# Java Map Collections

## Introduction

- Maps store key-value pairs.
- Keys are unique, values can be duplicated.
- Provide fast access to values based on keys.

## Commonly Used Map Implementations

### HashMap

- **Definition**: A hash table-based implementation of the Map interface.
- **Key Features**:
  - Allows one null key and multiple null values.
  - Does not maintain any order of elements.
  - Not synchronized (not thread-safe).
  - Default initial capacity: 16

[//]: # (  - Default load factor: 0.75. 'What does this mean hh') 
- **Initialization**:
  ```java
  Map<String, Integer> map = new HashMap<>();
  ```
- **Example Code**:
  ```
  HashMap<String, Integer> map = new HashMap<>();
  map.put("Apple", 1);
  map.put("Banana", 2);
  System.out.println(map.get("Apple")); // Outputs 1
  ```

### LinkedHashMap

- **Definition**: A hash table and linked list implementation of the Map interface.
- **Key Features**:
  - Maintains a doubly linked list of entries to preserve insertion order.
  - Allows one null key and multiple null values.
  - Not synchronized (not thread-safe).
  - Can be configured to maintain access order.
- **Initialization**:
  ```
  Map<String, Integer> map = new LinkedHashMap<>();
  ```
- **Example Code**:
  ```
  LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
  map.put("Apple", 1);
  map.put("Banana", 2);
  // Iterates in insertion order
  for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
  }
  ```

### Hashtable

- **Definition**: A legacy hash table implementation of the Map interface.
- **Key Features**:
  - Does not allow null keys or null values.
  - Synchronized (thread-safe).
  - Does not maintain any order of elements.
  - Default initial capacity: 11.
- **Initialization**:
  ```
  Map<String, Integer> map = new Hashtable<>();
  ```
- **Example Code**:
  ```
  Hashtable<String, Integer> map = new Hashtable<>();
  map.put("Apple", 1);
  map.put("Banana", 2);
  System.out.println(map.get("Banana")); // Outputs 2
  ```

## Differences Between HashMap and Hashtable

- **Synchronization**: HashMap is not synchronized; Hashtable is synchronized.
- **Null keys and values**: HashMap allows null keys and values; Hashtable does not allow null keys or values.
- **Iteration**: HashMap iterators are fail-fast; Hashtable enumerations are not.
- **Legacy**: HashMap is part of the Collections Framework; Hashtable is older and not part of the Collections Framework.

## Summary

- **Use HashMap** when you need a high-performance, unsynchronized map without ordering guarantees.
- **Use LinkedHashMap** when you need to maintain insertion order or access order.
- **Use Hashtable** when you need a synchronized map, though ConcurrentHashMap is generally preferred for better scalability.

https://www.javatpoint.com/java-hashtable
https://www.javatpoint.com/java-hashmap
https://www.javatpoint.com/difference-between-hashmap-and-hashtable
