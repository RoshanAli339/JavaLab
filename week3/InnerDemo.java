package week3;
class Outer {
    
    static int outer_x = 10;
    
    class Inner
    {
        void display()
        {
            System.out.println("Outer x = " + outer_x);
        }
    }

    void test()
    {
        Outer.Inner ob2 = new Inner();
        ob2.display();
    }
}

class InnerDemo
{
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.test();
    }
}