
package lab2;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int count=0;
        for (int i=0;i<=num;i++){
            if(!isPrime(i)){
                count++;
            }
        }
        System.out.println("Not prime number upto the "+num+" is "+ count);
        
    }
    
    public static boolean isPrime(int x){
        int count =0;
        if(x==1){
            count=1;
        }
        else if(x==2){
            count=0;
        }
        else{
            for(int i=2; i<x; i++){
                if(x%i==0){
                    count++;
                }
            }
        }
        return count==0;
    }
}
