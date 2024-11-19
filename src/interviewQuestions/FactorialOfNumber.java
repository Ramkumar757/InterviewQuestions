package interviewQuestions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();

		System.out.println("factorial of " + n + " :" + smallFactorialNumbers(n));
	}

	public static int smallFactorialNumbers(int num) {
		int c, fact = 1;
		if (num < 0) {
			System.out.println("Enter an integerto calculate its factorial");
		} else {
			for (c = 1; c <= num; c++) {
				fact = fact * c;
			}
		}
		return fact;
	}

}
