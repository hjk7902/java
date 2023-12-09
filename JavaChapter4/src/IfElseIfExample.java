import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		char grade;
		if(score > 100) {
			System.out.println("잘못된 입력");
			grade = ' ';
		}else if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("정수 %d의 등급은 %c", score, grade);
		scanner.close();
	}

}
