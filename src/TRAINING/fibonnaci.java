package TRAINING;
// import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
       int n=0,n1=1,i,n2,count=10;
       System.out.print(n+" "+n1);
        for(i=2;i<count;i++){
            n2=n+n1;
            System.out.print(" "+n2);
            n=n1;
            n1=n2;
        }
    }
}