
public class AuthApp3 {

	public static void main(String[] args) {
		
		// String[] users = {"Junhwan", "Egoing", "Java"};
		
		String[][] users = {
				{"Junhwan", "1111"},
				{"Egoing" , "2222"},
				{"Java"   , "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		
		for(int i = 0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId) && current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hello");
		
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("Who r u?");
		}
		
		
	}

}
