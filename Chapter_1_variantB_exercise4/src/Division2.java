
public class Division2 {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[args.length];
		
		for(int i = 0; i<args.length; i++) {	
			numbers[i] = Integer.parseInt(args[i]);
		}
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i]%5 == 0 && numbers[i]%7 == 0) {
				System.out.println(numbers[i]);
			} else {
				continue;
			}
		}

	}

}
