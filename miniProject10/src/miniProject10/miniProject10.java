// Alexander Vasquez
package miniProject10;
import java.util.Scanner;// imports package that is inside java which imports another package from util aka utility which is Scanner which helps us be able to use user input 
public class miniProject10 {// initiates class which is one of 2 main necessities in order for a program to function 

	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		Scanner reader = new Scanner(System.in);// creates a Scanner object called reader that reads what the user has entered
		int height;// declares integer variable height
		int standNumfoMale = 60;// declares integer variable standNumfoMale
		int standNumfoFemale = 60;// declares integer variable standNumfoFemale
		int answerMale;// declares integer variable answerMale
		int answerFemale;// declares integer variable answerFemale
		System.out.println("Please enter a height in inches: ");// outputs Please enter a height in inches: to the console
		height = reader.nextInt();// the scanner, reader, reads the value the user entered and stores it in height
		answerMale = (height - standNumfoMale) * 7 + 106;// calculates answerMale which is calculated by having height minus standNumfoMale times seven + 106
		answerFemale =  (height - standNumfoFemale) * 6 + 100;// calculates answerFemale which is calculated by having height minus standNumfoFemale times six + 100
		System.out.println("Recommended Male Weight: " + answerMale); // outputs to the console: Recommended Male Weight: and the value stored in answerMale
		System.out.println("Recommended Female Weight: " + answerFemale);  // outputs to the console: Recommended Female Weight: and the value stored in answerFemale
		reader.close();// closes Scanner object reader
		

	}

}
