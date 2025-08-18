package lab6;

public class CheckingAccount extends Account {

    private double overDraftLimit;

    public CheckingAccount() {
        super();
        overDraftLimit = 50000;
    }

    public CheckingAccount(int a, double b, double c, double d) {
        super(a, b, c);
        this.overDraftLimit = d;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}
