package final_;

public class FinalVarExample {
	final int MY_VALUE = 7;

	public void go() {
//		MY_VALUE = 10;	//Error
		System.out.println(MY_VALUE);
	}

	public static void main(String[] args) {
		FinalVarExample fv = new FinalVarExample();
		fv.go();
	}
}