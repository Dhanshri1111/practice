package Q2;


public class Main {

	public static void main(String[] args)
	{
		int [] arr = new int [] {5,16,7,3,1,11,29,18,20,25};
		
		int low=0;
		int high=arr.length-1;
		QuickSort qs= new QuickSort();
		
		qs.quickSort(arr,low,high);
		qs.PrintArray(arr,high);
		int index=qs.binarySearch(25,arr,arr.length);
		if(index==-1)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("\n Element Found At index "+ index);
		}	
		
		
	}

}
