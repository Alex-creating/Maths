package Maths;

public class Maths {

	public static int calc(int a, int b) {
		char operator = '-';
		int answer = 0;
	
		switch (operator) {
		
		case '+': answer = a+b;
		break;
		case '-': answer = a-b;
		break;
		case '/': answer = a/b;
		break;
		case '*': answer = a*b;
		break;	
		
	    }
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(calc(2, 3));
	}

}

