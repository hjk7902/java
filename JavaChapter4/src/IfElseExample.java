import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요: ");
		int testscore = scanner.nextInt();

		System.out.println("점수 : " + testscore );
		if( testscore  >= 60 ) {
			System.out.println("60점 이상입니다.");
			System.out.println("합격");
		} else {
			System.out.println("60점 미만입니다.");
			System.out.println("불합격");
		} 
		scanner.close();
	}
}
