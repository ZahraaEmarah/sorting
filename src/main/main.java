package main;
import java.util.Random;

import sortingTechniques.Heap;
import sortingTechniques.Insertion;
import sortingTechniques.MergeSort;
import sortingTechniques.SelectionSort;

public class main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int arr[] = new int[r.nextInt(100)];
		System.out.println("array length "+ arr.length);
		
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] = r.nextInt(500);
		}
	
		Heap heap= new Heap();
		heap.setHeap(arr);
		heap.Buildheap(arr);
	    //heap.printHeap();
		////////////////
		Insertion insertion = new Insertion();
		insertion.InsertionSort(arr);
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.setSorted(arr);
		selectionSort.selection();
		selectionSort.print();
		
		MergeSort merge = new MergeSort();
		int[] res = merge.MergeSort(arr);
		
	    System.out.println("Merge Sort Sorted array"); 
 		for(int i=0; i< res.length ; i++ )
 		{
 			System.out.println(res[i]);
 		}
		
		}

}
