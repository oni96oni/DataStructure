package example.ex2;

import java.util.Scanner;

public class ex4 {
    /*
    * 2의 배수의 합을 구하는 문제를 알고리즘으로 표현하고
      반복적인 방법과 순환적인 방법으로 프로그램 작성하시오
    */

    public static void main(String[] args) {
        ex4 obj = new ex4();

        Scanner scanner = new Scanner(System.in);
        System.out.println("자연수를 입력하면 그 숫자까지 중에서 2의 배수들을 더한 값 출력합니다.");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("obj.multiple(n, m) = " + obj.multiple(n));
        System.out.println("obj.multiple2(n) = " + obj.multiple2(n));
    }

    // 반복적
    private int multiple(int n) {
        int sum = 0;

        for(int i=0; i<=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //순환적
    private int multiple2(int n) {
        if (n < 2) {
            return 0;
        }
        int sum = 0;
        if (n % 2 == 0) {
            sum = n;
        }
        return sum + multiple2(n - 1);
    }
}