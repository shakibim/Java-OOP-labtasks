package lab5;

public class Book {

    private int ISBN;
    private String bookTittle;
    private int numberOfPages;
    private static int count = 0;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int compareTo(Book b) {
        return Integer.compare(this.numberOfPages,
                b.numberOfPages);
    }

    public String toString() {
        return "Book{"
                + "ISBN=" + ISBN
                + ", bookTittle='" + bookTittle + '\''
                + ", numberOfPages=" + numberOfPages
                + '}';
    }

    public Book(int ISBN, String bookTittle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTittle = bookTittle;
        this.numberOfPages = numberOfPages;
        count++;
    }

    public Book() {
        this.ISBN = 245588;
        this.bookTittle = "Wing of fire";
        numberOfPages = 220;
        count++;
    }

    public static int getCount() {
        return count;
    }

}
