//Alexander Vasquez
package miniProject4;

public class miniProject4 {// initiates class which is one of 2 main necessities in order for a program to function 


	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		triangle();//calls triangle(); which outputs this to the console:    /\\    /  \\  /    \\
		bodyOfHouse();//calls bodyOfHouse(); which outputs this to the console: +------+ |      | |      |  +------+ 
		bodyWithHelloWorld();//calls bodyWithHelloWorld(); which outputs: |Hello | | World|  
		bodyOfHouse();//calls bodyOfHouse(); which outputs this to the console: +------+ |      | |      |  +------+ 
		triangle();//calls triangle(); which outputs to the console:    /\\    /  \\  /    \\
        
        
	}
    public static void triangle()  {//creates method called triangle() that contains System.out.println("   /\\"); System.out.println("  /  \\"); System.out.println(" /    \\");
    	System.out.println("   /\\");//prints /\\ to the console 
        System.out.println("  /  \\");// prints /  \\ to the console 
        System.out.println(" /    \\");//prints /    \\ to the console
    	
    	
    	
    }
    public static void bodyOfHouse()  {//creates method called bodyOfHouse() that contains System.out.println("+------+"); System.out.println("|      |"); System.out.println("|      |"); System.out.println("+------+");
    	System.out.println("+------+");// prints +------+ to the console
        System.out.println("|      |");// prints |      | to the console 
        System.out.println("|      |");// prints |      | to the console 
        System.out.println("+------+");// prints +------+ to the console
    }
    public static void bodyWithHelloWorld()  {// creates method called bodyWithHelloWorld() that contains System.out.println("|Hello |");System.out.println("| World|");
        System.out.println("|Hello |");// prints |Hello | to the console 
        System.out.println("| World|");// prints | World| to the console 
    }
    
    
    
}
