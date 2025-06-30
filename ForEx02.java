package ch02;

public class ForEx02 {
    // 1 부터 10 사이의 짝수의 함을 구합니다
    // for 구문을 사용합니다
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i + 2) {
            sum += i; //sum = sum + i;
        }
        System.out.println(sum);

        //다음에서 부족한 부분을 구현
        sum = 0; //초기화
        for (int i = 0; 1 < 11; i++) {
            if (i % 2 == 0) {
                sum = sum + sum + 1;
            }
        }
        System.out.println(sum);
        }
    }

