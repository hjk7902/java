package inner;

public class InnerModifierExample {

	public static void main(String[] args) {
		Outer5 out5 = new Outer5();
		Outer5.Inner1 in1 = out5.new Inner1();
		in1.doIt();		
		Outer5.Inner2 in2 = out5.new Inner2();
		in2.doIt();
		Outer5.Inner3 in3 = out5.new Inner3();
		in3.doIt();
//		Outer5.Inner4 in4 = out5.new Inner4(); //에러
		Outer5.Inner5.doIt();
	}
}