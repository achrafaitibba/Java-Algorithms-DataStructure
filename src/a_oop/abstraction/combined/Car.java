package a_oop.abstraction.combined;

public class Car extends Vehicle implements Drivable{
    @Override
    public void startEngine() {
        System.out.println("Car Engine started....");
    }

    @Override
    void move() {
        System.out.println("Car moving.....");
    }
}
