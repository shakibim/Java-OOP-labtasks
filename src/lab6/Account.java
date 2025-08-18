package lab6;

public class Account {

    private int Id;
    private double balance;
    private double annualInterestRate;

    public Account() {
        Id = 2564;
        balance = 100;
        annualInterestRate = 5;

    }

    public Account(int a, double b, double c) {
        this.Id = a;
        this.balance = b;
        this.annualInterestRate = c;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / (12 * 100);
    }

    public double getMonthlyAmount() {
        return balance * (annualInterestRate / (12 * 100));
    }

    public double withdraws(double a) {
        balance = balance - a;
        return balance;
    }

    public double deposits(double b) {
        balance = balance + b;
        return balance;
    }
}
