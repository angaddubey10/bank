package src;

public class GareebBank implements Bank{
    private int accountNo;
    private String name;
    private int balance;

    private String password="Prabira";

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    //Getter Setters

    public void setPassword(String newPassword, String oldPassword){
        if(oldPassword==this.password){
            this.password = newPassword;
            System.out.println("Password changed successfully!");
        }
        else{
            System.out.println("Incorrect Old Password");
        }

    }

    private double interestRate;

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
    public double calculateInterest(int year) {
        return balance * interestRate*year /100;
    }
}
