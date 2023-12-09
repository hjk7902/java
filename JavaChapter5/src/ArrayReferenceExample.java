import java.util.Arrays;

public class ArrayReferenceExample {

	public static void main(String[] args) {
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		System.out.println(Arrays.toString(array1));
		array2 = array1;
		System.out.println(Arrays.toString(array2));
		array2[0] = 0;
		array2[2] = 2;
		System.out.println(Arrays.toString(array1));
		int length = doIt(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(length);
		
		int a = 10;
		doThat(a);
		System.out.println(a);
	}
	static int doThat(int a) {
		a = 20;
		return a;
	}

	static int doIt(int[] array) {
		array[0] = 100;
		array[1] = 200;
		return array.length;
	}
}
