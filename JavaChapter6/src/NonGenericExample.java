
public class NonGenericExample {

	public static void main(String[] args) {
		Box1 stringBox = new Box1();
		stringBox.setValue("Hello Java");
//		stringBox.setValue(30);
		
		Box1 intBox = new Box1();
		intBox.setValue(42);
		
		String stringValue = (String)stringBox.getValue();
		System.out.println(stringValue);
		int intValue = (int)intBox.getValue();
		System.out.println(intValue);
	}

}

class Box1 {
	private Object value;
	public void setValue(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
}
