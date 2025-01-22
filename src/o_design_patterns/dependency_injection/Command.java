package o_design_patterns.dependency_injection;

public class Command {
    private int commandId;
    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getCommandId() {
        return commandId;
    }
    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }
}