public class AssertionExample {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 4) + 1;//1,2,3,4값이 임의 발생됨
		System.out.println("넘어온 값 : " + doIt(i));
	}
	public static int doIt(int a) {
		switch(a) {
			case 1:
				System.out.println("1이 입력되었습니다.");
				break;
			case 2:
				System.out.println("2가 입력되었습니다.");
				break;
			case 3:
				System.out.println("3이 입력되었습니다.");
				break;
			default:
				assert false : a;
		}
		return a;
	}
}