import java.util.Scanner;

public class DivModExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = scanner.nextInt();
		
		int sum = 0;
		while(number > 0) {
			int digit = number % 10; // 현재 자릿수
			sum = sum + digit; // 합에 현재 자릿수 추가
			number = number / 10; // 다음 자릿수로 이동
		}
		System.out.println("입력한 수의 각 자릿수의 합: " + sum);
		
		scanner.close();
	}
}