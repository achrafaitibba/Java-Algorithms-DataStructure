package o_design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + ", $" + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + ", $" + coffee.getCost());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + ", $" + coffee.getCost());
    }
}
