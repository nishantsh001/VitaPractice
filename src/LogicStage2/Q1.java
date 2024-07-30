/*Q1. Find factorial of a number */
package LogicStage2;

public class Q1 {
	public static void main(String[] args) {
		int num = 5;
		int fact=1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		System.out.println(fact(num));
	}
	
	static int fact(int num) {
		if(num==1||num==0)
			return num;
		
		int factorial = num*fact(num-1);
		return factorial;
	}
}

