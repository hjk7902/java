import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int source[] = {1,2,3,4,5,6};
		int destination[] = {9,8,7,6,5,4,3,2,1,0};
		System.arraycopy(source, 1, destination, 3, 4);
		System.out.println(Arrays.toString(destination));
		
		System.out.println(Arrays.toString(source));
		String srcStr = Arrays.toString(source);
		System.out.println(srcStr);
		System.out.println(source);
		source = new int[10];
		System.out.println(source);
		source = new int[]{1,2,3,4,5,6,7,8,9,0};
		System.out.println(source);
	}

}
