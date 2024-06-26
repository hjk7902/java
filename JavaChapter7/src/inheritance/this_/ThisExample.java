package inheritance.this_;

public class ThisExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("허현수");
		Person p3 = new Person("허현준", 5);
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());
		
		Student s1 = new Student("홍길동", 18, "20160001");
		System.out.println(s1.getDetails());
		Teacher t1 = new Teacher("이순신", 45, "자바프로그래밍");
		System.out.println(t1.getDetails());
		Employee e1 = new Employee("허진경", 40, "교무처");
		System.out.println(e1.getDetails());
	}
}
