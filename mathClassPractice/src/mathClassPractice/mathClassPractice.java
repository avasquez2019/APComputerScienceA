// Alexander Vasquez
package mathClassPractice;
import java.util.Scanner;// imports package that is inside java which imports another package from util aka utility which is Scanner which helps us be able to use user input 
public class mathClassPractice {// initiates class which is one of 2 main necessities in order for a program to function 

	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		int num1;//declares variable num1
		int num2;//declares variable num2
		int num3;//declares variable num3
		Scanner reader = new Scanner(System.in);// creates a Scanner object called reader that reads what the user has entered
    	System.out.println("Welcome to the Largest Number Calculator:");//outputs to the console
    	System.out.print("Enter First Number:");//outputs to the console Enter First Number:
    	num1 = reader.nextInt();// the scanner, reader, reads the value the user entered and stores it in num1
    	System.out.print("Enter Second Number:");//outputs to the console Enter Second Number:
    	num2 = reader.nextInt();// the scanner, reader, reads the value the user entered and stores it in num2
    	System.out.print("Enter Third Number:");//outputs to the console Enter Third Number:
    	num3 = reader.nextInt();// the scanner, reader, reads the value the user entered and stores it in num3
		System.out.println(largestNum(num1, num2, num3));// outputs to the console what is stored in the method largestNum
		
		
	}
        public static int largestNum(int num1, int num2, int num3) {// creates a method called largestNum() which contains return Math.max(num1, Math.max(num2, num3));
        	return Math.max(num1, Math.max(num2, num3));// returns the largest number from the numbers inputted by the user
        	
        	
        	 
        	
        }
        
        
}
