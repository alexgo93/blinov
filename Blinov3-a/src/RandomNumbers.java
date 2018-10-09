import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		Integer quantity = Integer.parseInt(number);
		for(int i=0;i<quantity;i++) {
			System.out.print(Math.random()*100);
		}
		for(int i=0;i<quantity;i++) {
			System.out.println("\n" + Math.random()*100);
		}

	}

}
