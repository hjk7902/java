
public class StringComparisonExample {

	public static void main(String[] args) {
		String str1 = new String("Hello"); // str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		String str3 = "World";
		String str4 = "World";
		System.out.println(str3==str4); //true
//		System.out.println(str3.concat("abc"));
		str3 = str3.concat("abc");
		System.out.println(str4);
		System.out.println(str3 == str4);
	}

}
