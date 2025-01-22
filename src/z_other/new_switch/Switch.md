# Difference Between Old and New Switch in Java

Java 12 introduced a new, enhanced version of the `switch` statement, which was further refined in Java 13 and 14. Below is a comparison of the old and new `switch` syntax and features:

## 1. **Syntax**
- **Old Switch**:
  ```java
  switch (day) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      default:
          System.out.println("Invalid day");
  }
  ```
- **New Switch**:
  ```java
  switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Invalid day");
  }
  ```

## 2. **Arrow Syntax (`->`)**
- **Old Switch**: Uses `:` and requires `break` to prevent fall-through.
- **New Switch**: Uses `->` to separate the case label from the code block, eliminating the need for `break`.

## 3. **Returning Values**
- **Old Switch**: Cannot directly return a value; requires additional variables.
- **New Switch**: Can return a value directly using `yield` (Java 13+):
  ```java
  String dayType = switch (day) {
  case 1, 2, 3, 4, 5 -> "Weekday";
  case 6, 7 -> "Weekend";
  default -> throw new IllegalArgumentException("Invalid day");
  };
  ```
- [Example of Yield](Main.java):

## 4. **Multiple Case Labels**
- **Old Switch**: Requires separate `case` statements for multiple values.
- **New Switch**: Allows multiple values in a single `case`:
  ```java
  switch (day) {
      case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
      case 6, 7 -> System.out.println("Weekend");
  }
  ```

## 5. **Scope of Variables**
- **Old Switch**: Variables declared in one `case` block are visible in subsequent blocks (due to fall-through).
- **New Switch**: Each `case` block has its own scope, preventing unintended variable sharing.

## 6. **Exhaustiveness**
- **Old Switch**: Does not enforce handling all possible cases (e.g., for enums).
- **New Switch**: Encourages exhaustiveness, especially when returning a value.

## 7. **Readability**
- **Old Switch**: Verbose and prone to errors (e.g., missing `break`).
- **New Switch**: More concise and less error-prone.

## Example Comparison

### Old Switch
```java
int day = 2;
String dayName;
switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    default:
        dayName = "Invalid day";
}
System.out.println(dayName);
```

### New Switch
```java
int day = 2;
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid day";
};
System.out.println(dayName);
```