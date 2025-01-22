package a_oop.abstraction.interfaces.test1;

class Rectangle implements Shape {
//    int dx;
//    int dy;

    @Override
    public int surface(int dx, int dy) {
        return dx*dy;
    }
}
