package week6;
import java.util.Scanner;

abstract class Shape
{
    double dim1, dim2;
    abstract void printArea();

    void setDimensions(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}

class Rectangle extends Shape
{
    void printArea()
    {
        System.out.println("Area of rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Shape
{
    void printArea()
    {
        System.out.println("Area of triangle: " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape
{
    void printArea()
    {
        System.out.println("Area of circle: " + (Math.PI * dim1 * dim2));
    }
}

class ShapeDemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dim1, dim2;
        System.out.println("Rectangle: ");
        System.out.print("Enter dimensions of rectangle: ");
        dim1 = sc.nextDouble();
        dim2 = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.setDimensions(dim1, dim2);
        r.printArea();

        System.out.println("\nTriangle: ");
        System.out.print("Enter dimensions of triangle: ");
        dim1 = sc.nextDouble();
        dim2 = sc.nextDouble();
        Triangle t = new Triangle();
        t.setDimensions(dim1, dim2);
        t.printArea();

        System.out.println("\nCircle: ");
        System.out.print("Enter radius of circle: ");
        dim1 = sc.nextDouble();
        Circle c = new Circle();
        c.setDimensions(dim1, dim1);
        c.printArea();
    }
}