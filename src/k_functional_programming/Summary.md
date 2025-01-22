1. ### Functional Interfaces 
aka SAM interfaces "Single Abstract Method Interfaces"
   1. **Definition**
      - A functional interface in Java is an interface that contains only one abstract method. Functional interfaces can have multiple default or static methods, but only one abstract method.
2. ### Lambda Expression
   1. **Definition**
      - It represents instances of functional interfaces (interfaces with a single abstract method). They provide a concise way to express instances of single-method interfaces using a block of code.
   2. **Example**
````
List<Integer> list = new ArrayList<>();
list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
````
- Explanation:
  1. The **filter** method of the **Stream** interface takes a **Predicate** as an argument. The **Predicate** is a functional interface defined in the **java.util.function** package. 
  2. Here's the definition of the Predicate interface:
  ```java
  @FunctionalInterface
  public interface Predicate<T> {
  boolean test(T t); // Single abstract method (SAM)

    // Other default and static methods (not abstract)
    default Predicate<T> and(Predicate<? super T> other) { ... }
    default Predicate<T> or(Predicate<? super T> other) { ... }
    default Predicate<T> negate() { ... }
    static <T> Predicate<T> isEqual(Object targetRef) { ... }
      }
  ```
  3. Same example with anonymous class
  ```
      list.stream().filter(new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
      return integer % 2 == 0;
      }
      }).forEach(System.out::println);
  ```

https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/
https://www.baeldung.com/java-functional-programming