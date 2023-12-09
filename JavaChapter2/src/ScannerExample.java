import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, email;
		int age;
		double weight;
		System.out.println("이름, 이메일, 나이, 몸무게를 입력하세요.");
		System.out.println("예: 홍길동 hong@hong.com 23 65");
		System.out.println("입력>");
		name = scanner.next();
		email = scanner.next();
		age = scanner.nextInt();
		weight = scanner.nextDouble();
		
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("나이: " + age);
		System.out.println("몸무게: " + weight);
		scanner.close();
	}

}
