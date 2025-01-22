### Streams
1. **Definition**
   - Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports various methods that can be pipelined to produce the desired result. 
2. **Stream types**
   1. Intermediate Operations
      - Intermediate Operations are the types of operations in which multiple methods are chained in a row(Filter/maps/distinct...).
      - [All Intermediate Operations](StreamIntermediateOperationsExample.java)
   2. Terminal Operations
      - Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.
      - [All Terminal Operations](StreamTerminalOperationsExample.java)

![Diagram](streams-operations.png)

3. **Benefits**
   - No Storage
   - Pipeline of Functions
   - Laziness
   - Can be infinite
   - Can be parallelized
   - Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.

