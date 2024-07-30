/*Q5. Accept a number from user  check if it is odd or even without using (modular)% operator. */
package IfLogic;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1st method give me number ");
		int n = scanner.nextInt();
		int q = n/2;
		
		if(q*2==n)
			System.out.println("even");
		
		System.out.println("2nd method give me number ");
		int no = scanner.nextInt();
		while(no>2) { 
			no = no-2;
		}
		if(no==2) {
			System.out.println("even");
		}
		
		System.out.println("3rd method give me number ");
		int num=6;
	    int ne=num&1;
	    String a=(ne==0)?"even":"odd";
	    System.out.println(a);

	}

}
