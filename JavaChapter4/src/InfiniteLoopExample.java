import java.util.Scanner;

public class InfiniteLoopExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("종료하려면 exit를 입력하세요: ");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력한 값: " + input);
			}
		}
		scanner.close();
	}

}
