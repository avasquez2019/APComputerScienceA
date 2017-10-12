/* Alexander Vasquez 
 * 10/12/17
 * Factorial Caculator
 * Will give you the factorial of a number 
 */

package factorialCalculator;
// imports java.util.Scanner which allows me to import Scanner so the user can input numbers 
import java.util.Scanner;
public class factorialCalculator {

	public static void main(String[] args) {
		int answer = 0;
		int tracker = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number for factorial: ");
		int user_num = reader.nextInt();
		if (user_num == 1) {
			answer = 1;
			
		}
		while (user_num > 1) {
			
			if (tracker == 0) {
				answer = tracker + (user_num * (user_num - 1));
			}
			
			else {
				answer = tracker * (user_num - 1);
			}
			tracker = answer;
			user_num --;
			
		}
		System.out.println(answer);
		

	}
	
	
	}