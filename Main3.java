abstract class Bank {
    abstract void calculateInterest();
}

class SavingsAccount extends Bank{
    private double balance;

    public void setBalance(double b){
        if(b >= 0) balance = b;
        else System.out.println("Balance cannot be negative!");
    }

    public double getBalance() {
        return balance;
    }

    @Override
    void calculateInterest(){
        double interest = balance * 0.05;
        System.out.println("Interest Earned: " + interest);
    }
}

public class Main3 {
    public static void main(String[] args){
        SavingsAccount myAcc = new SavingsAccount();

        myAcc.setBalance(5000);
        System.out.println("Current Balance: " + myAcc.getBalance());

        myAcc.calculateInterest();
    }
}