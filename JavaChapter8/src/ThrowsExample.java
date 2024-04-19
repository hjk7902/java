public class ThrowsExample {

	static String[] greetings = {"안녕하세요.", "반갑습니다.", "또 오세요."};

	public static void main(String[] args) {
		int i = (int)(Math.random()*4); //0, 1, 2, 3중 하나가 임의로 생성

		try {
			doIt(i);
		}catch(Exception e) {
			System.out.println("main에서 예외처리 했습니다.");
		}
	}

	public static void doIt(int index) throws ArrayIndexOutOfBoundsException {
		System.out.println(greetings[index]);
	}
}