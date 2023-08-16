package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinklistDemo {

	public static void main(String[] args) {
		
			//Creating a List of type String using ArrayList  
			List<String> list=new ArrayList<String>();  
		  
			//Creating a List of type Integer using ArrayList  
			List<Integer> list1=new ArrayList<Integer>();  
		  
			//Creating a List of type Book using ArrayList  
			//List<Book> list1=new ArrayList<Book>();  
		  
			//Creating a List of type String using LinkedList  
			List<String> list2=new LinkedList<String>();  
		
			
			
			list.add("Shubham");
			list.add("Ruman");
			list.add("koko");
			list.add("Aman");
			for(String name :list) {
				System.out.println(name);
			}
			//Converting array to list   
			String[] array = {"Java","Python","PHP","C++"};
			System.out.println("Printing Arrays"+Arrays.toString(array));
			for(String lang :array) {
				list.add(lang);
			}
			System.out.println("Printing List"+ list);	
			
			//converting list to array 
			List <String> fruitList = new ArrayList<>();
			fruitList.add("Mango");
			fruitList.add("banana");
			fruitList.add("Apple");
			fruitList.add("Strawberry");
			 //Converting ArrayList to Array
			String[] array1 = fruitList.toArray(new String[fruitList.size()] );
			
			System.out.println("Printing Array" + Arrays.toString(array1));
			System.out.println("Printing List" + fruitList);
			
	}

}
