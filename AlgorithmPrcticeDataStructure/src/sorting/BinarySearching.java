package sorting;

public class BinarySearching {
	
	int binarysearch(int arr[],int x) {
		int l=0,r=arr.length-1;
		while(l<=r){
			int m=l+(r-l)/2;
			if(arr[m]==x) {
			return m;	
			}
			
			if(arr[m]<x) {
				l=m+1;
			}
			else
				l=m-1;
			
		}
		return -1;
	}
	
	public static void main(String args[]) {
		BinarySearching bs = new BinarySearching();
		int arr[]= {1,2,4,5,6,7,8,9,10};
		int x= 9;
		int result = bs.binarysearch(arr, x);
		if(result==-1)
			System.out.println("Element not found in array");
		else 
			System.out.println("Element Found in array"+ result);
	}
	
	

}



/*Complexity Analysis of Binary Search:
Time Complexity: 
Best Case: O(1)
Average Case: O(log N)
Worst Case: O(log N)
Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).

Advantages of Binary Search:
Binary search is faster than linear search, especially for large arrays.
More efficient than other searching algorithms with a similar time complexity, such as interpolation search or exponential search.
Binary search is well-suited for searching large datasets that are stored in external memory, such as on a hard drive or in the cloud.


Drawbacks of Binary Search:
The array should be sorted.
Binary search requires that the data structure being searched be stored in contiguous memory locations. 
Binary search requires that the elements of the array be comparable, meaning that they must be able to be ordered.

Applications of Binary Search:
Binary search can be used as a building block for more complex algorithms used in machine learning, such as algorithms for training neural networks or finding the optimal hyperparameters for a model.
It can be used for searching in computer graphics such as algorithms for ray tracing or texture mapping.
It can be used for searching a database.
*/
