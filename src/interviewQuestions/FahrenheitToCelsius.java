package interviewQuestions;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float temperature ;
		System.out.println("enter the temperature in Fahrenheit :");
		temperature= sc.nextFloat();
		
		temperature= ((temperature-32)*5)/9;
		System.out.println("temperature in Celsius :" +temperature);
	}

}
