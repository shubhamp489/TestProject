package sorting;

public class BinarySearchSring {
	
	
	static int binarySeearch(String[] arr,String x) {
		int l=0, r= arr.length-1;
		
		while(l<=r) {
		
			int m = l + (r-l)/2;
			int res=x.compareTo(arr[m]);
			if(res==0)
				return m;
			if(res>0)
				l=m+1;
			else
				r=m-1;
			
		}
	
	return -1;
	}
	public static void main(String args[]) {
		BinarySearchSring obj = new BinarySearchSring();
		String[] arr = { "contribute", "geeks", "ide", "practice" };
		String x = "ide";
		int res =obj.binarySeearch(arr, x);
		if(res==-1)
			System.out.println("String not found");
		else
			System.out.println("String found"+"---" +"Index of string is"+res +"--" +"String search"+"---"+arr[res]);
    
    
	}
	

}




/*Time Complexity: O(log(n) * len), where n = no. of string in arr & len = max length of the string for comparing two strings we need O(len) time
Auxiliary Space: O(1)*/
