package inner;

public class Outer4 {

	private int data=10;

	public Object makeTheInner(final int localData) {

		final int FINAL_LOCAL_DATA=20;

		class MyInner4 {
			public String toString() {
				return ( "data=" + data + "\nlocalData=" + localData +  "\nFINAL_LOCAL_DATA=" + FINAL_LOCAL_DATA );
			}
		}//end local class
		return new MyInner4();
	}//end makeTheInner()

	public static void main(String[] args) {
		Outer4 out = new Outer4();
		Object in = out.makeTheInner(30);
		System.out.println(in);
	}

}//end class