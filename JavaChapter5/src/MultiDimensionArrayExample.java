import java.util.Arrays;

public class MultiDimensionArrayExample {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i*j;
			}
		}
		
		for(int[] arrData : arr) {
			System.out.println(Arrays.toString(arrData));
		}
		System.out.println(Arrays.toString(arr));
		
//		int[] a[], b;
//		int c[][];
//		int []d [];
//		a = new int[3][3];
//		b = new int[2];
	}

}
