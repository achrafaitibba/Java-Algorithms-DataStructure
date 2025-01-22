### Steps to Use the `native` Keyword in Java

1. **Create a Java Class with a Native Method**  
   Write a Java class (`NativeExample.java`) that declares a native method and loads the native library.

   ```java
   public class NativeExample {
       public native void sayHello();

       static {
           System.loadLibrary("NativeLibrary");
       }

       public static void main(String[] args) {
           NativeExample example = new NativeExample();
           example.sayHello();
       }
   }
   ```

2. **Compile the Java Class**  
   Compile the Java class using `javac`:

   ```bash
   javac NativeExample.java
   ```

3. **Generate the C Header File**  
   Use `javac -h` to generate a C header file for the native method:

   ```bash
   javac -h . NativeExample.java
   ```

   This generates a header file (`NativeExample.h`).

4. **Implement the Native Method in C**  
   Create a C file (`NativeExample.c`) and implement the native method:

   ```c
   #include <stdio.h>
   #include "NativeExample.h"

   JNIEXPORT void JNICALL Java_NativeExample_sayHello(JNIEnv *env, jobject obj) {
       printf("Hello from native code!\n");
   }
   ```

5. **Compile the C Code into a Shared Library**  
   Compile the C code into a shared library. Use the appropriate command for your platform:

    - **Linux/MacOS:**
      ```bash
      gcc -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/linux" -shared -o libNativeLibrary.so NativeExample.c
      ```

    - **Windows:**
      ```bash
      gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o NativeLibrary.dll NativeExample.c
      ```

6. **Run the Java Program**  
   Run the Java program, ensuring the shared library is in the Java library path:

    - **Linux/MacOS:**
      ```bash
      java -Djava.library.path=. NativeExample
      ```

    - **Windows:**
      ```bash
      java -Djava.library.path=. NativeExample
      ```

---

### Expected Output

If everything is set up correctly, you should see:

```
Hello from native code!
```

---

This Markdown summary provides a concise guide to using the `native` keyword in Java.

https://www.geeksforgeeks.org/native-keyword-java/