package ch01;

public class Casting {
    // 캐스팅은 한국어로 형변환
    // 종류로
    // 다운캐스팅(down-casting)
    // 업캐스팅(up-casting)
    public static void main(String[] args) {
        int n1 = 100; // 4byte(21억)
        System.out.println(n1);
        double d1 = n1; //묵시적 업캐스팅
        System.out.println(d1);

        long longType = 100;
        int intType = (int) longType; // 명시적 다운캐스팅(alt+enter 로 대체 방안 검색 가능)

    }
}
