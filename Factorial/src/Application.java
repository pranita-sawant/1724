import java.util.Scanner;

public class Application {
	public static void main(String[] args){
		
		System.out.println("Program: To calculate factorial");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		
		int num=sc.nextInt();
		System.out.println("Number="+num);
		
		System.out.println("Factorial of " + num + " is "+ Factorial.calcFactorial(num));
		
	}
}
