package polymorphism;

public class InstanceofExample {
	public static void main(String[] args) {
		Student s = new Student("허현수", 17, "20001234");
		printPersonInfo(s);

		Teacher t = new Teacher("허현준", 22, "Java Programming");
		printPersonInfo(t);

		Employee e = new Employee("허현정", 23, "교무처");
		printPersonInfo(e);
	}

	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("************ Student Info ***********");
		}else if(p instanceof Teacher) {
			System.out.println("************ Teacher Info ***********");
		}else if(p instanceof Employee) {
			System.out.println("************ Employee Info **********");
		}else {
			System.out.println("************ Person Info ************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("*************************************\n");
	}
}