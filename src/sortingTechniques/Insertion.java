package sortingTechniques;


public class Insertion {
	
	
	public void InsertionSort(int arr[])
	{
		for(int i=0; i< arr.length ; i++)
		{
				int j = i;
				while( j>0  && arr[j-1] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					 
					j--;
				}
		}
		
		Print(arr);
	}
	
	public void Print(int arr[])
	{
        System.out.println("Insertion Sort Sorted array"); 

		for(int i=0; i< arr.length ; i++ )
		{
			System.out.println(arr[i]);
		}
	}


}
