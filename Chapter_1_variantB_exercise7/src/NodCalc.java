
public class NodCalc {
	public static int gcd (int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	 public static int lcm (int x, int y){// ������� ���������� ����� ������� �����
         return x*(y/gcd(x,y));
     }
}
