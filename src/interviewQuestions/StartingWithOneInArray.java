package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class StartingWithOneInArray {

	public static void main(String[] args) {
		
		int[] arr= {22,12,32,43,132,432,213,532,123};
		findElementStratigwithOne(arr);
	}

	public static void findElementStratigwithOne(int[] arr) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int num:arr) {
			
			int n= getfirstDigit(num);
			if(n ==1) {
				numbers.add(num);
			}
			
		}
		System.out.println(numbers);
	}
	public static int getfirstDigit( int num1) {
		
		while(num1>10) {
			num1=num1/10;
		}
		return num1;
	}
}
