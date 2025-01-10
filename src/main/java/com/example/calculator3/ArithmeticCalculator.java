package com.example.calculator3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator <T extends Number> {
    private OperatorType operatortype;
    List<Double> results = new ArrayList<>();

    public double calculate(T firstNumber, T secondNumber, char operator) {
        this.operatortype = OperatorType.operator(operator);

        return switch (this.operatortype) {
            case PLUS -> firstNumber.doubleValue() + secondNumber.doubleValue();
            case MINUS -> firstNumber.doubleValue() - secondNumber.doubleValue();
            case MILTIPLY -> firstNumber.doubleValue() * secondNumber.doubleValue();
            case DIVIDE -> firstNumber.doubleValue() / secondNumber.doubleValue();
        };
    }
}
