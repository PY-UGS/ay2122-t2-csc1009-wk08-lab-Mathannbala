public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {

        this.amount = amount;
        System.out.printf("Sorry but your account is short by $%.2f\n", getAmount());
    }

    public double getAmount() {
        return amount;
    }

}
