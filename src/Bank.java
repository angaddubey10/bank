package src;

public interface Bank {
    public void addMoney(int money);
    public boolean withdrawMoney(int money);
    public int checkBalance();
    public double calculateInterest(int year);
}
