package com.example.calculator;

import com.example.calculator.internal.InternalCalculator;

/**
 * 계산기 모듈
 * @author JK
 * @version 1.0
 * @since 2023.11.19
 */
public class Calculator {
	
	private final InternalCalculator internalCalculator = new InternalCalculator();

	/**
	 * 두 정수를 입력받아 더한 결과를 반환합니다.
	 * @param a 정수
	 * @param b 정수
	 * @return a+b 결과를 반환합니다.
	 */
    public int add(int a, int b) {
        return internalCalculator.add(a, b);
    }
}

