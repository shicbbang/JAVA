package ch01;

public class OperationTest {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int sum = n1 + n2;
        System.out.println(sum);
        String s1 = "반가워요 나의 나이는 ";
        int age = 20;
//        반가워요 나의 나이는 20살 이에요.

        String result = s1 + age + "살 이에요";
        System.out.println(result);

        // 비교연산자
        // >, <, >=, <=, ==, !=
        // 논리연산자
        // &&(and) ,||(or) , ! (not)
        // 비교판단 --- if

        // 비교연산과 논리연산의 결과는 항상 논리값이다.
        boolean trueOrFalse;
        trueOrFalse = (1 == 2);
        System.out.println(trueOrFalse);

    }
}














