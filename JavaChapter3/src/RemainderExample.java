
public class RemainderExample {

	public static void main(String[] args) {
		System.out.println(0.3);
		System.out.println(0.3 % 0.3);
		double a = 0.3;
		System.out.println(a);
		System.out.println(a % 0.3);
		for (double i=0.1; i<1.0; i=i+0.1) {
			System.out.println("i:" + i);
			if(i%0.3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(3.5 % 0.3);
	}

}
