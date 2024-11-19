package interviewQuestions;

import java.util.Scanner;

public class CompareTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter the first String ");
		s1= sc.nextLine();
		System.out.println("Enter the second String ");
		s2= sc.nextLine();
		
		if(s1.compareTo(s2)>0) {
			System.out.println("first string is greater than second");
		}
		else if(s1.compareTo(s2)<0){
			System.out.println("second string is greater than first");
		}
		else {
			System.out.println("both are equal");
		}
	}

}
