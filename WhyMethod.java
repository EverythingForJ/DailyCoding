
public class WhyMethod {

	public static void main(String[] args) {
		
        printJun();
        printJun();
        printJun();
        
        printHwan();
        printHwan3();
        			//인자, argument
        printString("JunHwan");
        
	}

	public static void printHwan3() {
		printHwan();
        printHwan();
        printHwan();
	}

	public static void printJun() {
        System.out.println("J");
        System.out.println("U");
        System.out.println("N");
    }
	
	public static void printHwan() {
        System.out.println("H");
        System.out.println("W");
        System.out.println("A");
        System.out.println("N");
    }
								  //매개변수, parameter
	public static void printString(String text) {
        System.out.println(text);
    }
	
	
}
