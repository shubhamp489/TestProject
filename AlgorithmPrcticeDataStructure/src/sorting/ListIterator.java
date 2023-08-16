package sorting;

import java.util.*;  
public class ListIterator {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); 
		list.add("Shubham");
		list.add("KOKO");
		list.add("Ruman");
		list.add("Aman");
		
		java.util.ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			 System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
		}
		
		
		System.out.println("-----------------=========---------------------");
		
		
		 while(itr.hasPrevious()){    
	          
		        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
		        }    
		
	}

}
