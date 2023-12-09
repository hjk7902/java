
public class Test3 {
	public static void main(String[] args) {
		int x = 1;
		int y = 5;
		do {
			y--;
			++x;
		} while (x < 5);
		System.out.print(x + "," + y);
	}
}
