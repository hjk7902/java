
public class ConditionalExample {

	public static void main(String[] args) {
		int a = 5 - (int)(Math.random()*10);
		System.out.println(a);
		
		int abs = a>=0 ? a : -a;
		System.out.println(abs);
		System.out.println(a>=0 ? "0보다 크거나 같음" : "0보다 작음");
	}

}
