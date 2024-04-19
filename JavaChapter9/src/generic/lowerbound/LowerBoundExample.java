package generic.lowerbound;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class LowerBoundExample {
    public static void main(String[] args) {
        Box<? super Integer> intBox = new Box<>(10);
        Object value = intBox.getValue();
        System.out.println("Value: " + value);

        // 아래 코드는 컴파일 에러가 발생합니다.
        // intBox.setValue("Hello");
    }
}
