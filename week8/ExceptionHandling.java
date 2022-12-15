package week8;

class ExceptionHandling
{
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try
		{
			System.out.print("Enter size of array: ");
			int n = sc.nextInt();
			int arr[] = new int[n], sum = 0;
			System.out.print("Enter the elements of array: ");
			for (int i = 0; i < n; ++i)
			{
				arr[i] = sc.nextInt();		
				sum += arr[i];
			}
			System.out.println("Sum of given array elements: " + sum);
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println(e);
			System.out.println("Array size cannot be negative!");
		}
	}
}