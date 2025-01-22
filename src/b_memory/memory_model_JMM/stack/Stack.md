### Stack memory (Static memory allocation and the execution of a thread)
1. **Definition**:
   - Each thread in a Java application has its own stack, which is used for storing short-lived variables and method call information. The stack is smaller in size compared to the heap but is crucial for handling method invocations and storing local variables and intermediate outcomes of expressions.
2. **How the stack memory works**:
   - Access to this memory is in Last-In-First-Out (LIFO) order. Whenever we call a new method, a new block is created on top of the stack which contains values specific to that method, like primitive variables and references to objects.
   - When the method finishes execution, its corresponding stack frame is flushed, the flow goes back to the calling method, and space becomes available for the next method.
   - When a new method is invoked, a new block called a “stack frame” is created on the stack. This stack frame contains all the local variables, parameters, and the return address of the method. Once the method completes execution, its stack frame is discarded, making this area highly efficient in managing memory that is only needed during a method call.
   - Example
   ````
   public class StackExample {
     public static void main(String[] args) {
     int result = add(5, 10);
     System.out.println("Result: " + result);
     }

   public static int add(int a, int b) {
   int sum = a + b;
   return sum; // The local variables 'a', 'b', and 'sum' are stored in the stack frame for the add method.
   }
   }
   ````
3. **Key features of Stack memory**
   - It grows and shrinks as new methods are called and returned, respectively.
   - Variables inside the stack exist only as long as the method that created them is running.
   - It’s automatically allocated and deallocated when the method finishes execution.
   - If this memory is full, Java throws java.lang.StackOverFlowError.
   - Access to this memory is fast when compared to heap memory.
   - This memory is threadsafe, as each thread operates in its own stack.

![Stack-animation](stack-animation.gif)