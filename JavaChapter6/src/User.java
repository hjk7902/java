public class User {
    private String name;
    private int age;

    // 생성자 중복
    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
    
}
