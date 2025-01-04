package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Fnum; // 첫 번쨰 변수를 입력받을 공간
        int Snum; // 두 번째 변수를 입력받을 공간
        char Symbol; // 사칙연산 기호를 입력받을 공간
        int result; // 결과값을 저장할 공간
        String loopcheck = "loop"; // 반복체크를 위한 변수를 입력받을 공간

        while (true) {
            System.out.println("계산할 첫 번째 숫자를 입력해주세요");
            Fnum = sc.nextInt();
            System.out.println("계산할 두 번째 숫자를 입력해주세요");
            Snum = sc.nextInt();
            /*String test;
            test = sc.nextLine();
            System.out.println(test);*/

            System.out.println("사칙연산 기호를 입력해주세요: ");
            Symbol = sc.nextLine().charAt(0); // nextInt 에서 \n(엔터)를 가져오지 않고 버퍼에 남겨둠으로써 nextln을 사용하면 남아있던 \n이 nextln을 넘겨버림

            switch (Symbol) {
                case '+':
                    result = Fnum + Snum;
                    System.out.println("결과: " + result);
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    loopcheck = sc.nextLine();

                    break;

                case '-':
                    result = Fnum - Snum;
                    System.out.println("결과: " + result);
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    loopcheck = sc.nextLine();
                    break;

                case '/':
                    if (Snum == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 숫자)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = Fnum / Snum;
                    System.out.println("결과: " + result);
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    loopcheck = sc.nextLine();
                    break;

                case '*':
                    result = Fnum * Snum;
                    System.out.println("결과: " + result);
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    loopcheck = sc.nextLine();
                    break;
            }
            if (loopcheck.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}