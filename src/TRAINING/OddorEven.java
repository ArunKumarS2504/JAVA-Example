package TRAINING;

import java.util.Scanner;

public class OddorEven{
	
	
	  public static void main(String[] arg) {
		  int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer :");
		n=s.nextInt();
		if(n%2==0) {
			System.out.println("is Even");
		}else {
			System.out.println("is odd");
		}
	}
}