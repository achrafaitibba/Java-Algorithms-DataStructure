# Java Exceptions Summary

## Exception Types

### Checked Exceptions
- **Definition**: Exceptions checked at compile time.
- **Examples**: `IOException`, `SQLException`.

### Unchecked Exceptions
- **Definition**: Exceptions not checked at compile time; subclasses of `RuntimeException`.
- **Examples**: `NullPointerException`, `ArithmeticException`.

---

## Error Types

### Compile-Time Errors
- **Definition**: Errors detected by the compiler (e.g., syntax errors, checked exceptions).

### Runtime Errors
- **Definition**: Errors occurring during program execution (e.g., unchecked exceptions).

---

## `throw` vs `throws`

| **Keyword** | **Usage**                  | **Description**                                      |
|-------------|----------------------------|------------------------------------------------------|
| `throw`     | Inside a method            | Throws a specific exception instance.               |
| `throws`    | In method signature        | Declares exceptions the method might throw.         |

---

## Handling Exceptions
- **Handled Exceptions**: Use `try-catch` blocks for both checked and unchecked exceptions.
- **Uncaught Exceptions**: Unchecked exceptions propagate up the call stack if not caught.

---

## Checked vs Unchecked Errors

| **Type**       | **Description**                          | **Examples**                     |
|-----------------|------------------------------------------|-----------------------------------|
| **Checked**     | Must be handled or declared (`throws`).  | `IOException`, `ClassNotFoundException`. |
| **Unchecked**   | No need to handle or declare.            | `NullPointerException`, `ArrayIndexOutOfBoundsException`. |

---