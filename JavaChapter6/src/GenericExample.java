
public class GenericExample {

	public static void main(String[] args) {
		Box2<String> stringBox = new Box2<String>();
		stringBox.setValue("Hello");
//		stringBox.setValue(20);
		Box2<Integer> intBox = new Box2<>();
		intBox.setValue(30);
		System.out.println(stringBox.getValue());
		System.out.println(intBox.getValue());
	}

}

class Box2<T> {
	private T value;
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}