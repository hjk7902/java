import java.util.Date;

public class FormatExample {

	public static void main(String[] args) {
		int a = 12345;
		System.out.printf("정수: [%d][%10d][%-10d][%010d]\n",
				a, a, a, a);
		double b = 123.456;
		System.out.printf("실수: [%f][%10.2f][%-10.4f][%010.4f]\n",
				b, b, b, b);
		String c = "hello";
		System.out.printf("문자열: [%s][%10s][%-10s][%10S][%5.2s]\n",
				c, c, c, c, c);
		Date d = new Date();
		System.out.printf("날짜: [%1$ty-%1$tm-%1$td]", d);
		System.out.printf("시간: [%tH:%tM:%tS]\n", d, d, d);
		
		System.out.printf("논리: [%b][%B]", true, false);
	}

}
