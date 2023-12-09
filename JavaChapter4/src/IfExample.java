import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = scanner.nextInt();
		System.out.println("점수: " + score);
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("if 문장 다음");
		scanner.close();
	}
}
