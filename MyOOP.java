
public class MyOOP {

	public static void main(String[] args) {

		Print am = new Print("----");
		Print as = new Print("****");
		
		am.A();
		am.B();

		as.A();
		as.B();
		
		as.A();
		am.B();
		
		am.A();
		as.B();
		
	}
}
