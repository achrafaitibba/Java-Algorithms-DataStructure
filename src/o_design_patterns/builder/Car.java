package o_design_patterns.builder;

class Car {
    private String brand;
    private String model;
    private String color;
    private String engine;
    private String gear;
    private String wheel;
    private int price;

    Car(String brand, String model, String color, String engine, String gear, String wheel, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.gear = gear;
        this.wheel = wheel;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getGear() {
        return gear;
    }

    public String getWheel() {
        return wheel;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", wheel='" + wheel + '\'' +
                ", price=" + price +
                '}';
    }
}
