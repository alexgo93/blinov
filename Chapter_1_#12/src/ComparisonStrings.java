
public class ComparisonStrings {

	public static void main(String[] args) {
		compare1();
		compare2();
	}
	
	
	private static void compare1() {
		String s1, s2;
		s1 = "Java";
		s2 = s1; // переменная ссылается на ту же строку
		System.out.println("сравнение ссылок " + (s1 == s2)); // результат true
		// создание нового объекта
		s2 = new String("Java"); // эквивалентно s2 = new String(s1);
		System.out.println("сравнение ссылок "+ (s1 == s2)); // результат false
		System.out.println("сравнение значений " + s1.equals(s2)); // результат true
		
		
		String s3;
		String s4;
		s3 = "Java";
		s4 = "Java";
		System.out.println("сравнение ссылок (s3 == s4) "+ (s3 == s4)); // результат false
		
		String s5;
		String s6;
		s5 = new String("Java");
		s6 = new String("Java");
		System.out.println("сравнение ссылок (s5 == s6) "+ (s5 == s6)); // результат false		
	}
	
	private  static void compare2() {
		Pet pet1 = new Pet();
		pet1.Name = "a";
		pet1.age = 10;
		
		
		Pet pet2 = new Pet();
		pet2.Name = "a";
		pet2.age = 10;
		
		System.out.println("сравнение ссылок (pet1 == pet2) "+ (pet1 == pet2)); // результат false
		System.out.println(pet1.equals(pet2));
		
		
	}

}
