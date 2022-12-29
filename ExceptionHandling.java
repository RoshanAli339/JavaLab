class ExceptionHandling
{
    public static void main(String args[])
    {
        int n;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try
        {
            int sum = 0;
            System.out.print("Enter size of array: ");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter elements of array: ");
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Sum of array elements: " + sum);
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
            System.out.println("Array size cannot be negative");
        }
    }
}
