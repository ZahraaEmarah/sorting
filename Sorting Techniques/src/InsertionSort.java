
public class InsertionSort {
	//SORTING IN ASCENDING ORDER
	private int sorted[];

	public int[] getSorted() {
		return sorted;
	}

	public void setSorted(int sorted[]) {
		this.sorted = sorted;
	}
	public void inSort()
	{
		int key,i;
		for(int j=1;j<sorted.length;j++)
		{
			key = sorted[j];
			i=j-1;
			while(i>-1 && sorted[i]>key)
			{
				sorted[i+1]=sorted[i];
				i=i-1;
			}
			sorted[i+1]=key;
		}
		
	}
	public void printInsertionSort()
	{
		for(int i=0;i<sorted.length;i++)
			System.out.println(Integer.toString(sorted[i]));
	}
	

}
