import java.util.Scanner;

public class VarArgs {
    
    double mean(int ... a)
    {
        double m = 0;
        for (int i : a) {
            m += i;
        }
        return m / a.length;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        VarArgs v = new VarArgs();
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; ++i)
        {
            data[i] = sc.nextInt();
        }
        double m = v.mean(data);
        System.out.println("Mean of given data: " + m);
        sc.close();
    }   
}