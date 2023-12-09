module CalculatorModule {
	exports com.example.calculator; // 공개할 패키지
	opens com.example.calculator.internal; // 내부 패키지를 열어줌
}
