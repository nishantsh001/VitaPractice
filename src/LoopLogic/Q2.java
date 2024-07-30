/*Q.2 Accept  a number from user and find a factorial of a number. */
package LoopLogic;

import java.util.Scanner;

//public class Q2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int no ,r ,sum=0;
//		Scanner scanner = new Scanner(System.in);
//		no = scanner.nextInt();
//		
//		while (no!=0) {
//			r = no%10;
//			sum = sum+r;
//			no = no/10;
//		}
//		System.out.println(sum);
//	}
//
//}

/*reverse the number*/

//public class Q2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int no ,r ,rev=0;
//		Scanner scanner = new Scanner(System.in);
//		no = scanner.nextInt();
//		
//		while (no!=0) {
//			r = no%10;
//			rev = rev*10+r;
//			no = no/10;
//		}
//		System.out.println(rev);
//	}
//
//}

/*Pallindrome*/

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no ,r ,rev=0;
		Scanner scanner = new Scanner(System.in);
		no = scanner.nextInt();
		int n = no;
		
		while (no!=0) {
			r = no%10;
			rev = rev*10+r;
			no = no/10;
		}
		if(n==rev)
			System.out.println("palindrome");
		else {
			System.out.println("not palindrome");
		}
	}

}