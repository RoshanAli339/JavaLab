import java.util.Scanner;

class Student{
	String name;
	int age;
	float salary;

	void read(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();

		System.out.print("Enter your age: ");
		age = scan.nextInt();

		System.out.print("Enter your salary: ");
		salary = scan.nextFloat();		
        scan.close();
	}

	void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}

class Main{
	public static void main(String args[]){
		Student s1 = new Student();
		
		s1.read();
		s1.display();
	}
}
