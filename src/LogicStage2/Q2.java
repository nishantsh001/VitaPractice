/*2. Find Fibonacci series in following pattern 
 1 
 2 3 
 5 8 13 
 */
package LogicStage2;

public class Q2 {
	public static void main(String[] args) {
		int a = 1, b = 2;
			for (int i = 1; i <4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(a+" ");
				int next = a + b;
				a = b;
				b  = next;
			}
			System.out.println(" ");
		}
	}
}
