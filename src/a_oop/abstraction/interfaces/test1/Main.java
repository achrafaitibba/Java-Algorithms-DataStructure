package a_oop.abstraction.interfaces.test1;

import static a_oop.abstraction.interfaces.test1.Shape.*;

class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.surface(2,4));
        test();test1(); // implemented static methods within interface
    }
}
