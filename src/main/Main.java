package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import sortingTechniques.Heap;
import sortingTechniques.Insertion;
import sortingTechniques.MergeSort;
import sortingTechniques.SelectionSort;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.Random;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField size;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBounds(100, 100, 525, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSortingTechniques = new JLabel("Sorting Techniques");
		lblSortingTechniques.setBounds(147, 11, 212, 40);
		lblSortingTechniques.setHorizontalAlignment(SwingConstants.CENTER);
		lblSortingTechniques.setFont(new Font("Stencil", Font.PLAIN, 18));
		frame.getContentPane().add(lblSortingTechniques);
		
		JLabel lblOriginalArray = new JLabel("Original Array :");
		lblOriginalArray.setBounds(10, 75, 99, 23);
		lblOriginalArray.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblOriginalArray);
		
		
		JLabel lblSortedArray = new JLabel("Merge Sort:");
		lblSortedArray.setBounds(10, 171, 88, 23);
		lblSortedArray.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblSortedArray);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 75, 392, 40);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblArraySize = new JLabel("Array Size:");
		lblArraySize.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArraySize.setBounds(10, 126, 99, 23);
		frame.getContentPane().add(lblArraySize);
		
		size = new JTextField();
		size.setHorizontalAlignment(SwingConstants.CENTER);
		size.setBounds(108, 126, 47, 23);
		frame.getContentPane().add(size);
		size.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(369, 201, 131, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(369, 277, 131, 40);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(369, 357, 131, 40);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(369, 442, 131, 40);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(369, 518, 131, 40);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(369, 598, 131, 40);
		frame.getContentPane().add(textField_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 201, 349, 40);
		frame.getContentPane().add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 442, 349, 40);
		frame.getContentPane().add(scrollPane_4);
		
		JTextArea textArea_4 = new JTextArea();
		scrollPane_4.setViewportView(textArea_4);
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 277, 349, 40);
		frame.getContentPane().add(scrollPane_3);
		
		JTextArea textArea_2 = new JTextArea();
		scrollPane_3.setViewportView(textArea_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 357, 349, 40);
		frame.getContentPane().add(scrollPane_2);
		
		JTextArea textArea_3 = new JTextArea();
		scrollPane_2.setViewportView(textArea_3);
		
		JButton btnSort = new JButton("Generate Array");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				textArea_3.setText("");
				textArea_4.setText("");

				
				Random r = new Random();
				int arr[] = new int[r.nextInt(11000)];
				
				System.out.println("array length "+ arr.length);
				
				for(int i=0; i<arr.length ; i++)
				{
					arr[i] = r.nextInt(22000);
				}
				
				for(int i=0; i<arr.length ; i++)
				{
					arr[i] = r.nextInt(500);
					textArea.append(Integer.toString(arr[i]) + " - ");
				}
				
				size.setText(Integer.toString(arr.length));
				
				long start = System.currentTimeMillis();
				Heap heap= new Heap();
				heap.setHeap(arr);
				heap.Buildheap(arr);
				long end = System.currentTimeMillis();
			    int[] res0 = heap.printHeap();
			    for(int i=0; i<res0.length ; i++)
				{
					textArea_4.append(Integer.toString(res0[i]) + " - ");
				}
			    textField_3.setText(Long.toString(end-start) + " ms");
				
			    start = System.currentTimeMillis(); 
				Insertion insertion = new Insertion();
				int[] res = insertion.InsertionSort(arr);
				end = System.currentTimeMillis();
				textField_1.setText(Long.toString(end-start) + " ms");
				for(int i=0; i<res.length ; i++)
				{
					textArea_2.append(Integer.toString(res[i]) + " - ");
				}
				
				start = System.currentTimeMillis(); 
				MergeSort merge = new MergeSort();
				int[] res1 = merge.MergeSort(arr);
				end = System.currentTimeMillis();
				textField.setText(Long.toString(end-start) + " ms");
				for(int i=0; i<res.length ; i++)
				{
					textArea_1.append(Integer.toString(res1[i]) + " - ");
				}
				
				start = System.currentTimeMillis();
				SelectionSort selectionSort = new SelectionSort();
				selectionSort.setSorted(arr);
				int res2[] = selectionSort.selection();
				end = System.currentTimeMillis();
				textField_2.setText(Long.toString(end-start) + " ms");
				for(int i=0; i<res2.length ; i++)
				{
					textArea_3.append(Integer.toString(res2[i]) + " - ");
				}
			}
		});
		btnSort.setBounds(373, 126, 127, 23);
		frame.getContentPane().add(btnSort);
		
		JLabel lblInsertionSort = new JLabel("Insertion Sort:");
		lblInsertionSort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInsertionSort.setBounds(10, 252, 88, 14);
		frame.getContentPane().add(lblInsertionSort);
		
		JLabel lblSw = new JLabel("Selection Sort:");
		lblSw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSw.setBounds(10, 332, 99, 14);
		frame.getContentPane().add(lblSw);
		
		JLabel lblHeapSort = new JLabel("Heap Sort:");
		lblHeapSort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHeapSort.setBounds(10, 408, 99, 23);
		frame.getContentPane().add(lblHeapSort);
		

		
		
		
		JLabel lblBubbleSort = new JLabel("Bubble Sort:");
		lblBubbleSort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBubbleSort.setBounds(10, 493, 99, 14);
		frame.getContentPane().add(lblBubbleSort);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 518, 349, 40);
		frame.getContentPane().add(scrollPane_5);
		
		JTextArea textArea_5 = new JTextArea();
		scrollPane_5.setViewportView(textArea_5);
		
		JLabel lblQuickSort = new JLabel("Quick Sort:");
		lblQuickSort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuickSort.setBounds(10, 569, 99, 23);
		frame.getContentPane().add(lblQuickSort);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 598, 349, 40);
		frame.getContentPane().add(scrollPane_6);
		
		JTextArea textArea_6 = new JTextArea();
		scrollPane_6.setViewportView(textArea_6);
		
		JLabel lblRunningTime = new JLabel("Running Time:");
		lblRunningTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRunningTime.setBounds(373, 174, 115, 17);
		frame.getContentPane().add(lblRunningTime);
		

		
	
		
		
		
		
	
		
		
	}
}
