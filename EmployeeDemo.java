import java.util.Scanner;

class Employee {
    String name;
    String id;
    double salary;
    int n;
    void getInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee id: ");
        id = sc.next();
        System.out.print("Enter employee salary: $");
        salary = sc.nextDouble();
        System.out.print("Enter number of hours of work per day of employee: ");
        n = sc.nextInt();
    }

    void AddSal()
    {
        if (salary < 500)
        {
            salary += 10;
        }
    }

    void AddWork()
    {
        if (n > 6)
        {
            salary += 5;
        }
        System.out.println("Final salary of employee is: $" + salary);
    }
}

class EmployeeDemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of employees: ");
        int n = sc.nextInt();
        Employee e[] = new Employee[n];
        for (int i = 0; i < n; ++i)
        {
            e[i] = new Employee();
        }
        for (Employee employee : e) {
            employee.getInfo();
            employee.AddSal();
            employee.AddWork();
        }
        sc.close();
    }
}