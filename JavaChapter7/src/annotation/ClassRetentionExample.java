package annotation;

import java.lang.annotation.*;

//CLASS 유지 정책의 예시
@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation2 {
	String value();
}

public class ClassRetentionExample {
	// MyAnnotation을 메서드에 적용
	@MyAnnotation2(value = "This annotation will be retained up to class files")
	public void myMethod() {
		// 메서드 내용
	}
}

