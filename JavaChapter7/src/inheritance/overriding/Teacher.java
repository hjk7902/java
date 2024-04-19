package inheritance.overriding;

public class Teacher extends Person{
	protected String subject;

	public String getDetails() {
		return "이름: " + name + "\t나이: " + age + "\t과목: " + subject;
	}
}