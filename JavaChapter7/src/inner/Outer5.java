package inner;

public class Outer5 {

	public class Inner1 {
		public void doIt() {
			System.out.println("Inner1.doIt");
		}
	}

	protected class Inner2 {	//하위 클래스에서 참조 가능
		public void doIt() {
			System.out.println("Inner2.doIt");
		}
	}

	/* friendly */ class Inner3 {	//같은 패키지 내의 클래스에서 참조 가능
		public void doIt() {
			System.out.println("Inner3.doIt");
		}
	}

	private class Inner4 {		//클래스 안에서만 참조 가능
		public void doIt() {
			System.out.println("Inner4.doIt");
		}
	}

	public static class Inner5 {
		public static final int MY_NUM = 50;
		public static void doIt() {
			System.out.println("Inner5.doIt");
		}
	}	

	public void go() {
		Inner1 in1 = new Inner1();
		in1.doIt();
		Inner2 in2 = new Inner2();
		in2.doIt();
		Inner3 in3 = new Inner3();
		in3.doIt();
		Inner4 in4 = new Inner4();
		in4.doIt();
		Inner5.doIt();
	}//end go()

	public static void main(String[] args) {
		Outer5 out = new Outer5();
		out.go();
		Outer5.Inner4 in = out.new Inner4();
		in.doIt();
		System.out.println("Inner5.MY_NUM : " + Inner5.MY_NUM);
	}//end main()

}//end Outer5 class