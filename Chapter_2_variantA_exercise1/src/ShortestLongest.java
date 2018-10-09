
public class ShortestLongest {

	public static void main(String[] args) {
		int longest = args[0].length();
		int longestNumberIndex = 0;
		int shortestNumberIndex = 0;
		int shortest = args[0].length();
		for(int i = 1; i<args.length; i++) {
			
			if(args[i].length()>longest) {
				longest = args[i].length();
				longestNumberIndex = i;
			}
			if(args[i].length()<shortest) {
				shortest = args[i].length();
				shortestNumberIndex = i;
			}
			if(i == args.length - 1) {
				System.out.println(args[longestNumberIndex]);
				System.out.println(args[shortestNumberIndex]);
			}
		}

	}

}
