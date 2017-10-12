//Alexander Vasquez
package miniProject8;

import java.util.Scanner;// imports package that is inside java which imports another package from util aka utility which is Scanner which helps us be able to use user input 

public class miniProject8 {// initiates class which is one of 2 main necessities in order for a program to function 

	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		Scanner reader = new Scanner(System.in);// creates a Scanner object called reader that reads what the user has entered
		double numInput;// declares double variable numInput
		double diaOutput;// declares double variable diaOutput
		double cirOutput;// declares double variable curOutput
		double surAreaOutput;// declares double variable surAreaOutput
		double volOutput;// declares volOutput
		System.out.print("Enter radius of a sphere:");// outputs to the console: Enter radius of a sphere:
		numInput = reader.nextDouble();// the scanner, reader, reads the value the user entered and stores it in numInput
		diaOutput = numInput * 2;// makes diaOutput equal to numInput times two
		surAreaOutput = numInput * numInput * 3.14 * 4;// makes surAreaOutput equal to numInput times 3.14 times 4 
		volOutput = numInput * numInput * numInput * 4 / 3 * 3.14; // makes volOutput equal to numInput times itself times itself times 4 divided by 3 times 3.14
		cirOutput = numInput * 3.14 * 2;// makes cirOutput equal to numInput times 3.14 times 2
		System.out.print("Diameter is ");// Outputs to the console: Diameter is 
		System.out.println(diaOutput);// Outputs to the console value stored in diaOutput
		System.out.print("Circumference is ");// Outputs to the console: Circumference is 
		System.out.println(cirOutput);// Outputs to the console value stored in cirOutput
		System.out.print("Surface Area is ");// Outputs to the console: Surface Area is 
		System.out.println(surAreaOutput);// Outputs to the console value stored in surAreaOutput
		System.out.print("Volume is ");// Outputs to the console: Volume is 
		System.out.println(volOutput);// Outputs to the console value stored in volOutput 
        reader.close(); // closes Scanner named reader 
	}

}
