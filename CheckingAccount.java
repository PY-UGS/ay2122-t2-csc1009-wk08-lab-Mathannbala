public class CheckingAccount {

    private double account;
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public double getNumber(){
        return  this.account;
    }

    public void withdraw(double withdrawAmount) throws InsufficientFundsException{

        if(withdrawAmount > this.balance){

            throw new InsufficientFundsException(withdrawAmount - this.balance);
        }
        this.balance -= withdrawAmount;

    }

    public void deposit(double balance){
        this.balance +=balance;
    }

}
