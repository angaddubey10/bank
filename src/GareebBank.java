package src;

public class GareebBank implements Bank{
    int accountNo;
    String name;
    int balance;
    double interestRate;

    public GareebBank(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void addMoney(int money) {
        balance = balance + money;
        System.out.println("Your total balance is "+balance);
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(money<=balance){
            balance = balance - money;
            System.out.println(money + " has been withdrawn");
            System.out.println("Your total balance is "+balance);
            return  true;
        }
        else {
            System.out.println("You are Garib!!");
            return  false;
        }
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate /100;
    }
}
