package src;

public class Main {
    public static void main(String[] args) {
        GareebBank account = new GareebBank(12345, "Angad", 1000, 4.5);
        account.addMoney(100);
        account.withdrawMoney(50);
        System.out.println("Your balance is:"+ account.checkBalance());
        System.out.println("The interest for the year is " + account.calculateInterest());
    }
}
