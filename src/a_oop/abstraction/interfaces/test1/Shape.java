package a_oop.abstraction.interfaces.test1;

interface Shape {
    int a = 10;
    int b = 20;

    int surface(int dx, int dy);

    private int surface() {
        return a * b;
    }

    static void test(){
        System.out.println("Inside test0");
    }

    static void test1(){
        System.out.println("Inside test1");
    }
}
