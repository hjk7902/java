package com.example.app;

import java.lang.reflect.Method;

import com.example.calculator.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 8);
        System.out.println("Result: " + result);
        
        // 리플렉션을 통해 내부 패키지의 클래스에 접근
        Class<?> internalCalculatorClass = Class.forName("com.example.calculator.internal.InternalCalculator");
        Method addMethod = internalCalculatorClass.getMethod("add", int.class, int.class);
        Object internalCalculatorInstance = internalCalculatorClass.getDeclaredConstructor().newInstance();
        int internalResult = (int) addMethod.invoke(internalCalculatorInstance, 3, 4);
        System.out.println("Internal Result: " + internalResult);
    }
}
