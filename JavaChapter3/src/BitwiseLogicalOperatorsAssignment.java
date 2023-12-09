public class BitwiseLogicalOperatorsAssignment {
	static void printBinStr(String message, int num) {
		// 1. 매개변수 num을 이진 문자열로 출력하세요.
		String binStr = Integer.toBinaryString(num);
		System.out.printf("%s: [%32s], %d\n", message, binStr, num);
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		// 2. 실행 결과를 참고하여 printBinStr 함수를 호출해서 x, y 두 정수를 이진수로 출력하세요.
		printBinStr("1. x의 이진 표현: ", x);
		printBinStr("2. y의 이진 표현: ", y);

		// 3. 비트 AND 연산자를 사용하여 두 정수를 비트 단위로 AND 연산하고 결과를 출력하세요.
		int bitwiseAndResult = x & y;
		printBinStr("3. 비트 AND 결과: ", bitwiseAndResult);

		// 4. 비트 OR 연산자를 사용하여 두 정수를 비트 단위로 OR 연산하고 결과를 출력하세요.
		int bitwiseOrResult = x | y;
		printBinStr("4. 비트 OR 결과: ", bitwiseOrResult);

		// 5. 비트 XOR 연산자를 사용하여 두 정수를 비트 단위로 XOR 연산하고 결과를 출력하세요.
		int bitwiseXorResult = x ^ y;
		printBinStr("5. 비트 XOR 결과: ", bitwiseXorResult);

		// 6. 비트 NOT 연산자를 사용하여 한 정수를 비트 단위로 NOT 연산하고 결과를 출력하세요.
		int bitwiseNotResult = ~x;
		printBinStr("6. 비트 NOT 결과: ", bitwiseNotResult);

		// 7. 논리 AND 연산자를 사용하여 두 개의 논리값을 조합하고 결과를 출력하세요.
		boolean condition1 = true;
		boolean condition2 = false;
		boolean logicalAndResult = condition1 && condition2;
		System.out.println("7. 논리 AND 결과: " + logicalAndResult);

		// 8. 논리 OR 연산자를 사용하여 두 개의 논리값을 조합하고 결과를 출력하세요.
		boolean logicalOrResult = condition1 || condition2;
		System.out.println("8. 논리 OR 결과: " + logicalOrResult);

		// 9. 논리 NOT 연산자를 사용하여 한 개의 논리값을 반전하고 결과를 출력하세요.
		boolean logicalNotResult = !condition1;
		System.out.println("9. 논리 NOT 결과: " + logicalNotResult);
	}
}
