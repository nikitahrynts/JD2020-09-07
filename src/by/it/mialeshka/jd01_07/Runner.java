package by.it.mialeshka.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar("3.14");
        Var v2 = new Vector("{1, 2, 4}");
        Var v3 = new Matrix("{{1,2,3},{4,5,6},{7,8,9}}");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
