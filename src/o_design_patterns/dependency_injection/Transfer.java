package o_design_patterns.dependency_injection;

public class Transfer implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment done with transfer");
    }
}