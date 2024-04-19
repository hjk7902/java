package annotation;

import java.lang.annotation.*;

//SOURCE 유지 정책의 예시
@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation1 {
	String value();
}

public class SourceRetentionExample {
	// MyAnnotation을 메서드에 적용
	@MyAnnotation1(value = "This annotation will be retained only in source code")
	public void myMethod() {
		// 메서드 내용
	}
}

