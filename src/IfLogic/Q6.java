/*Q6. Find out minimum string sequence 
I/P Specification: in the given String, check how many minimum times "one" occurs consecutively .  
If There is no "one" in the string then print -1. 
O/P Specification: Print the number 
1) Sample I/P 
11000100001111111 
2) Sample I/P 
0001111111*/
package IfLogic;

public class Q6 {
	public static void main(String[] args) {
		String string = "1100010000111111";
		int count = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch=='1') 
				count++;
		}
		System.out.println(count);
	}
}
