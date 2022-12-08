import java.util.Scanner;

class Figure
{
    double dim1, dim2;
    void readDimensions()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension1: ");
        dim1 = sc.nextDouble();
        System.out.print("Enter dimension2: ");
        dim2 = sc.nextDouble();
    }
    void area()
    {
        System.out.println("Area of figure: " + (dim1 * dim2));;
    }
}

class Rectangle extends Figure
{
    void area()
    {
        System.out.println("Area of rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Figure
{
    void area()
    {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

public class Geometry {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.readDimensions();
        r.area();

        Triangle t = new Triangle();
        t.readDimensions();
        t.area();
    }
}