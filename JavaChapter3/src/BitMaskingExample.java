
public class BitMaskingExample {

	public static void main(String[] args) {
		int pixel = 0xFFF07896;
		int blue = pixel & 0xFF;
		System.out.println(blue);
		System.out.printf("%x, %d\n", blue, blue);
		
		int red = pixel & 0x00FF0000;
		red = red >> 16;
		System.out.printf("%x, %d", red, red);
	}

}
