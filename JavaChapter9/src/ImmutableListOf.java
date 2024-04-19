import java.util.List;

public class ImmutableListOf {
    public static void main(String[] args) {
        // List.of() 메서드를 사용하여 수정할 수 없는 리스트 생성
        List<String> immutableList = List.of("apple", "banana", "orange");

        // 생성된 리스트는 수정 불가능
        // immutableList.add("grape"); // 에러: UnsupportedOperationException 발생

        // 조회는 가능
        System.out.println("Immutable List: " + immutableList);
    }
}
