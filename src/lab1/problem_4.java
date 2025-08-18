
package lab1;

import java.util.Scanner;

public class problem_4 {

    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the exchange rate USD to BDT");
        double exchange_rate = in.nextDouble();
        System.out.println("enter 0 to convert from USD to BDT or 1 to convert from BDT to USD.");
        int x = in.nextInt();
        
        if(x==0){
            System.out.println("Enter the amount of USD");
            double d = in.nextDouble();
            System.out.println(d+" Equivalent to "+(d*exchange_rate)+" BDT");
        }
        else if (x==1){
            System.out.println("Enter the amount of BDT");
            double b = in.nextDouble();
            System.out.println(b+" Equivalent to "+(b/exchange_rate)+" USD");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
