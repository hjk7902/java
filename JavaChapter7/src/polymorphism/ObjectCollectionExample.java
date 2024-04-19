package polymorphism;

public class ObjectCollectionExample {
	public static void main(String[] args) {
		Object[] objArr = new Object[5];
		objArr[0] = new Person("홍길동", 30);
		objArr[1] = new Student("허준", 25, "20001234");
		objArr[2] = Integer.valueOf(100);
		objArr[3] = new String("Hello");
		objArr[4] = new java.util.Date();

		for(int i=0; i<objArr.length; i++) {
			System.out.println( objArr[i] );
		}
	}
}