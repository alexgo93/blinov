
public class GreatestAndLeast {
	

	public static void main(String[] args) {
		Integer greatest;
		Integer least;
		Integer[] numbers = new Integer[args.length];
		
		for(int i = 0; i<args.length; i++) {
			
			numbers[i] = Integer.parseInt(args[i]);
		}
		for(int i = 0; i<numbers.length; i++) {
			greatest = numbers[0];
			if (greatest<numbers[i]) {
				greatest = numbers[i];
			} else {
				continue;
			}
			if (i==numbers.length-1) {
				System.out.println(greatest);
			}
		}
		for(int j = 0; j<numbers.length; j++) {
			least = numbers[0];
			if (least>numbers[j]) {
				least = numbers[j];
			} else {
				continue;
			}
			if (j==numbers.length-1) {
				System.out.println(least);
			}
		}
	}

}
