
public class StringPlusExample {

	public static void main(String[] args) {
		String s1 = "Sun";
		String s2 = "day";
		int a = 20;
		int b = 30;
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		String s3 = s1.concat(s2);
		System.out.println(s3); //Sun
		System.out.println(s1 + a);
		System.out.println(a + b + s1 + s2);
		System.out.println(s1 + s2 + a + b);
		System.out.println(s1 + s2 + (a+b));
	}

}
