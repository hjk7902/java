package polymorphism;

public class WrapperEqualsExample {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = 10; // Integer.valueOf(10);
		Integer i3 = 300; //Integer.valueOf(300);
		Integer i4 = 300; //Integer.valueOf(300);
		System.out.println("i1==i2 : " + (i1==i2));
		System.out.println("i3==i4 : " + (i3==i4));
		System.out.println("i3.equals(i4): " + i3.equals(i4));
	}
}