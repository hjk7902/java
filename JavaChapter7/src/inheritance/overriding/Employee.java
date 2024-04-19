package inheritance.overriding;

public class Employee extends Person{
	protected String department;

	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t부서: " + department;
	}
}