public class NoAssertionExample {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 4) + 1;//1,2,3,4 값이 임의로 발생됨
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
		}
		return a;
	}
}