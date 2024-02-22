package sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<String> name = new HashSet();
		name.add("shubham");
		name.add("kaustubh");
		name.add("ruman");
		
		String s="asyyudyuasydagsyudyasd";
		char[] ch = s.toCharArray();
		
	String[] sh = {"asda","adad","adasd"};
	
	Iterator<String> it=	name.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		//name.forEach(System.out::println);
		
	
	List<Integer> number= new ArrayList<>();
	number.add(12);
	number.add(12);
	number.add(23);
	
	Set<Integer> numbset= new HashSet<Integer>(number);
	//numbset.addAll(number);
	System.out.println(numbset);
	
	}

	
}
