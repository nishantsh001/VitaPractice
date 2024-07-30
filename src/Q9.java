/*Q.9 Accept term from user and print Fibonacci series. 
 * 011235*/

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b=0, c, n;
		n = scanner.nextInt();
		a=0;
		if(n==0) 
			System.out.println(n);
		
		if(n==1||n==2)
			System.out.println("1");
		
		for (int i = 1; i <= n; i++) {	
			c = a+b;
			a = b;
			b = c;
			System.out.print(c);
		}
		
	}
}
