
public class ReturnExample {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("넓이는: " + calcRect(a, b));
	}

	public static int calcRect(int width, int height) {
		return width*height;
//		System.out.println("Hello");
	}
}
