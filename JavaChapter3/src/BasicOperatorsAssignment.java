public class BasicOperatorsAssignment {
    public static void main(String[] args) {
        // 1. 정수형 변수를 선언하고 값을 할당하세요.
        int a = 10;
        int b = 5;

        // 2. 두 정수를 더하고 결과를 출력하세요.
        int sum = a + b;
        System.out.println("1. 덧셈 결과: " + sum);

        // 3. 두 정수를 빼고 결과를 출력하세요.
        int difference = a - b;
        System.out.println("2. 뺄셈 결과: " + difference);

        // 4. 두 정수를 곱하고 결과를 출력하세요.
        int product = a * b;
        System.out.println("3. 곱셈 결과: " + product);

        // 5. 두 정수를 나누고 결과를 출력하세요. (나눗셈의 경우, 소수점 이하가 나오도록 하세요.)
        double quotient = (double) a / b;
        System.out.println("4. 나눗셈 결과: " + quotient);

        // 6. 두 정수를 나눈 나머지를 출력하세요.
        int remainder = a % b;
        System.out.println("5. 나머지 결과: " + remainder);

        // 7. 두 정수가 같은지 비교하고 결과를 출력하세요.
        boolean isEqual = a == b;
        System.out.println("6. 같음 여부: " + isEqual);

        // 8. 두 정수가 같지 않은지 비교하고 결과를 출력하세요.
        boolean isNotEqual = a != b;
        System.out.println("7. 다름 여부: " + isNotEqual);

        // 9. 한 정수가 다른 정수보다 큰지 비교하고 결과를 출력하세요.
        boolean isGreater = a > b;
        System.out.println("8. 크기 비교: " + isGreater);

        // 10. 한 정수가 다른 정수보다 작거나 같은지 비교하고 결과를 출력하세요.
        boolean isLessOrEqual = a <= b;
        System.out.println("9. 작거나 같음 여부: " + isLessOrEqual);

        // 11. 논리 AND 연산자를 사용하여 두 개의 논리값을 조합하고 결과를 출력하세요.
        boolean condition1 = true;
        boolean condition2 = false;
        boolean logicalAndResult = condition1 && condition2;
        System.out.println("10. 논리 AND 결과: " + logicalAndResult);

        // 12. 논리 OR 연산자를 사용하여 두 개의 논리값을 조합하고 결과를 출력하세요.
        boolean logicalOrResult = condition1 || condition2;
        System.out.println("11. 논리 OR 결과: " + logicalOrResult);
    }
}
