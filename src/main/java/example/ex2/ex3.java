package example.ex2;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    int[][] a = new int[10][10];
    int[][] b = new int[10][10];
    int[][] c = new int[10][10];
    int n, m;

    void init() {
        Random r = new Random();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = (int)(r.nextDouble() * 100);
                b[j][i] = r.nextInt(100);
            }
        }
    }

    void mulMatrix() {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                c[i][j] = 0;
                for(int k=0; k<m; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
    }

    void display(int aa[][], int n, int m) {
        int i, j;
        for(i=0; i<n; i++) {
            for(j=0; j<m; j++) {
                System.out.print(aa[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ex3 obj = new ex3();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("행과 열의 크기 입력 : ");

        obj.n = scanner.nextInt();
        obj.m = scanner.nextInt();
        obj.init();

        System.out.println(" a 행렬 입력");
        obj.display(obj.a, obj.n, obj.m);

        System.out.println(" b 행렬 입력");
        obj.display(obj.b, obj.m, obj.n);

        obj.mulMatrix();
        System.out.println(" a 와 b 의 곱");
        obj.display(obj.c, obj.n, obj.n);
    }
}
