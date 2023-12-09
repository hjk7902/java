
public class Pen {
	static int staticVar = 2000; // 정적 변수, 클래스 변수
	String color = "black"; // 인스턴스 변수
	int price = 500; // 0
	
	public Pen() {}
	
	public Pen(String init_color, int init_price) {
		color = init_color;
		price = init_price;
		System.out.println("생성자 실행됨");
	}
	
	public void write(int count) {

		for(int i=0; i<count; i++) {
			System.out.println(color + "색으로 글을 씁니다.");
		}
		System.out.println("가격:" + price);
	}
}
