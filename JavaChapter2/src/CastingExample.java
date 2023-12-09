
public class CastingExample {

	public static void main(String[] args) {
		byte a = 10;
		int b = a; // promotion
//		int c = b;
		byte c = (byte)b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
