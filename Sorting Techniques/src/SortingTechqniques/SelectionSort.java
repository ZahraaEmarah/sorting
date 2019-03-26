package SortingTechqniques;

public class SelectionSort {
	private int sorted[];

	public int[] getSorted() {
		return sorted;
	}

	public void setSorted(int sorted[]) {
		this.sorted = sorted;
	}
	public int[] selection()
	{
		int n=sorted.length;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(sorted[j]<sorted[min])
				{
					min=j;
					int temp=sorted[i];
					sorted[i]=sorted[min];
					sorted[min]=temp;
				}
			}
		}
		
		return sorted;
	}
	public void print()
	{
		for(int i=0;i<sorted.length;i++)
			System.out.println(Integer.toString(sorted[i]));
	}

}
