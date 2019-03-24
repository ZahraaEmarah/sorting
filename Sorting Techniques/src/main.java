
public class main {

	public static void main(String[] args) {
		int arr[]= {9,4,6,10,99,0,100,44,78,1,8};
		Heap heap= new Heap();
		heap.setHeap(arr);
		heap.Buildheap(arr);
	  //  heap.printHeap();
		////////////////
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.setSorted(arr);
		insertionSort.inSort();
	//	insertionSort.printInsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.setSorted(arr);
		selectionSort.selection();
		selectionSort.print();
		}

}
