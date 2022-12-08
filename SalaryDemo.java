import java.util.Scanner;

class Employee
{
    String name, id, designation;
    void readEmp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee id: ");
        id = sc.next();
        System.out.print("Enter employee designation: ");
        designation = sc.next();
    }
}

class Salary extends Employee
{
    double bp, hra, da, pf, np;
    void readSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay of employee: $");
        bp = sc.nextDouble();
        System.out.print("Enter house rent allowance of employee: $");
        hra = sc.nextDouble();
        System.out.print("Enter the dearness allowance of employee: $");
        da = sc.nextDouble();
        System.out.print("Enter provident fund amount of employee: $");
        pf = sc.nextDouble();
        sc.close();
    }

    void calculateSalary()
    {
        np = bp + hra + da - pf;
    }

    void displayEmp()
    {
        System.out.println("\n\nName of employee: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Net salary: $" + np);
    }
}

public class SalaryDemo {
    public static void main(String[] args) {
        Salary obj = new Salary();
        System.out.println("Enter employee details: ");
        obj.readEmp();
        obj.readSalary();
        obj.calculateSalary();
        obj.displayEmp();
    }
}