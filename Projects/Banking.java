package Projects;

import java.util.Scanner;

// JAVA BANKING PROJECTS
public class Banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 10;
        int choice;
        boolean isRunning = true;

        // DISPLAY MENU

        // GET AND PROCESS USERS CHOICE
        while (isRunning) {
            System.out.println("*******************");
            System.out.println("Banking Software");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("*******************");
            System.out.print("Enter your choice: ");
            isRunning = false;

        }
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> withdraw(balance);
            case 3 -> deposit(balance);
            case 4 -> exitMenu();
            default -> System.out.println("Invalid choice");
        }
    }

    // SHOW BALANCE
    static void showBalance(double balance) {
        System.out.println("*******************");
        System.out.print("Your Balnace is : " + balance + " $");
        exitMenu();
    }

    // WITHDRAW
    static void withdraw(double balance) {
        System.out.println("*******************");
        System.out.print("Enter Amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient Balance ");
        } else {
            balance = balance - amount;
            System.out.println("Amount has been withdrawl");
        }
        exitMenu();
    }

    // DEPOSITE
    static void deposit(double balance) {
        System.out.println("*******************");
        System.out.print("Enter Amount to Deposit : ");
        double amount = scanner.nextDouble();
        System.out.println("Plese Enter Valid Amount");
            if(amount <=0){
            }else{
                balance =+amount;
                System.out.println("Amount has been Deposited");
                System.out.println("Your New Balance is : "+balance +" $");
            }
        exitMenu();
    }

    // EXIT MENU
    static void exitMenu() {
        System.out.println("Thank you for using our banking services");
    }

}
