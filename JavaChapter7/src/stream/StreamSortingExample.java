package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {
    public static void main(String[] args) {
        // 정렬할 숫자 리스트 생성
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        // 스트림을 사용하여 리스트를 오름차순으로 정렬
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());

        // 정렬된 리스트 출력
        System.out.println("Sorted Numbers: " + sortedNumbers);
    }
}
