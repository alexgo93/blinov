
public class ArgsSum {

	public static void main(String[] args) {
		Integer result = 0;
		for(int i = 0; i<args.length; i++) {
			Integer[] sumNumber = new Integer[args.length];
			sumNumber[i] = Integer.parseInt(args[i]);
			
			result += sumNumber[i];
		}
		System.out.println(result);

	}

}
