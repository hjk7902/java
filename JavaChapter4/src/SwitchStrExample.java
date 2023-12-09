import java.util.Scanner;

public class SwitchStrExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("메뉴(insert, update, delete, select, quit)를 입력하세요.");
		String menu = scanner.next();
		
		switch(menu) {
		case "insert":
			System.out.println("입력 메뉴가 선택되었습니다.");
			break;
		case "update":
			System.out.println("수정 메뉴가 선택되었습니다.");
			break;
		case "delete":
			System.out.println("수정 메뉴가 선택되었습니다.");
			break;
		case "select":
			System.out.println("수정 메뉴가 선택되었습니다.");
			break;
		case "quit":
			System.out.println("종료 메뉴가 선택되었습니다.");
			break;
		default:
			System.out.println("잘 못 입력한 메뉴입니다.");
		}
		scanner.close();
	}

}
