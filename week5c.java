class base
{
    final int a = 10;
    final void run()
    {
        System.out.println("This method is declared final");
    }
}

class derived extends base
{
    void run()
    {
        a = 20;
        System.out.println("The final method is overridden and causes runtime error");
    }
}

public class week5c {
    public static void main(String[] args) {
        derived d = new derived();
        d.run();
    }
}
