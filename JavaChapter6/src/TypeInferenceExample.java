import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {

	public static void main(String[] args) {
		var myList = new ArrayList<String>();
		System.out.println(myList.size());
		
		var str = "Hello";
		var x = 10;
		x = 20;
		
//		var x = 30;
		System.out.println(str + " " + x);
		
		List<String> myList2 = new ArrayList<>();
		System.out.println(myList2);
		
//		MyFunction myFunc = (String s) -> s.length();
		MyFunction myFunc = (s) -> s.length();
		System.out.println(myFunc.myMethod("Hello"));
	}
}
