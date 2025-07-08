import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankATM {
    private double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankATM atm = new BankATM();

        while (true) {
            System.out.println("1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Amount: ");
                    atm.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Amount: ");
                    try {
                        atm.withdraw(sc.nextDouble());
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> System.out.println("Balance: " + atm.getBalance());
                case 4 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
