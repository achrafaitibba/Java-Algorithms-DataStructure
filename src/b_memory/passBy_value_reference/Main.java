package b_memory.passBy_value_reference;

class Main {
    public static void main(String[] args) {
        /**
         * Pass by value:
         * 1. When 'int a = 10' executes:
         *    - A memory location is created in the stack
         *    - The value 10 is stored in this memory location
         *    - The variable 'a' points to this memory location
         *
         * 2. When 'b = a' executes:
         *    - A new memory location is created for 'b'
         *    - The value from 'a' (10) is COPIED to b's memory location
         *    - 'b' has its own independent copy of the value
         *
         * 3. When 'b = 100' executes:
         *    - Only b's memory location is updated to 100
         *    - a's memory location remains unchanged (still 10)
         *    - This demonstrates pass by value - changing b doesn't affect a
         *    - Each variable has its own independent memory space
         */
        int a = 10;
        int b;
        b = a;
        System.out.println(b); // --> 10
        b = 100;
        System.out.println(a); // --> 10
        System.out.println(b); // --> 100
        System.out.println("________________________________________________________");
        /**
         * Pass by reference:
         * 1. When 'Car car = new Car()' executes:
         *    - A Car object is created in the heap memory
         *    - A reference variable 'car' is created in the stack
         *    - 'car' stores the memory address/reference to the Car object
         *
         * 2. When 'car2 = car' executes:
         *    - A new reference variable 'car2' is created in the stack
         *    - car2 gets a copy of the memory address that 'car' holds
         *    - Both 'car' and 'car2' now point to the SAME object in heap
         *
         * 3. When 'car2.name = "Dacia"' executes:
         *    - Since both references point to the same object
         *    - Changing values through car2 affects the original object
         *    - That's why printing 'car' shows the changed values too
         *    - This shows both references share one object in memory
         * 4. When 'car3' executes:
         *    - A new Car object is created in the heap memory
         *    - A bew reference variable 'car3' is created in the stack
         */
        Car car = new Car();
        car.name = "Bmw";
        car.mileage = 2000;
        car.price = 50000;
        System.out.println(car); // --> Car{name='Bmw', mileage=2000, price=50000.0}
        System.out.println("________________________________________________________");
        Car car2;
        car2 = car;
        System.out.println(car2); // --> Car{name='Bmw', mileage=2000, price=50000.0}
        car2.name = "Dacia";
        car2.mileage = 100;
        //Different output, new values for (name, mileage)
        System.out.println(car2); // --> Car{name='Dacia', mileage=100, price=50000.0}
        System.out.println("________________________________________________________");
        System.out.println(car);// --> Car{name='Dacia', mileage=100, price=50000.0}
        System.out.println("________________________________________________________");
        Car car3 = new Car();
        System.out.println(car3); // --> Car{name='null', mileage=0, price=0.0}
    }
}
