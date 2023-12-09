import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = add(num1, num2);
		System.out.printf("두 수의 합은 %d입니다.", result);
		scanner.close();
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
}