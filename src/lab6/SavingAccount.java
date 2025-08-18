package lab6;

public class SavingAccount extends Account {

    private String creditCardNum;

    public SavingAccount() {
        super();
        this.creditCardNum = "124154541151542";
    }

    public SavingAccount(int a, double b, double c, String creditCardNum) {
        super(a, b, c);
        this.creditCardNum = creditCardNum;
    }

    public String getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(String creditCardNum) {
        this.creditCardNum = creditCardNum;

    }

    public double getCreditBalance() {
        double b = super.getBalance() * 3;
        return b;
    }
}
