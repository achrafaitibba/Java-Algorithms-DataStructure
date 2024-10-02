
# 1. Array Declaration and Initialization

### Declare an array of integers (size 5)
```java
int[] numbers = new int[5];
```

### Declare and initialize an array
```java
int[] primes = {2, 3, 5, 7, 11};
```

# 2. Access Elements in an Array
### Access elements by index
```java
int firstPrime = primes[0];  // Get the first element (2)
System.out.println("First Prime: " + firstPrime);
```

# 3. Update Elements in an Array
### Modify an element at a specific index
```java
primes[1] = 13;  // Change 3 to 13
System.out.println("Updated Prime at index 1: " + primes[1]);
```

# 4. Find the Length of an Array
### Get the size of the array
```java
System.out.println("Array Length: " + primes.length);
```

# 5. Iterate Over an Array (Using For Loop)
### Standard for-loop iteration
```java
for (int i = 0; i < primes.length; i++) {
    System.out.println("Element at index " + i + ": " + primes[i]);
}
```

# 6. Iterate Over an Array (Using Enhanced For Loop)
### Enhanced for-loop (for-each)
```java
for (int prime : primes) {
    System.out.println("Prime: " + prime);
}
```

# 7. Fill an Array with Default Values

### Fill array with default values (0 for int, null for objects)
```java
int[] emptyArray = new int[5];  // All elements will be initialized to 0

for (int element : emptyArray) {
    System.out.println("Default value: " + element);
}
```

# 8. Sort an Array

### Sort the array
```java
import java.util.Arrays;

Arrays.sort(primes);
System.out.println("Sorted Array: " + Arrays.toString(primes));
```

# 9. Search for an Element in an Array
### Binary search (Array must be sorted)
```java
int index = Arrays.binarySearch(primes, 5);
System.out.println("Index of element 5: " + index);
```

# 10. Copy an Array

## 1. Using `Arrays.copyOf()`
### The Arrays.copyOf() method from the java.util.Arrays class is one of the easiest ways to copy all elements of an array to a new array.

```java
import java.util.Arrays;

int[] originalArray = {1, 2, 3, 4, 5};

// Copy the entire array
int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

System.out.println("Copied Array: " + Arrays.toString(copiedArray));
```

## 2. Using a `for` Loop
### You can manually copy each element of the array using a for loop. This is useful if you want full control over the copying process.

```java
// Original array
int[] originalArray = {1, 2, 3, 4, 5};

// Create a new array with the same length as the original array
int[] copiedArray = new int[originalArray.length];

// Copy each element using a loop
for (int i = 0; i < originalArray.length; i++) {
    copiedArray[i] = originalArray[i];
}

// Output the copied array
System.out.println("Copied Array: " + Arrays.toString(copiedArray));
```

## 3. Using clone() Method
### You can use the clone() method to copy an array. It creates a shallow copy of the array.

```java
int[] originalArray = {1, 2, 3, 4, 5};

// Use clone method to copy the array
int[] clonedArray = originalArray.clone();

System.out.println("Cloned Array: " + Arrays.toString(clonedArray));

```

## 4. Using Streams (Java 8+)
### Java 8 introduced the Stream API, which allows copying arrays using functional programming methods.

```java
import java.util.stream.IntStream;

int[] originalArray = {1, 2, 3, 4, 5};

// Use Stream to copy array
int[] copiedArray = IntStream.of(originalArray).toArray();

System.out.println("Copied Array: " + Arrays.toString(copiedArray));

```

# 11. Array of Objects

```java
// Declare an array of Strings
String[] names = {"Alice", "Bob", "Charlie"};

// Accessing and updating elements
names[1] = "David";  // Changing "Bob" to "David"
for (String name : names) {
System.out.println("Name: " + name);
}
```