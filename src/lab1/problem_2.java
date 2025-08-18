
package lab1;


import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long minutes = in.nextLong();  // safer for large numbers
        
        long years = minutes / (365*24*60);
        long days = (minutes % (365*24*60)) / (24*60);
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        in.close();
    }
}
