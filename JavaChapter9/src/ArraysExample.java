import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // asList(): 인자로 전달된 요소들을 리스트에 저장하여 반환합니다.
        String[] fruitsArray = {"apple", "banana", "orange"};
        System.out.println("Array to List: " + Arrays.asList(fruitsArray));

        // compare(): 두 배열의 크기를 비교합니다.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int result = Arrays.compare(array1, array2);
        if (result < 0) {
            System.out.println("Array 1 is smaller than Array 2");
        } else if (result > 0) {
            System.out.println("Array 1 is larger than Array 2");
        } else {
            System.out.println("Both arrays are equal");
        }

        // sort(): 배열을 정렬합니다.
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // toString(): 배열의 요소를 문자열로 반환합니다.
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Array to String: " + Arrays.toString(charArray));

        // deepToString(): 다차원 배열의 요소를 문자열로 반환합니다.
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Matrix to String: " + Arrays.deepToString(matrix));
    }
}
