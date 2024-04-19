package annotation;

import java.lang.annotation.*;

//RUNTIME 유지 정책의 예시
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
	String value();
}

public class RuntimeRetentionExample {
	// MyAnnotation을 메서드에 적용
	@MyAnnotation3(value = "This annotation will be retained until runtime")
	public void myMethod() {
		// 메서드 내용
	}
}

