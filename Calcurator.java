package ch01;

public class Calcurator {
    public static void main(String[] args) {
        // 두 수 a = 20, b = 5
        // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를
        // 각각 출력
        int a = 20;
        int b = 5;

        // 1. 덧셈
        int sum = a + b;
        System.out.println("덧셈 결과 ; + sum");

        // 2.뺄셈
        int minus = a - b;
        System.out.println("뺄셈 결과 ; + minus);");

        // 3. 곱셈
        int multiply = a * b;
        System.out.println("곱하기 결과 ; +  multiply");

        // 4. 나누기
        double divide = (double) a / b;
        System.out.println("나눗셈 결과 ; " + divide);

        // 5. 나머지를 구하는 연산자(%)
        // 7을 3으로 나눈 나머지
        System.out.println(7 % 3);
        // 3을 7로 나눈 나머지
        System.out.println(3 % 7);

        // 문제, 7을 3으로 나눈 나머지와 몫을 구하시오.
        // 출력형식은 다음과 같이
        // 몫 : 2, 나머지 : 1

        int result = 7 / 3;
        System.out.println("몫은 ; " + result);
        int namegi = 7 % 3;
        System.out.println("나머지는 ;" + namegi);

    }
}

