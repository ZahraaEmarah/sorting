package sortingTechniques;


public class MergeSort {
	
	
	public int[] MergeSort(int[] array)
	{
		
		if(array.length <= 1)
		{
			return array;       /** Stop Condition of the recursive function **/
		}
		
		/** Setting the size for the smaller arrays**/
		int Midpoint = array.length / 2 ;       
		int leftarray[] = new int[Midpoint] ;
		int rightarray[] ;
		
		if(array.length % 2 == 0)
		{
			rightarray = new int[Midpoint] ;     
		} else
		{
			rightarray = new int[Midpoint + 1] ;
		}
		
		
		/** Populating the smaller arrays**/
		for(int i=0; i<Midpoint; i++)
		{
			leftarray[i] = array[i];
		}
		
		for(int i=0; i<rightarray.length; i++)
		{
			rightarray[i] = array[i + Midpoint] ;
		}
		
		int[] result = new int[array.length] ;
		
		leftarray  = MergeSort(leftarray);
		rightarray = MergeSort(rightarray);
		
		result = MergeArrays(leftarray, rightarray);
		
		
		return result ;
	}
	
	public int[] MergeArrays(int leftarray[], int rightarray[])
	{
		int Rindex = 0; 
		int Lindex = 0;
		int ResIndex = 0;
		
		int[] result = new int[leftarray.length + rightarray.length];
		
		while(Lindex < leftarray.length || Rindex < rightarray.length) //while there's elements in the array
		{
			if(Lindex < leftarray.length && Rindex < rightarray.length) //if both arrays have elements in them
			{
				if(leftarray[Lindex] <= rightarray[Rindex])
			
			   {
				
					result[ResIndex] = leftarray[Lindex] ;
				
				    ResIndex ++;
				    Lindex ++;
				    
			   } else
				
			   {
                
				   result[ResIndex] = rightarray[Rindex] ;
				
				   ResIndex ++;
				   Rindex ++;
			   }
				
			}
			else if(Lindex < leftarray.length)  // if only the left array has elements
			{
				
				   result[ResIndex] = leftarray[Lindex] ;
					
				   ResIndex ++;
				   Lindex ++;
				
			}
			
			else if(Rindex < rightarray.length) // if only the right array has elements
			{
				
				   result[ResIndex] = rightarray[Rindex] ;
					
				   ResIndex ++;
				   Rindex ++;
				
			}
		}
		return result;
	}
	
	
}
