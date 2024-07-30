/*
  1 
 121 
12321
  */
package Pattern;

public class pttern6 {
	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			for (int j = i; j < 3; j++) {
				System.out.print(" ");
			}
			for (int j =1; j <=i; j++) {
				System.out.print(j);
			}
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		System.out.println(" ");
		
		/*0
		 101
		21012
	   3210123*/
		
		for (int i = 0; i <=4; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >=0; j--) {
				System.out.print(j);
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
