class BoxTest
{
    double volume()
    {
        return 1;
    }
    double volume(double l)
    {
        return l*l*l;
    }
    double volume(double w, double h, double d)
    {
        return w*h*d;
    }
}

public class Box {
    public static void main(String[] args) {
        BoxTest b1 = new BoxTest();

        System.out.println("Volume with no parameters: " + b1.volume());
        System.out.println("Volume with 1 parameter: " + b1.volume(10));
        System.out.println("Volume with 3 parameters: " + b1.volume(3,6,9));
    }   
}