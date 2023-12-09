
public class MixedExample {

	public static void main(String[] args) {
		int x = 3;
		int y = ++x + x--; // y = 4 + 4
		System.out.println("y값: " +y); // 8
		System.out.println("x값: " + x); // 3
		
		int a = 3;
		int b = a++ + ++a; // b = 3 + 5
		System.out.println("b값: " + b);
		System.out.println("a값: " + a);
		
	}

}
