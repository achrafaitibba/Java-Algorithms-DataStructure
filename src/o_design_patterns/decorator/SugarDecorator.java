package o_design_patterns.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
