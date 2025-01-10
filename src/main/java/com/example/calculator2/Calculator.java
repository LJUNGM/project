package com.example.calculator2;
// 사칙연산을 수행, 결과값 반환, 연산 결과 저장 -> collection type field

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //사칙연산 수행
    //연산 결과 저장
    private int num1;
    private int num2;
    private char operator;
    private String loopCheck = "YES";
    private int value;
    private int i = 0;
    private List<Integer> result = new ArrayList<Integer>();

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getLoopCheck() {
        return loopCheck;
    }

    public void setLoopCheck(String loopCheck) {
        this.loopCheck = loopCheck;
    }

    public int getResult(int i) {
        return value;
    }

    public void setResult(int result) {
        this.value = result;
    }

    public int getI() {
        return i;
    }

    public void calculate () {
        switch (operator) {
            case'+' :
                value = num1 + num2;
                break;
            case'-' :
                value = num1 - num2;
                break;
            case'*' :
                value = num1 * num2;
                break;
            case'/' :
                value = num1 / num2;
                break;
        }
        this.result.add(this.i, value);//set 을 사용해서 오류 발생
        this.i++;

    }
}
