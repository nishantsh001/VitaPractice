/*pattern
*** 
** 
*
*/
package LogicStage2;

public class Q3 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
/*
  3 
 323 
32123 
 323 
  3 
*/
		for(int i=3;i>=1;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
				
			}
			for(int j=3;j>=i;j--) {
				System.out.print(j);
			}
			
			for(int j=3;j>i;j--) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(" ");
				
			}
			for(int j=3;j>=i;j--) {
				System.out.print(j);
			}
			
			for(int j=3;j>i;j--) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
