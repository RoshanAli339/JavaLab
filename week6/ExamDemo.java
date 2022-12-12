package week6;
import java.util.Scanner;

interface Students
{
    void getValue();
}

interface Department
{
    void getAttendance();
}

class Exam implements Students, Department
{
    Scanner sc = new Scanner(System.in);
    String sno, sName, className;
    double att[] = new double[6];
    double finalAtt;

    public void getValue()
    {
        System.out.print("Enter student serial no.: ");
        sno = sc.nextLine();
        System.out.print("Enter student name: ");
        sName = sc.nextLine();
        System.out.print("Enter student class: ");
        className = sc.nextLine();
    }

    public void getAttendance()
    {
        System.out.println("Enter attendance of 6 months: ");
        for (int i = 0; i < 6; ++i)
        {
            System.out.print("Month "+ (i+1) + ": ");
            att[i] = sc.nextDouble();
        }
    }

    void calAttendance()
    {
        for (double i : att)
            finalAtt += i;
        finalAtt /= 6;
    }

    boolean eligible()
    {
        return finalAtt > 90;
    }

    void printEligible()
    {
        System.out.println("Serial No.: " + sno);
        System.out.println("Name: " + sName);
        System.out.println("Class: " + className);
        if (eligible())
        {
            System.out.println("Eligible to write exams!!");
        }
        else
        {
            System.out.println("Ineligible to write exams!!");
        }
    }
}

public class ExamDemo {
    public static void main(String[] args) {
        Exam e = new Exam();
        e.getValue();
        e.getAttendance();
        e.calAttendance();
        e.printEligible();
    }
}
