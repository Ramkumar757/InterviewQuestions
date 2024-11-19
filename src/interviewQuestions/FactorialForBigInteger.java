package interviewQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialForBigInteger {
	
	public static void main(String[] args) {
		int n,c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		BigInteger inc  = new BigInteger("1");
		BigInteger fact  = new BigInteger("1");
		for (c = 1; c <= n; c++) {
			fact = fact.multiply(inc);
			inc= inc.add(BigInteger.ONE);
		}
		
		System.out.println("factorial of " + n + " :" + fact);
		
	}

}
