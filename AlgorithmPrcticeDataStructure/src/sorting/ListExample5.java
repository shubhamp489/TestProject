package sorting;

import java.util.ArrayList;
import java.util.List;

public class ListExample5 {  
	public static void main(String[] args) {  
	    //Creating list of Books  
	    List<BookObject> list=new ArrayList<BookObject>();  
	    //Creating Books  
	    BookObject b1=new BookObject(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    BookObject b2=new BookObject(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
	    BookObject b3=new BookObject(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(BookObject b:list){ 
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  }
}