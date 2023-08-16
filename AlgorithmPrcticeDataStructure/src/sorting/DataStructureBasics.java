package sorting;

import java.util.Scanner;

public class DataStructureBasics {
	
	public static void main(String args[]) {
	int arr[][] = new int[3][3];
	Scanner sc = new Scanner(System.in);
	
	// Taking input from user 
	for(int a =0 ;a <3 ; a++) {
		for(int b = 0; b <3;b++) {
			System.out.print("Enter the 2 D Array ");
			arr[a][b]=sc.nextInt();
			
		}
		
	}
	
	
	//Printing input from array 
	for(int a =0; a<3; a++) {
		for(int b=0;b<3;b++) {
			System.out.println("Printing 2 - D array ");
			System.out.println(arr[a][b] +"\t");
		}
	}
	
	}
}
