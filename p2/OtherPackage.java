package p2;

import p1.*;

class OtherPackage {
    void msg()
    {
        System.out.println("OtherPackage class msg() method");
        System.out.println("Private, default and protected members cannot be accessed here");
        System.out.println("Public variable: " + new Protection().d);
    }    
}
