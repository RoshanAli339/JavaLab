package week5;
final class base
{
    void run()
    {
        System.out.println("Running in final class");
    }
}

public class finalDemo3 // extends base
{
    void run2()
    {
        System.out.println("We cannot inherit a final class");
    }    
    public static void main(String[] args) {
        finalDemo3 ob = new finalDemo3();
        ob.run2();
    }
}
