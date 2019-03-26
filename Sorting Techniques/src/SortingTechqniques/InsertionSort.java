package SortingTechqniques;

public class InsertionSort {
	//SORTING IN ASCENDING ORDER
	public int[] InsertionSort(int arr[])
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
		
		return arr;
	}
	
	public void Print(int arr[])
	{
        System.out.println("Sorted array"); 

		for(int i=0; i< arr.length ; i++ )
		{
			System.out.println(arr[i]);
		}
	}


	

}
