package week5;
class base
{
    final void run()
    {
        System.out.println("Running in final method");
    }
}

public class finalDemo2 extends base
{
    void run2()
    {
        System.out.println("We cannot override a final method");
    }
    public static void main(String[] args) {
        finalDemo2 ob = new finalDemo2();
        ob.run();
        ob.run2();
    }
}
