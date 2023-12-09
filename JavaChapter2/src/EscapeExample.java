
public class EscapeExample {

	public static void main(String[] args) {
		String str1 = "Hello\tWorld\n반갑습니다.";
		System.out.println(str1);
		String str2 = "HelloWorld\r12345";
		System.out.println(str2);
		String multiLineStr = """
				여러 줄 문자열을    표현할 수 있습니다.
				주로 JSON 데이터 또는 <HTML> 태그를 표현할 때 사용합니다.
				
				""";
		System.out.println(multiLineStr);
		// 명령프롬프트에서 실행하려면 `chcp 65001`로 인코딩 변경 후 실행해야 한글 안깨짐
	}

}
