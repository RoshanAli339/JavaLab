package week5;
class Room
{
    double area()
    {
        return 1;
    }

    double area(double side)
    {
        return side * side;
    }

    double area(double length, double breadth)
    {
        return length * breadth;
    }
}

public class RoomDemo {
    public static void main(String[] args) {
        Room r1 = new Room();
        System.out.println("Area with no parameters: " + r1.area());
        System.out.println("Area with 1 parameter: " + r1.area(15));
        System.out.println("Area with 2 parameters: " + r1.area(12, 15));
    }
}
