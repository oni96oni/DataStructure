package example.ex1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ex1 {
    public static void main(String[] args) {
        short num1 = 300;
        int num2 = 300000;
        long num3 = 30000000000L, num4;
        float num5 = 3.5F;
        boolean bl = true;
        char ch1 = 'a', ch2;
        num4 = num3 * 2;
        ch2 = (char)(ch1 + 2);
        String msg = "한글깨짐 test";
        System.out.println("*** 다양한 자료 출력");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("bl = " + bl);
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("msg = " + msg);
    }
}
