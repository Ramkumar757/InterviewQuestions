package interviewQuestions;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerAdding {

	public static void main(String[] args) {
		String number1,number2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number :");
		number1= sc.nextLine();
		System.out.println("Enter the Second Number :");
		number2= sc.nextLine();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		BigInteger sum;
		
		sum= first.add(second);
		System.out.println("sum  :"+sum);
		

	}

}
