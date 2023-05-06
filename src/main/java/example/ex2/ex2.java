package example.ex2;

import java.util.Scanner;

public class ex2 {
    int findFactory(int n) {

        int Fac = 1;

        for(int i=2; i<=n; i++) {
            Fac *= i;
        }

        return Fac;
    }

    int findFactory2(int n) {
        if(n == 1) {
            return 1;
        } else {
            return (n * findFactory2(n-1));
        }
    }

    public static void main(String[] args) {
        ex2 obj = new ex2();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("팩토리를 구할 수 입력: ");
        int n = scanner.nextInt();
        int sum = obj.findFactory(n);
        int rsum = obj.findFactory2(n);
        System.out.println("sum = " + sum);
        System.out.println("rsum = " + rsum);
        scanner.close();
    }
}
