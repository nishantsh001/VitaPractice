/*Q2. Accept three numbers and find out the highest number.*/
//import java.util.Scanner;
//public class Q2 {
//	public static void main(String[] args) {
//		int a, b ,c ;
//		Scanner scanner = new Scanner(System.in);
//		
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		c = scanner.nextInt();
//		
//		int h = (a>b)?((a>c)?a:c):((b>c)?b:c);
//		System.out.println(h);
//	}
//}

/*Accept a number from user,if it divisible by 3 print "fun", 
 * if it divisible by 7 print "buzz" ad if it divisible by both (3&7) print "fun buzz"*/
package IfLogic;

import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		int a, b ,c ;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		//c = scanner.nextInt();
		
		String h = (a%3==0 && b%7==0)?("fun buzz"):(a%3==0?"fun":(b%7==0?"Buzz": "NAN"));
		System.out.println(h);
	}
}