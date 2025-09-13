import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample savings account
        SavingsAccount acc = new SavingsAccount("ACC1001", "Yunus", 5000, 3.5);

        while (true) {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Mini Statement");
            System.out.println("5. Add Interest");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        acc.withdraw(withdrawAmount);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    acc.showBalance();
                    break;

                case 4:
                    acc.miniStatement();
                    break;

                case 5:
                    acc.addInterest();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
