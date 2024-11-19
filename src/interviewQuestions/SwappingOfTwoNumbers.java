package interviewQuestions;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		swappingWithoutUsingThirdVariable(a,b);
	}

	public static void swappingUsingThirdVariable(int a,int b) {
		
		System.out.println("before swap  A= "+a+"    B= "+b );
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap  A= "+a+"    B= "+b );
	}
	
	public static void swappingWithoutUsingThirdVariable(int a,int b) {
		System.out.println("before swap  A= "+a+"    B= "+b );
		
		/*
		 * a=a*b; b=a/b; a=a/b;
		 */
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		/*
		 * a = a ^ b; b = a ^ b; a = a ^ b;
		 */
		
		  a=a*b; b=a/b; a=a/b;
		 
		
		System.out.println(a+"     "+ b);
	}
}
