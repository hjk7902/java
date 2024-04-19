package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperationExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 순회
        System.out.println("순회:");
        numbers.stream().forEach(System.out::println);

        // 정렬
        System.out.println("\n정렬:");
        numbers.stream().sorted().forEach(System.out::println);

        // 필터링
        System.out.println("\n짝수 필터링:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // 매핑
        System.out.println("\n제곱 값 매핑:");
        numbers.stream().map(n -> n * n).forEach(System.out::println);

        // 집계
        System.out.println("\n합계:");
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // 그룹핑
        System.out.println("\n나머지에 따른 그룹핑:");
        Map<Integer, List<Integer>> groupByRemainder = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 3));
        System.out.println(groupByRemainder);
    }
}

