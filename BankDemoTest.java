import java.util.Scanner;

public class BankDemoTest {

    public static void main(String[] args) throws Exception {

        double amount;

        Scanner input = new Scanner(System.in);
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("Please enter the amount you wish to deposit: ");
        amount = input.nextDouble();
        checkingAccount.deposit(amount);
        System.out.printf("Current amount is: $%.2f\n", checkingAccount.getBalance());
        System.out.println("Enter the amount to withdraw: ");
        amount = input.nextDouble();
        checkingAccount.withdraw(amount);
        System.out.printf("Current amount is: $%.2f\n", checkingAccount.getBalance());


    }

}
