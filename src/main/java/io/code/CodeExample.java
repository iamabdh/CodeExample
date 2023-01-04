package io.code;

public class CodeExample {
	
	public static void main(String[] args) {
		System.out.println("ee");
		
	}
	
	// method accept two params and return bigger number
	public int biggerNum(int a, int b) {
		int bigger;
		if (a > b) {
			bigger = a;
		} else {
			bigger = b;
		}
		
		return bigger;
	}
	
}

