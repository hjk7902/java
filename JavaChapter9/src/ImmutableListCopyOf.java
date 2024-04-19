import java.util.ArrayList;
import java.util.List;

public class ImmutableListCopyOf {
    public static void main(String[] args) {
        // 변경 가능한 리스트 생성
        List<String> mutableList = new ArrayList<>();
        mutableList.add("apple");
        mutableList.add("banana");
        mutableList.add("orange");

        // List.copyOf() 메서드를 사용하여 수정할 수 없는 리스트 생성
        List<String> immutableList = List.copyOf(mutableList);

        // 원본 리스트에 변화가 생겨도 생성된 리스트는 영향을 받지 않음
        mutableList.add("grape");

        // immutableList에 변화가 없음
        System.out.println("Immutable List: " + immutableList);
    }
}
