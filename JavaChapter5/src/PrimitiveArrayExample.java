
public class PrimitiveArrayExample {

	public static void main(String[] args) {
		char[] cArr = {'A', 'B', 'C', 'D', 'E'};
		
		for(char data: cArr) {
			System.out.println(data);
		}
		System.out.println(cArr.length);
		for(int i=0; i<cArr.length; i++) {
			System.out.println(cArr[i]);
		}
	}

}
