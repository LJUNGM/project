package com.example.calculator3;

import java.util.Scanner;

public class App {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번쨰 숫자를 입력하세요 : ");
        String fristNumber = sc.next();

        System.out.println("두 번째 숫자를 입려하세요 : ");
        String secondNumber = sc.next();

        System.out.println("연산자를 입력해주세요 : ");
        char operator = sc.next().charAt(0);
        if (fristNumber == null || secondNumber == null) {
            System.out.println("다시 입력해주세요");
        }

        Number firstValue = numberCheck(fristNumber);
        Number secondValue = numberCheck(secondNumber);

        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();
        double result = calculator.calculate(firstValue, secondValue,operator);
        System.out.println("결과: " + result);

    }
    public static Number numberCheck(String input) {
        try {
            if (input.contains(".")){
                return Double.parseDouble(input);
            } else{
                return Integer.parseInt(input);
            }
        }catch (NumberFormatException e) {
            return null;
        }
    }
}
