package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator ca = new Calculator();

        while(ca.getLoopCheck().equals("YES")){
            System.out.println("첫 번째 숫자를 입력하세요:");
            ca.setNum1(sc.nextInt());

            System.out.println("두 번째 숫자를 입력하세요:");
            ca.setNum2(sc.nextInt());

            sc.nextLine();
            System.out.println("사칙연산 기호를 입력하세요: ");
            ca.setOperator(sc.next().charAt(0));

            ca.calculate();
            int i = ca.getI();
            System.out.println("계산 결과 : " + ca.getResult(i));

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            if (sc.nextLine().equals("exit")){
                ca.setLoopCheck("exit");
            }

        }
    }
}
