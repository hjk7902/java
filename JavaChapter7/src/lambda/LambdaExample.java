package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        // 정렬할 문자열 배열
        String[] names = {"Eric", "Jin", "Bar", "Foo"};

        // 비교기를 사용하여 문자열 배열을 길이순으로 정렬
        Arrays.sort(names, new StringComparator());

        // 정렬된 배열 출력
        for (String name : names) {
            System.out.println(name);
        }
        
    	// 정렬할 문자열 배열
        String[] names2 = {"Alice", "Bob", "Charlie", "David"};

        // 람다 표현식을 사용하여 문자열 배열을 길이순으로 정렬
        Arrays.sort(names2, (a, b) -> a.length() - b.length());

        // 정렬된 배열 출력
        for (String name : names2) {
            System.out.println(name);
        }        
 
    }
}

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		return a.length() - b.length();
	}
}
