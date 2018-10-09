
public class PasswordCompare {

	public static void main(String[] args) {
		String password = "abra-cadabra";
		String pasInp = args[0];
		if(password.equals(pasInp)) {
			System.out.println("You are right!");
		} else {
			System.out.println("Wrong password!");
		}
				
	}

}
