import java.util.Scanner;

class Employee
{
    String name, id;
    double salary;
    void read_emp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee id: ");
        id = sc.next();
        System.out.print("Enter employee salary: $");
        salary = sc.nextDouble();
    }
}

class permanent_employee extends Employee
{
    void print_emp()
    {
        salary += (5.0/100) * salary;
        System.out.println("\nName: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Final salary after increment: $" + salary);
    }
}

class temporary_employee extends Employee
{
    void print_emp()
    {
        salary += (3.5/100)*salary;
        System.out.println("\nName: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Final salary after increment: $" + salary);
    }
}


public class SalaryIncrement {
    public static void main(String[] args) {
        System.out.println("Temporary Employee: ");
        temporary_employee t = new temporary_employee();
        t.read_emp();
        t.print_emp();

        System.out.println("\n\nPermanent Employee:");
        permanent_employee p = new permanent_employee();
        p.read_emp();
        p.print_emp();
    }
}
