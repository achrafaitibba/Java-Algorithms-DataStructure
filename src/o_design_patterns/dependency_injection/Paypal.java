package o_design_patterns.dependency_injection;

public class Paypal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done with paypal");
    }
}