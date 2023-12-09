
public class Test2 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		System.out.println(c); //30이 출력되어야 함
		
		long data1 = 2147483648L;
		System.out.println(data1); //2147483638이 출력되어야 함
		
		int data2 = 1522;
		byte data3 = (byte)data2;
		System.out.println(data3); //출력하는 값은?
		
		System.out.println(a + b + "Hello"); //1020Hello가 출력되어야 함
	}
}
