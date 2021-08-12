package Q1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		
		
		boolean flag=true;
		Scanner sc=new Scanner (System.in);
		Student s=new Student();
		Stack st=new Stack();
		while(flag)
		{
			System.out.println("***********Menu***********");
			System.out.println("1.Push Student");
			System.out.println("2.Pop Student");
			System.out.println("3.View All Student");
			System.out.println("4.All Female");
			System.out.println("5.All Male");
			System.out.println("6.Exit");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			
			case 1:	
				Student s1 =s.userinput();
				st.push(s1);
				break;
				
			case 2:	
				st.pop();
				break;
			case 3:
				System.out.println(st.toString());
				break;
			case 4:
				st.allFemale();
				break;
			case 5:
				st.allMale();
				break;
			case 6:flag=false;
				return ;
			default:
				break;
			
				
				
			}
			
		}
		
	}

	

}
