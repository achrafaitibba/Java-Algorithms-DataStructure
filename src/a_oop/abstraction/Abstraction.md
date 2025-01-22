1. **Abstract Class / Interface**
   1. Abstract class
      1. **Definition**:
         An abstract class is a class that cannot be instantiated and is meant to be subclassed.
         It can contain both abstract methods (methods without a body) and concrete methods (methods with a body).
      2. **Use cases**:
         1. Shared Code: When you want to provide a common implementation for some methods while leaving other methods to be implemented by subclasses.
         2. State (Fields): When you need to define instance variables or fields that are shared across subclasses.
         3. Partial Implementation: When you want to provide a partial implementation of a class but leave some methods to be implemented by subclasses.
         4. Constructor Logic: When you need to define constructors to initialize state.
         5. When you want to share code among related classes.
         6. When you need to define non-static or non-final fields.
         7. When you need to define constructors.
      3. **More about abstract class**
         1. Can't have private abstract methods
         2. Can't be initiated
         3. Can't be final (final abstract class) -> because it won't be extended by other subclasses
         4. It defines a contract or behavior (If extended you're forced to implement its abstract methods)
         5. Can also have final methods (methods that cannot be overridden)
         6. Can have static methods
      4. **Why abstract class is faster than interface?**
         - An abstract class is faster than an interface because the interface involves a search before calling any overridden method in Java whereas abstract class can be directly used.
   2. Interfaces
      1. **Definition**:
         An interface is a completely abstract type that defines a contract (methods) that implementing classes must follow. Starting from Java 8, interfaces can also have default methods (with implementation) and static methods.
      2. **Use cases**:
         1. Multiple Inheritance: Java does not support multiple inheritance for classes, but a class can implement multiple interfaces.
         2. Pure Abstraction: When you want to define a contract without any implementation details.
         3. Loose Coupling: When you want to decouple the definition of behavior from the implementation.
         4. API Design: When designing APIs or frameworks where you want to enforce a specific set of methods.
         5. Functional Programming: With Java 8+, interfaces can be used for functional programming (e.g., Runnable, Comparator).   
         6. When you want to define a contract for unrelated classes.
         7. When you need multiple inheritance of type.
         8. When you want to provide optional functionality using default methods.
   3. Both (Interface + abstract class)
      - In some cases, you might use both. 
      - For example (check drivable/vehicle example):
         - - Define common behavior in an abstract class.
         - - Define additional contracts using interfaces.
   4. **Why having default methods** :
      - Adding new methods without breaking existing implementations
      - Adding new methods to interfaces without forcing all implementing classes to provide an implementation. This makes it easier to evolve APIs over time. 
      - Collection interface added (Stream(), forEach(), removeIf()), as default methods, overridden if needed but not forced to implement/modify existing implementations
      - Adding common behaviour (all classes will have same duplicated imp, bad practice )