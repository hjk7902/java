public class MaskingExample {
    public static void main(String[] args) {
        int originalValue = 0xABCD1234; // 예시 정수 값

        // 0xFF를 사용하여 최하위 바이트를 추출합니다.
        int extractedByte = originalValue & 0xFF;

        System.out.println("원본 값: " + Integer.toHexString(originalValue));        // 출력: ABCD1234
        System.out.println("최하위 바이트 추출: " + Integer.toHexString(extractedByte));  // 출력: 34
    }
}
