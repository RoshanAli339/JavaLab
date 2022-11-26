import java.util.*;

public class FactorialFunction 
{
    int factorial(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; ++i)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        FactorialFunction f = new FactorialFunction();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = f.factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}
