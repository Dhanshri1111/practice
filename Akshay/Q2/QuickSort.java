package Q2;


public class QuickSort {

	public void quickSort(int[] arr, int low, int high) 
	{
		
		if(low<high)
		{
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1); //left side
			quickSort(arr,p+1,high); //right side
			
		}
		
	}

	private int partition(int[] arr, int low, int high) 
	{
		int pivot=arr[high]; //last element of array
		int i=low-1;			//start-1 
		int j=low;				//start element of array
		
		while(j!=high)
		{
			if(arr[j]<pivot)
			{
				//increment index of i
				i++;
				
				//swap elements of i& j
				
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
			
		}
		i++;
			//swap arr[i] && arr[j]
			//to swap i with pivot
		int temp1;
		temp1=arr[i];
		arr[i]=arr[high];
		arr[high]=temp1;
		
		return i; 
	}
	
	
	public void PrintArray(int [] arr ,int high)
	{
		for(int i=0; i<=high ;i++)
		{
			System.out.print(" "+ arr[i]+" "); 
		}
		
	}

	public int binarySearch(int key, int[] arr, int length) 
	{
		
		int start=0;
		int end=length-1;
		int mid;
		
		while(start<end)
		{
			mid=(start+end)/2;
			
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
				end=mid-1;
			
			else
				start=mid+1;
		}
		return -1; //if not found
	}
		
		

}
