
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sum(3,4));
		System.out.println(calc.sum(3,4,5));
//		System.out.println(calc.sum(3,4,5,6));
		int[] datas = {3,4,5,6};
		System.out.println(calc.sum(datas));
		System.out.println(calc.sum(new int[] {3,4,5,6}));
		System.out.println(calc.sum(1,2,3,4,5,6));
	}

} // end class

class Calculator {
	public int sum(int num1, int num2) {
		System.out.println("2");
		return num1+num2;
	}
	public int sum(int num1, int num2, int num3) {
		System.out.println("3");
		return num1+num2+num3;
	}
	public int sum(int... values) {
		System.out.println("...");
		int sum = 0;
		for(int value: values) {
			sum += value;
		}
		return sum;
	}
//	public int sum(int[] values) {
//		int sum = 0;
//		for(int value : values) {
//			sum += value;
//		}
//		return sum;
//	}
}