package ch01;

// 3할 연산자 처리(?)
public class TernaryOpr {
    public static void main(String[] args) {
        int n1 = 5;
        //조건비교? 참일때:거짓일때
        //n1과 10을 비교?
        //10보다 큰 값인지, 작은 값인지 출력
        String result; // 두 수를 비교한 결과

        result = n1 > 10 ? "크다" : "작다";
        System.out.println(result);

        // score 변수 생성 : 시험점수 70
        // 점수가 60 이상이면 pass, fail 을 출력하도록 하세요.

        n1 = 65;
        result = n1 >= 60 ? "pass" : "fail";
        System.out.println(result);
    }
}
