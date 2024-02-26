import java.util.Scanner;

public class SimpleBankingApp {

    private double balance;
    private Scanner scanner;

    public SimpleBankingApp() {
        balance = 0.0;
        scanner = new Scanner(System.in);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while(choice != 4);
    }

    public static void main(String[] args) {
        SimpleBankingApp bankingApp = new SimpleBankingApp();
        bankingApp.start();
    }
}
