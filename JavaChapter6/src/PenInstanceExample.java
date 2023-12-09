
public class PenInstanceExample {

	public static void main(String[] args) {
		Pen blackPen = new Pen();
		blackPen.write(5);
		System.out.println();
		Pen redPen = new Pen("red", 700);
		System.out.println(redPen);
		redPen.write(3);
		System.out.println(redPen.price);
		System.out.println(Pen.staticVar);
	}

}
