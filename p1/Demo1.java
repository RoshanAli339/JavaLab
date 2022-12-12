package p1;

class Demo1 
{
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();

        ob1.msg();
        ob2.msg();
        ob3.msg();
    }    
}
