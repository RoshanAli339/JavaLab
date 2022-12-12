package p1;

class SamePackage 
{
    void msg()
    {
        System.out.println("SamePackage class msg() method");
        Protection p = new Protection();
        System.out.println("Private variables cannot be accessed here");
        System.out.println("Default variable: " + p.b);
        System.out.println("Protected variable: " + p.c);
        System.out.println("Public variable: " + p.d);
        System.out.println();
    }    
}
