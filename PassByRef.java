public class PassByRef 
{
    int n = 9;
    void call(PassByRef p)
    {
        p.n += 10;
    }   
    public static void main(String[] args) {
        PassByRef p = new PassByRef();
        System.out.println("Before calling n = " + p.n);
        p.call(p);
        System.out.println("After calling n = " + p.n);
    }
}
