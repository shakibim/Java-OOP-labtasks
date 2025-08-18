
package lab1;

import java.util.Scanner;

public class problem_1 {
    
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int inp =in.nextInt();
       double input = inp;
       
       if((input/2)==(Math.floor(input/2))){
           if((input/3)==(Math.floor(input/3))){
               System.out.println("False");
           }
           else{
               System.out.println("True");
           }
       }
       else{
           if((input/3)==(Math.floor(input/3))){
               System.out.println("True");
           }
           else{
               System.out.println("False");
           }
       }
       
      
       
    }
}
