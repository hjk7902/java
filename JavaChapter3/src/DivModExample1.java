public class DivModExample1 {
	public static void main(String[] args) {
		int number = 45;
		int tensDigit = number / 10; // 십의 자리 숫자
        int unitsDigit = number % 10; // 일의 자리 숫자
        int sum = tensDigit + unitsDigit;
		System.out.println("각 자릿수의 합: " + sum);
	}
}
