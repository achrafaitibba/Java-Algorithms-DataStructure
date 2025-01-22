# Summary

## 1. Generics

Generics allow you to customize a "generic" method or class to whatever type you're working with. For example, suppose you have a method that adds two numbers together. Without generics, you might have to create multiple versions of this method:

```java
interface Math{
public int Add(int a, int b);

public double Add(double a, double b);

public float Add(float a, float b);
}
```
Generics allow you to create a single method that is customized for the type that invokes it.
```
public <T> T Add(T a, T b)
```
T is substituted for whatever type you use.

<br>

-We cannot use primitive data types like int, char.
```
Test<int> obj = new Test<int>(20); 
```
-But primitive type arrays can be passed to the type parameter because arrays are reference types.
```
ArrayList<int[]> a = new ArrayList<>();

```

-The common type parameters are as follows:
<br>
The type parameters naming conventions:
- T – Type
- E – Element
- K – Key
- N – Number
- V – Value

[More](https://www.baeldung.com/java-generics)