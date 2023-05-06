package example.ex1;

public class ex3 {
    int sum;
    double sumdbl;

    public int computeSum(int x, int y) {
        sum = x + y;
        return sum;
    }

    public double computeSum(double x, double y) {
        sumdbl = x + y;
        return sumdbl;
    }

    public static void main(String[] args) {
        ex3 obj = new ex3();
        System.out.println("obj.computeSum(10, 20) = " + obj.computeSum(10, 20));
        System.out.println("obj.computeSum(5.2, 20.5) = " + obj.computeSum(5.2, 20.5));

    }
}
