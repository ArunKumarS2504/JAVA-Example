package TRAINING;

import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
       int rem,temp,sum=0;
        
       int n=12344321;
       temp=n;
        while(n>0){
        
            rem=n%10;

            sum=(sum*10)+rem;
            n=n/10;          
        }
        if(temp==sum){
            System.out.println("is PALDINROME");
        }else{
            System.out.println("not a palindrome");
        }
        
        
    }
}
