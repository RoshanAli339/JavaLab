import java.util.Scanner;

class student 
{
    String name, roll;

    student(String name, String roll)
    {
        this.name = name;
        this.roll = roll;
    }
}

public class testStudent {
    public static void main(String[] args) {
        String name, roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextLine();
        student s = new student(name, roll);
        System.out.println("Name: " + s.name);
        System.out.println("Roll no.: " + s.roll);
        sc.close();
    }
}
