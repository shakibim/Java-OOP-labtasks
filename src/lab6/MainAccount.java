package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAccount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> arraylist = new ArrayList<Account>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Press 1 for creating checking Account \nPress 2 for creating saving  Account");
            int num = in.nextInt();
            if (num == 1) {
                System.out.println("Enter ID: ");
                int a = in.nextInt();

                System.out.println("Enter Balance: ");
                double b = in.nextDouble();
                System.out.println("Enter interest rate: ");
                double c = in.nextDouble();
                System.out.println("Enter overdraft limit: ");
                double d = in.nextDouble();
                arraylist.add(new CheckingAccount(a, b, c, d));
            } else {
                System.out.println("Enter ID: ");
                int a = in.nextInt();
                System.out.println("Enter Balance: ");
                double b = in.nextDouble();
                System.out.println("Enter interest rate: ");
                double c = in.nextDouble();
                System.out.println(
                        "Enter Credit Card number :");
                String d = sc.nextLine();
                arraylist.add(new SavingAccount(a, b, c, d));
            }
        }
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println("Enter deposit amount for " + i + "no.account: ");
            double a = in.nextDouble();
            arraylist.get(i).deposits(a);
            System.out.println("Updated Balance: " + arraylist.get(i).getBalance());
            System.out.println("Enter withdraw amount for" + i + "no.account: ");
            double b = in.nextDouble();
            arraylist.get(i).withdraws(b);
            System.out.println(
                    "Updated Balance: " + arraylist.get(i).getBalance());
        }
        for (Account account : arraylist) {
            if (account instanceof CheckingAccount) {
                System.out.println(
                        "This is a Checking account: \nAccount ID : " + account.getId() + "\nAccount Balance: " + account.getBalance() + "\nAnnual Interest Rate: "
                        + account.getAnnualInterestRate()
                        + "\nMonthly Interest Rate: " + account.getMonthlyAmount()
                        + "\nover draft Limit: " + ((CheckingAccount) account).getOverDraftLimit()
                );
            } else {
                System.out.println(
                        "This is Saving account:\nAccount ID: " + account.getId() + "\nAccount Balance: "
                        + account.getBalance() + "\nAnnual Interest Rate: "
                        + account.getAnnualInterestRate()
                        + "\nMonthly Interest Rate: " + account.getMonthlyAmount()
                        + "\nCredit Card number: " + ((SavingAccount) account).getCreditCardNum() + "\nCredit Balance: "
                        + ((SavingAccount) account).getCreditBalance()
                );
            }
            System.out.println();
        }
    }
}
