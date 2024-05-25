package Application;

import model.entities.Account;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.next();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println(account + "" + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected Error");
        }
        sc.close();
    }
}
