import java.util.Scanner;

class Student
{
    String name, roll;
    void readStudent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        roll = sc.nextLine();
    }
}

class Test extends Student
{
    int marks[] = new int[6];
    void readData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in 6 subjects: ");
        for (int i = 0; i < 6; ++i)
        {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
}

class Result extends Test
{
    int total = 0;
    void calculateTotal()
    {
        for (int i : marks) {
            total += i;
        }
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Total marks: " + total);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.readStudent();
        obj.readData();
        obj.calculateTotal();
        obj.displayDetails();
    }
}
