//Alexander Vasquez
//10/2/17
//Largest of two integers calculator and integer and remainder calculator 
public class IfStatementPractice {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 3;
		System.out.println(largestNum(num1, num2));
        System.out.println(remainderCalculator(7, 4, 0) + "r" + remainderCalculatorRemainder(7,4,0));// calculates the largest number adds an r in between the numbers and calculates the numbers to the right of the decimal  
	}
    public static int largestNum(int num1, int num2) {// calculates the largest number
    	if (num1>num2) {
    		return num1; 
    	}
    	else {
    		return num2;
    	}
    	
    }
    
    	
    	
    
    public static int remainderCalculator(int num3, int num4, int answer) {//calculates the numbers to the left of the decimal
    	answer = num3 / num4;
    	return answer; 
    }
    	
    public static int remainderCalculatorRemainder(int num3, int num4, int answer) {//calculates the numbers to the right of the decimal 
    	answer = num3%num4;
    	return answer;
    	
    	
    }
    
    	
    	
    	
    	
    	
    	
    }

