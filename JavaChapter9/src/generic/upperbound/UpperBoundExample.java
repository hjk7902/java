package generic.upperbound;

class Box<T extends Number> {
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

public class UpperBoundExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer Value: " + intBox.getValue());

        // 아래 코드는 컴파일 에러가 발생합니다.
        // Box<String> strBox = new Box<>("Hello");
    }
}
