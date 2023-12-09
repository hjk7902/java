public class DecimalToBinaryExample {
    public static void main(String[] args) {
        int decimalNumber = 23; // 변환하려는 10진수

        // 10진수를 2진수로 변환하여 출력
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("2진수 문자열: " + binaryString);
    }
}
