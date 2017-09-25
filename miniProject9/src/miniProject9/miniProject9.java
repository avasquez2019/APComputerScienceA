// Alexander Vasquez
package miniProject9;
import java.util.Scanner;// imports package that is inside java which imports another package from util aka utility which is Scanner which helps us be able to use user input 
public class miniProject9 {// initiates class which is one of 2 main necessities in order for a program to function 


	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		Scanner reader = new Scanner(System.in);// creates a Scanner object called reader that reads what the user has entered
		double heiTrap;// declares double variable heiTrap
		double lenBottomBase;// declares double variable lenBottomBase
		double lenTopBase;// declares double variable lenTopBase
		double answer;// declares double variable answer 
		System.out.println("Area of a Trapezoid Calculator");// outputs to the console: Area of a Trapezoid Calculator
		System.out.print("Enter the height of the trapezoid:");// outputs to the console: Enter the height of the trapezoid:
		heiTrap = reader.nextDouble();// the scanner, reader, reads the value the user entered and stores it in lenTrap
		System.out.print("Enter the length of the bottom base:");// outputs to the console: Enter the length of the bottom base:
		lenBottomBase = reader.nextDouble();// the scanner, reader, reads the value the user entered and stores it in lenBottomBase
		System.out.print("Enter the length of the top base:");// outputs to the console: Enter the length of the top base:
		lenTopBase = reader.nextDouble();// the scanner, reader, reads the value the user entered and stores it in lenTopBase
		answer = ((lenBottomBase + lenTopBase) * 1 / 2 * heiTrap);// sets answer equal to lenBottomBase plus lenTopBase times one-half times height of the trapezoid 
		System.out.print("The area is: " +  answer);// outputs to the console: The area is: and the value stored in answer

	}

}
