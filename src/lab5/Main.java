package lab5;

public class Main {

    public static void main(String[] args) {
        Book b = new Book(202566, "introduction to ---", 320);
        Book c = new Book(323232, "introduction to -- 2", 250);
        System.out.println(c.compareTo(b));
        System.out.println(b.getCount());
    }
}
