class Const
{
    Const()
    {
        System.out.println("Default constructor");
    }
    Const(int a, int b)
    {
        System.out.println("Parameterized constructor with 2 arguments");
        System.out.println("A = " + a + " B = " + b);
    }
    Const(double x)
    {
        System.out.println("Parameterized constructor with a double parameter");
        System.out.println("X = " + x);
    }
}

public class ConstDemo {
    public static void main(String[] args) {
        Const c1 = new Const();
        Const c2 = new Const(4, 5);
        Const c3 = new Const(4.53);
    }
}
