package inheritance.this_;

public class Employee extends Person{
	protected String department;

	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t부서: " + department;
	}
}