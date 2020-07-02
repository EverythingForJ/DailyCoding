
public class OutputMethod {

	public static String a() {
		
		return "a";
	}
				  // 리턴값이 int
	public static int one() {
		
		return 1; // 출력과 동시에 메소드 종료
	}
				  // void는 리턴값이 없다는 뜻
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}

}
