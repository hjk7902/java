import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("주사위 번호를 입력하세요: ");
		int diceNumber = scanner.nextInt();  // 주사위를 던져 나온 숫자

		if (diceNumber % 2 == 0) {
		    System.out.println("주사위 숫자 " + diceNumber + "는 짝수!");
		} else {
		    System.out.println("주사위 숫자 " + diceNumber + "는 홀수!");
		}
		scanner.close();
	}
}
