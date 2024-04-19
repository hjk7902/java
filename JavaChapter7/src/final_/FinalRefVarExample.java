package final_;

public class FinalRefVarExample {
	static final MyDate date = new MyDate();

	public static void main(String[] args) {
//		date = new MyDate(); //Error

		date.year = 2024;
		System.out.println( date.toString() );
	}
}

class MyDate {
	int year = 2000;
	int month = 1;
	int day = 1; 
	public String toString() {
		return "[" + year + "-" + month + "-" + day + "]";
	}
}