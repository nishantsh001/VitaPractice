package IfLogic;

public class SwappingWithXOR {
	public static void main(String[] args) {
		int a, b;
		a = 2;
		b = 3;
		
		a = a^b;
		b = a^b;
		
		a = a^b;
		
		System.out.println(a+" "+b);
	}
}
