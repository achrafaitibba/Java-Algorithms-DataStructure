package o_design_patterns.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
