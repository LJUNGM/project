package com.example.calculator3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MILTIPLY('*'),
    DIVIDE('/');

    private char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }

    public static OperatorType operator(char operator) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getOperator() == operator) {
                return type;
            }
        }
        return null;
    }

}
