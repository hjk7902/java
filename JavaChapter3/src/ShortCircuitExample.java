
public class ShortCircuitExample {

	public static void main(String[] args) {
		int x=10, y=20;
		System.out.println( (x!=10) & (++y==21));
		System.out.println(y);
		System.out.println( (x==10) | (++y==21));
		System.out.println(y);
		
		int a=10, b=20;
		System.out.println( (a!=10) && (++b==21));
		System.out.println(b);
		System.out.println( (a==10) || (++b==21));
		System.out.println(b);
	}

}
