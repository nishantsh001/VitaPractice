/*Q4. Print  binary of a number in reverse order  eg. Input 4
  O/P 0 0 1 
*/
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int rev;
		
		while(num>0) {
			rev = num%2;
			System.out.print(rev);
			num = num/2;
			
		}
	}
}
