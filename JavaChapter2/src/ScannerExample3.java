import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		System.out.println("나이와 이름을 입력하세요.");
		System.out.print("나이:");
		age = Integer.parseInt(scanner.nextLine());
		System.out.print("이름:");
		name = scanner.nextLine();
		System.out.println("나이:" + age);
		System.out.println("이름:" + name);
		scanner.close();
	}

}
