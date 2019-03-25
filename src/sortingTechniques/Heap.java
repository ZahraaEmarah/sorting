package sortingTechniques;
public class Heap {
	//THIS IS THE MAX HEAP
	int heapsize;
	private int heap[];
	public void Buildheap(int arr[])
	{
		double i=java.lang.Math.floor(arr.length)/2;
		for(;i>=1;i--)
		{
			
			arr=MaxHeapify(arr,(int)i);
		}
		setHeap(arr);
		
	}
	public int[] MaxHeapify(int arr[] , int i ) {
	int l = (2*i);
	int r=2*i+1;
	i=i-1;
	l=l-1;
	r=r-1;
	int largest=i;
	heapsize=arr.length;
	if(l<heapsize&&arr[l]>arr[i])
	{
		
		largest=l;
	}
	if(r<heapsize&&arr[r]>arr[largest])
	{
		
		largest=r;
	}
	
	if(largest !=i)
	{
		int temp = arr[i];
		arr[i]=arr[largest];
	    arr[largest]=temp;
	    largest=largest+1;
	    MaxHeapify(arr,largest);
	}
	
	return arr;
	}
	public int getHeap(int i) {
		return heap[i];
	}
	public void setHeap(int heap[]) {
		this.heap = heap;
	}
	public void printHeap()
	{
		for(int i=0;i<heapsize;i++)
			System.out.println(Integer.toString(getHeap(i)));
	}
	

}
