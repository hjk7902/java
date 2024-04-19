package inner;

public class InnerExample2 {
	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Outer2.Inner2 in = out.new Inner2();
		in.doIt();
	}
}