package Maths;
import java.util.Scanner;

public class maths2 {
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		System.out.println("Input number 1");
		double num1 = Double.parseDouble(readInput.nextLine());
		System.out.println("Input number 2");
		double num2 = Double.parseDouble(readInput.nextLine());
		System.out.println("Input operator");
		String operator = readInput.nextLine();
		System.out.println("Answer is: " + calculate(operator, num1, num2));
	}
	static double calculate(String operator, double num1, double num2) {
		double answer;
		switch (operator) {
			case "+":
				answer = num1 + num2;
				break;
			case "-":
				answer = num1 - num2;
				break;
			case "*":
				answer = num1 * num2;
				break;
			case "/":
				answer = num1 / num2;
				break;
			case "%":
				answer = num1 % num2;
				break;
			default:
				answer = 0;
		}
		return answer;
	}
}
