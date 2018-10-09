
public class SumHalf {

	public static void main(String[] args) {
		Integer[] Numbers = new Integer[args.length];
		for(int i = 0; i<args.length; i++) {	
			Numbers[i] = Integer.parseInt(args[i]);
		}
		for(int i = 1; i<Numbers.length-1; i++) {
			int halfSum = (Numbers[i-1]+Numbers[i+1])/2;
			if(Numbers[i]==halfSum) {
				System.out.println(Numbers[i]);
			}
		}

	}

}
