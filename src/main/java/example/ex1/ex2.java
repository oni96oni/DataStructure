package example.ex1;

public class ex2 {
    String name;
    int no;
    String depart;
    String tel;

    ex2() {
        name = "오니";
        no = 20230506;
        depart = "채권";
        tel = "010-1234-5678";
    }

    public void studying(String str) {
        System.out.println("수강과목 = " + str);
    }

    public static void main(String[] args) {
        ex2 ex = new ex2();
        System.out.println("ex.name = " + ex.name);
        System.out.println("ex.no = " + ex.no);
        System.out.println("ex.depart = " + ex.depart);
        ex.studying("자료구조");
    }
}
