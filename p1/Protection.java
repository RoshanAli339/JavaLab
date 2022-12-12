package p1;

public class Protection {
    private int a = 10;
    int b = 15;
    protected int c = 20;
    public int d = 25;

    void msg()
    {
        System.out.println("Protection class msg() method");
        System.out.println("Private variable: " + a);
        System.out.println("Default variable: " + b);
        System.out.println("Protected variable: " + c);
        System.out.println("Public variable: " + d);
        System.out.println();
    }
}
