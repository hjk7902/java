
public class CharCastingExample {

	public static void main(String[] args) {
		char a1 = 'A';
		char a2 = '가';
		System.out.println(a1 + " " + (int)a1);
		System.out.println(a2 + " " + (int)a2);
		int a3 = a1;
		System.out.println(a3);
		short a4 = (short)a1;
		System.out.println(a4);
		System.out.println((short)a2);
		short a5 = (short)a2;
		System.out.println((char)a5);
		double d1 = 56.789;
		System.out.println((char)d1);
		
	}

}
