package Maybe;

import java.util.Scanner;
import java.lang.Math;

public class Driver {
	
	public static int[] arr1;
	public static int[] arr2;
	public static int choice = 1;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		while (choice != 0){
			System.out.print("Please enter size of array to test(20, 100, 500, 1000, 10000) or 0 to quit > ");
			choice = in.nextInt();
			System.out.println();
			switch (choice){
				case 20 : arr1 = new int[20];
							createArray();
							break;
				case 100 : arr1 = new int[100];
							createArray();
							break;
				case 500 : arr1 = new int[500];
							createArray();
							break;
				case 1000 : arr1 = new int[1000];
							createArray();
							break;
				case 10000 : arr1 = new int[10000];
							createArray();
							break;
				case 0 : System.out.println("thanks, bye");
							System.out.println();
							break;
				default : System.out.println("Invalid option, try again");
							System.out.println();
			}
		}
	}
	
	public static void createArray(){
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = new Integer ((int) (Math.random() * choice));
		}
		arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		long startTime = System.currentTimeMillis();
		selectionSort();
		long finishTime = System.currentTimeMillis();
		System.out.println("the time in milliseconds to sort " + choice + " items using selection sort is " + (finishTime - startTime));
		
		printArrays();
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		startTime = System.currentTimeMillis();
		bubbleSort();
		finishTime = System.currentTimeMillis();
		System.out.println("the time in milliseconds to sort " + choice + " items using bubble sort is " + (finishTime - startTime));
		
		printArrays();
		System.out.println();
	}
	
	public static void printArrays(){
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void selectionSort(){
		int i, j;
		for(j = 0; j < arr2.length-1; j++){
			int min = j;
			for(i = j+1; i < arr2.length; i++){
				if(arr2[i] < arr2[min]){
					min = i;
				}
			}
			if(min != j){
				int temp = arr2[j];
				arr2[j] = arr2[min];
				arr2[min] = temp;
			}
		}
	}
	
	public static void bubbleSort(){
		int n = arr2.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++){
			for(int j = 1; j < (n-i); j++){
				if(arr2[j-1] > arr2[j]){
					temp = arr2[j-1];
					arr2[j-1] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
	}
}
