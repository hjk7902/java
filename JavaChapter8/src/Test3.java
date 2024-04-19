
public class Test3 {
	public static void main(String[] args) {
		try {
			//some code here
		} catch (NullPointerException e1) {
			System.out.print("a");
		} catch (Exception e2) {
			System.out.print("b");
		} finally {
			System.out.print("c");
		}
	}
}
