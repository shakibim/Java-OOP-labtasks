package lab4;

public class Fraction {

    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    public void add() {
        System.out.println(numerator + denominator);

    }

    public void sub() {
        System.out.println(numerator - denominator);
    }

    public void multiplication() {
        System.out.println(numerator * denominator);
    }

    public void division() {
        System.out.println(numerator / denominator);
    }

    @Override
    public String toString() {
        return "Fraction{"
                + "numerator=" + numerator
                + ", denominator=" + denominator
                + '}';
    }
}
