package Q1;

public class Stack {
	
	Node top ;
	
	public Stack()
	{
		top=null;
	}
	
	public void push(Student s1)
	{
		Node temp =new Node(s1);
		//first node
		if(top==null)
		{
			top=temp;
		}
		
		else
		{
			temp.next=top;
			top=temp;
		}
	}
	
	public void pop()
	{
		if(top!=null)
		{
			//we have 1 or more node
			
			if(top.next==null) //condition for single node
			{
				Node temp=top;
				top=null;
				
				temp.next=null;
				temp=null;
			}
			
			else
			{
				//multiple nodes
				 Node temp=top;
				 top=temp.next;
				 temp.next=null;
				 temp=null;
						 
			}	
	}
		
			
	}
	
	
	public void allFemale()
	 {
		 Node it=top;
		 
		 if(top==null)
			{
				System.out.println("Empty LL "); ;
			}
			else
			{
				
				while(it!=null)
				{
					if(it.data.gender=='F' || it.data.gender=='f')
					{
						System.out.println(" "+ it.data.name+ " ");  //print name only if gen=F
					}
					it=it.next;
				}
			}
		 	System.out.println();
	 }
	
	
	public void allMale()
	 {
		 Node it=top;
		 
		 if(top==null)
			{
				System.out.println("Empty LL "); ;
			}
			else
			{
				
				while(it!=null)
				{
					if(it.data.gender=='M' || it.data.gender=='m')
					{
						System.out.println(" "+ it.data.name+ " "); //print name only if gen=F
					}
					it=it.next; //go to next node
				}
			}
		 	System.out.println();
	 }
	
	
	public String toString()
	{
		
		String str =" ";
		
		if(top==null)
		{
			str +=" "+"Linked List is Empty"+" ";
		}
		else
		{
			Node it=top;
			
			while(it!=null)
			{
				str+= "Roll No "+ it.data.rollno+ "\n "+"Name :"+ it.data.name+"\n"+"Gender :"+it.data.gender;
				it=it.next;
			}
		}
		System.out.println();
		return str;
	}

}
