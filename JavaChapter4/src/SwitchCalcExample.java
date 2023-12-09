import java.util.Scanner;

public class SwitchCalcExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수식을 이력하세요.(예: 5 x 8)");
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		
		switch(op.charAt(0)) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case 'x':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		default:
			System.out.println("연산자 오류");
		}
		scanner.close();
	}

}
