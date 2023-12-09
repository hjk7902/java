
public class MethodExample {
	static int add(int num1, int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
//		MethodExample me = new MethodExample();
//		int result = me.add(100, 200);
		int result = add(100, 200);
		System.out.println(result);
	}

}
