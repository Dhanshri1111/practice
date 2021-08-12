package Q1;
import java.util.Scanner ;
public class Student 
{
	int rollno;
	String name;
	char gender;
	
	Student()
	{
		
	}
	
	public Student(int rollno, String name, char gender)
	{
		
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}
	
	public Student userinput()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		Student students=new Student(rollno,name,gender);
		return students;
		
	}
	
	
	
	
	
	
	
	
	
}
