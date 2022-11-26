import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("Enter another integer: ");
        int b = sc.nextInt();

        System.out.println("Addition a+b= " + (a+b));
        System.out.println("Subtraction a-b= " + (a-b));
        System.out.println("Multiplication a*b= " + (a*b));
        System.out.println("Division a/b= " + ((float)a/b));
        System.out.println("Remainder division a%b= " + (a%b));
        sc.close();
    }
}
