
public class Test1 {
	public static void main(String[] args) {
		new Student("홍길동", 30, "12345678");
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.print(1);
	}

	public Person(String name) {
		this(name, 100);
		System.out.print(2);
	}
	
	public Person() {
		this("noname");
		System.out.print(3);
	}
}

class Student extends Person {
	String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
		System.out.print(4);
	}
}