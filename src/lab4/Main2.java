package lab4;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Book[] bookArr = new Book[5];
        for (int i = 0; i < 5; i++) {
            bookArr[i] = new Book();
            System.out.println("Enter ISBN of Book " + i + " : ");
            bookArr[i].setISBN(in.nextInt());
            System.out.println("Enter Title of Book " + i + " : ");
            bookArr[i].setBookTittle(sc.nextLine());
            System.out.println("Enter number of pages of Book " + i + " : ");
bookArr[i].setNumberOfPages(in.nextInt());
        }

        displayAll(bookArr);
        Book a = new Book();
        a.setNumberOfPages(400);
        System.out.println(isHeavier(a));
        Book b = new Book();
        Book c = new Book();
        b.setNumberOfPages(500);
        c.setNumberOfPages(700);
        System.out.println(compareTo(b, c));
    }

    public static void displayAll(Book[] a) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Book information of " + i + " no book");
            System.out.println(a[i].getBookTittle());
            System.out.println(a[i].getISBN());
            System.out.println(a[i].getNumberOfPages());
        }
    }

    public static int compareTo(Book a, Book b) {
        int x = 0;
        if (a.getNumberOfPages() > b.getNumberOfPages()) {
            x = 1;
        } else if (a.getNumberOfPages() == b.getNumberOfPages()) {
            x = 0;
        } else {
            x = -1;
        }
        return x;
    }

    public static boolean isHeavier(Book a) {
        return (a.getNumberOfPages() > 500);
    }

}
