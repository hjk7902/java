
public class BitShiftExample {

	static void printBinStr(int i) {
		String binStr = Integer.toBinaryString(i);
		System.out.printf("[%32s], %d\n", binStr, i);
	}
	public static void main(String[] args) {
		int x = 192;
		printBinStr(x);
		
		printBinStr(x << 3);
		printBinStr(x >> 3);
		
		System.out.println();
		int y = -192;
		printBinStr(y);
		printBinStr(y << 3);
		printBinStr(y >> 3);
		printBinStr(y >>> 3);
		printBinStr(y >>> 35);// y >>> 3
	}

}
