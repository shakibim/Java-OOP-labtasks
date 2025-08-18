package lab4;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Icecream[] IcecreamArray = new Icecream[2];
        for (int i = 0; i < 2; i++) {
            IcecreamArray[i] = new Icecream();
            System.out.println("Enter IceCream type " + i + " : ");
            IcecreamArray[i].setIcecreamType(in.nextLine());
            System.out.println("Enter Icecream Company " + i + " : ");
            IcecreamArray[i].setIcecreamCompany(in.nextLine());
            System.out.println("Enter Icecream Price " + i + " : ");
            IcecreamArray[i].setIcecreamPrice(sc.nextDouble());
        }
        System.out.println("Enter Icecream company to search");
        String s = in.nextLine();
        searchByCompany(s, IcecreamArray);
    }

    public static void searchByCompany(String s, Icecream[] Iarr) {
        for (int i = 0; i < 2; i++) {
            if (s.equals(Iarr[i].getIcecreamCompany())) {
                System.out.println("Icecream company: " + Iarr[i].getIcecreamCompany());
                System.out.println("Icecream type: " + Iarr[i].getIcecreamType());
                System.out.println("Icecream price: " + Iarr[i].getIcecreamPrice());
            }
        }
    }
}
