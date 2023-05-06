package example.ex2;

import java.util.Scanner;

public class ex1 {
    // 반복적인 방법으로 작성
    int computeSum(int n) {
        int sum = 0;

        for(int i=0; i<=n; i++) {
            sum += i;
        }

        return sum;
    }

    // 순환 방법으로 작성
    int recSum(int n) {
        if(n == 1) {
            return 1;
        } else {
            return (n + recSum(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex1 obj = new ex1();
        System.out.printf("합을 구할 수 입력: ");
        int n = scanner.nextInt();
        int sum = obj.computeSum(n);
        int rsum = obj.recSum(n);
        System.out.println("sum = " + sum);
        System.out.println("rsum = " + rsum);
        scanner.close();
    }
}
