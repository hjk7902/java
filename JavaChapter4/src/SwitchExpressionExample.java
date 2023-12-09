
public class SwitchExpressionExample {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10);
		char b = switch(a) {
			case 9, 8 -> 'A';
			case 7,6,5 -> {
				System.out.println("7,6,5입니다.");
				yield 'B';
			}
			default -> 'C';
		};
		System.out.println(b);
	}
}
