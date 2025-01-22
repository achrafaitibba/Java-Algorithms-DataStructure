# Most Used Design Patterns in Java
---

## **Creational Patterns**
Focus on object creation mechanisms, making systems independent of how objects are created, composed, and represented.

1. **Singleton**:
    - Ensures a class has only one instance and provides a global point of access to it.
    - Example: Database connection pools, logging systems.

2. **Factory Method**:
    - Defines an interface for creating objects but lets subclasses alter the type of objects created.
    - Example: `java.util.Calendar#getInstance()`.

3. **Abstract Factory**:
    - Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
    - Example: GUI libraries for creating platform-specific UI components.

4. **Builder**:
    - Separates the construction of a complex object from its representation.
    - Example: `StringBuilder`, `java.lang.StringBuffer`.

5. **Prototype**:
    - Creates new objects by copying an existing object (prototype).
    - Example: `java.lang.Cloneable`.

---

## **Structural Patterns**
Focus on how classes and objects are composed to form larger structures.

1. **Adapter**:
    - Allows incompatible interfaces to work together by converting the interface of a class into another interface.
    - Example: `java.util.Arrays#asList()`.

2. **Decorator**:
    - Adds behavior to objects dynamically without affecting other objects.
    - Example: `java.io.InputStream`, `java.io.OutputStream`.

---

## **Behavioral Patterns**
Focus on communication between objects and how responsibilities are assigned.

1. **Observer**:
    - Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
    - Example: Event handling in Java (e.g., `java.util.Observer`).

---

## **Other Notable Patterns**
1. **MVC (Model-View-Controller)**:
    - Separates an application into three interconnected components: Model (data), View (UI), and Controller (logic).
    - Example: Java frameworks like Spring MVC.

2. **Dependency Injection**:
    - Inverts control by injecting dependencies into a class rather than having the class create them.
    - Example: Spring Framework.

---