package lab4;

public class Main3 {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);
        add(f1, f2);
        sub(f1, f2);
        multiplication(f1, f2);
        division(f1, f2);
        f1.add();
    }

    public static void add(Fraction a, Fraction b) {
        int x
                = (a.getNumerator() * b.getDenominator()) + (b.getNumerator() * a.getDenominator());
        int y = a.getDenominator() * b.getDenominator();
        System.out.println("add: " + x + "/" + y);
    }

    public static void sub(Fraction a, Fraction b) {
        int x = (a.getNumerator() * b.getDenominator())
                - (b.getNumerator() * a.getDenominator());
        int y = a.getDenominator() * b.getDenominator();
        System.out.println("sub: " + x + "/" + y);
    }

    public static void multiplication(Fraction a, Fraction b) {
        int x = (a.getNumerator() * b.getNumerator());
        int y = a.getDenominator() * b.getDenominator();
        System.out.println("multiplication: " + x + "/" + y);
    }

    public static void division(Fraction a, Fraction b) {
        int x = (a.getNumerator() * b.getDenominator());
        int y = a.getDenominator() * b.getNumerator();
        System.out.println("divistion: " + x + "/" + y);
    }
}
