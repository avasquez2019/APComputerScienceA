//Alexander Vasquez
package miniProject6;

public class miniProject6 {// initiates class which is one of 2 main necessities in order for a program to function 

	public static void main(String[] args) {// initiates public static void main(string[] args)  { which is one of 2 main necessities in order for a program to function 
		dots27();// calls dots27(); which contains System.out.println("       *****"); System.out.println("     *********"); System.out.println("   *************");
		space();// calls space(); which contains System.out.println();
		space();// calls space(); which contains System.out.println();
		dots27();// calls dots27(); which contains System.out.println("       *****"); System.out.println("     *********"); System.out.println("   *************");
		barrierDots();// calls barrierDots(); which contains System.out.println("   * | | | | | *"); System.out.println("   *************");
		dots27();// calls dots27(); which contains System.out.println("       *****"); System.out.println("     *********"); System.out.println("   *************");
		space();// calls space(); which contains System.out.println();
		space();// calls space(); which contains System.out.println();
		dots27();// calls dots27(); which contains System.out.println("       *****"); System.out.println("     *********"); System.out.println("   *************");
		dots5();// calls dots5(); System.out.println("       *****");
		barrier();// calls barrier(); which contains System.out.println("   * | | | | | *");
		barrier();// calls barrier(); which contains System.out.println("   * | | | | | *");
		dots5();// calls dots5(); System.out.println("       *****");
		dots5();// calls dots5(); System.out.println("       *****");
		

	}
	public static void dots27()  {// creates a method called dots27() which contains System.out.println("       *****"); System.out.println("     *********"); System.out.println("   *************");
		System.out.println("       *****");// prints        ***** to the console
		System.out.println("     *********");// prints    ********* to the console 
		System.out.println("   *************");// prints    ************* to the console 
	}
	public static void space()  {// creates a method called space() which contains System.out.println();
		System.out.println();// prints    to the console
	}
	public static void barrierDots() {// creates a method called barrierDots() which contains System.out.println("   * | | | | | *"); System.out.println("   *************");
		System.out.println("   * | | | | | *");// prints    * | | | | | * to the console
		System.out.println("   *************");// prints    ************* to the console
		
	}
	public static void barrier() {// creates a method called barrier() which contains System.out.println("   * | | | | | *");
		System.out.println("   * | | | | | *");// prints    * | | | | | * to the console
	}
	public static void dots5()  {//  creates a method called dots5() which contains System.out.println("       *****");
		System.out.println("       *****");// prints    ************* to the console
		
	}

}
