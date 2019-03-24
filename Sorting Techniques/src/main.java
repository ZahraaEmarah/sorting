
public class main {

	public static void main(String[] args) {
		int arr[]= {9,6,5,0,8,2,7,1,3};
		Heap heap= new Heap();
		heap.setHeap(arr);
		heap.Buildheap(arr);
	    heap.printHeap();
		////////////////
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.setSorted(arr);
		insertionSort.inSort();
		insertionSort.printInsertionSort();
		}

}
