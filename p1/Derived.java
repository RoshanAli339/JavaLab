package p1;

class Derived extends Protection
{
    void msg()
    {
        System.out.println("Derived class msg() method");
        System.out.println("Private members cannot be accessed here");
        System.out.println("Default variable: " + b);
        System.out.println("Protected variable: " + c);
        System.out.println("Public variable: " + d);
        System.out.println();
    }
}
