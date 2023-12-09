import java.util.Scanner;

public class TernaryOperatorAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 두 정수를 입력받아 변수에 저장하세요.
        System.out.print("첫 번째 정수를 입력하세요: ");
        int number1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int number2 = scanner.nextInt();

        // 2. 3항 연산자를 사용하여 두 정수 중 큰 수를 찾고 결과를 출력하세요.
        int maxNumber = (number1 > number2) ? number1 : number2;
        System.out.println("두 정수 중 큰 수: " + maxNumber);

        // 3. 3항 연산자를 사용하여 두 정수 중 작은 수를 찾고 결과를 출력하세요.
        int minNumber = (number1 < number2) ? number1 : number2;
        System.out.println("두 정수 중 작은 수: " + minNumber);

        // 4. 3항 연산자를 사용하여 두 정수가 같은지 비교하고 결과를 출력하세요.
        String equalityResult = (number1 == number2) ? "같음" : "다름";
        System.out.println("두 정수가 같은지 비교: " + equalityResult);
        scanner.close();
    }
}

