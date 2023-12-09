import java.util.Scanner;

public class SwitchMonthDayExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도와 월 입력(예: 2000 2)");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		int numDays = 0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			numDays = 30;
			break;
		case 2:
			if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 ==0)) {
				numDays = 29;
			}else {
				numDays = 28;
			}
			break;
		default:
			System.out.println("월 오류");
		}
		System.out.println("Number of Days: " + numDays);
		scanner.close();
	}

}
