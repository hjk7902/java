
public class ArrayExample {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 50;
		intArr[1] = 60;
		intArr[2] = 80;
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);
		System.out.println("main");
		
		int[] intArr2 = {1,2,3,4,5,6,7,8};
		for(int data : intArr2) {
			System.out.println(data);
		}
	}

}
