package lambda;

import java.util.function.Function;

public class MethodReferenceExample1 {
    // 정적 메서드
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        // 람다 표현식을 사용한 방법
        Function<String, String> lambda = (str) -> toUpperCase(str);

        // 메서드 참조를 사용한 방법
        Function<String, String> reference = MethodReferenceExample1::toUpperCase;

        System.out.println(lambda.apply("hello"));
        System.out.println(reference.apply("world"));
    }
}
