package o_design_patterns.builder;

public class BuilderInterface {

    public static void main(String[] args) {
        Car car1 = new CarBuilder().setBrand("BMW").getCar();
        Car car2 = new CarBuilder().setBrand("Audi").setPrice(10000).getCar();
        System.out.println(car1);
        System.out.println(car2);
    }
}
