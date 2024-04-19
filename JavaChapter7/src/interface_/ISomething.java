package interface_;

public interface ISomething {
	public static final int DEFAULT_SALARY = 10000;
	int MY_INT = 22;
	void run();
	
	default void doIt() {
		System.out.println("default method");
	}
	
	static void doThat() {
		System.out.println("static method");
	}
}