import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name, password and initial balance");
        String name = s.next();
        String password = s.next();
        int balance = s.nextInt();

        SBI_Account sbi1 = new SBI_Account(name, balance, password);
        System.out.println("Your account has been created with ID :"+sbi1.getAccountNo());

        System.out.println("Your balance is :"+sbi1.getBalance());

        sbi1.depositMoney(1000);
        System.out.println("Current balance is :"+sbi1.getBalance());

        System.out.println("Enter the amount and password :");
        int amount = s.nextInt();
        String enteredPassword = s.next();
        System.out.println(sbi1.withdraw(amount,enteredPassword));

        System.out.println("Interest on your current account is :"+sbi1.calculateInterest(2));
    }
}