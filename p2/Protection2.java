package p2;
import p1.*;

class Protection2 extends Protection
{
    void msg()
    {
        System.out.println("Protection2 class msg() method");
        System.out.println("Private members and default members cannot be accessed");
        System.out.println("Protected variable: " + c);
        System.out.println("Public variable: " + d);
    }
}
