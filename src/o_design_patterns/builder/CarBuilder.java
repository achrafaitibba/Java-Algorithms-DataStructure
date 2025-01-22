package o_design_patterns.builder;

class CarBuilder {
    private String brand;
    private String model;
    private String color;
    private String engine;
    private String gear;
    private String wheel;
    private int price;


    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;

    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setGear(String gear) {
        this.gear = gear;
        return this;
    }

    public CarBuilder setWheel(String wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setPrice(int price) {
        this.price = price;
        return this;
    }
    public Car getCar() {
        return new Car(brand, model, color, engine, gear, wheel, price);
    }
}
