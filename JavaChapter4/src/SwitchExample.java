import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		if(score > 100) {
			System.out.println("잘못된 입력 점수입니다.");
		}else if(score == 100) {
			System.out.println("100점입니다.");
			System.out.println("당신의 학점은 A입니다.");
		}else {
			switch(score / 10) {
			case 9:
				System.out.println("당신의 학점은 A입니다.");
				break;
			case 8:
				System.out.println("당신의 학점은 B입니다.");
				break;
			case 7:
				System.out.println("당신의 학점은 C입니다.");
				break;
			case 6:
				System.out.println("당신의 학점은 D입니다.");
				break;
			default:
				System.out.println("당신의 학점은 F입니다.");
				System.out.println("당신은 재수강 대상자입니다.");
				break;
			}
		}
		scanner.close();
	}

}
