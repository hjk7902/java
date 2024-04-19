package polymorphism;

public class HeteroCollectionExample {
	public static void main(String[] args) {
		Person[] pArr = new Person[4];

		pArr[0] = new Person("홍길동", 20);
		pArr[1] = new Student("허현수", 17, "20160001");
		pArr[2] = new Teacher("허현준", 22, "Java Programming");
		pArr[3] = new Employee("허현정", 23, "교무처");

		for(int i=0; i<pArr.length; i++) {
			System.out.println( pArr[i].getDetails() );
		}
	}
}