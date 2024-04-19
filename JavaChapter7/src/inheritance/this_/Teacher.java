package inheritance.this_;

public class Teacher extends Person{
	protected String subject;

	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t과목: " + subject;
	}
}