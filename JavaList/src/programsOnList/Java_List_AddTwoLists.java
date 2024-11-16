package programsOnList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.ListUtils;

public class Java_List_AddTwoLists {
public static void main(String[] args) {
	List<String> l1= new ArrayList<String>();
	l1.add("a");
	
	List<String> l2= new ArrayList<String>();
	l2.add("b");
	
	List<String> joinedUsing_addAll = new ArrayList<String>();
	joinedUsing_addAll.addAll(l1);
	joinedUsing_addAll.addAll(l2);
	
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(joinedUsing_addAll);
	
	
	//using union()
	//ListUtils is external jar
	System.out.println("--------------------------");
	List<String> list1= new ArrayList<String>();
	
	list1.add("mango");
	
	List<String> list2= new ArrayList<String>();
	list2.add("apple");
	
	List<String> joinedUsingUnion= ListUtils.union(list1, list2);
	
	System.out.println(joinedUsingUnion);
	
	
	//using Stream 
	System.out.println("-------------------------");
	List<String> l3 = new ArrayList<String>();
	 l3.add("ninja");
	 
	 List<String> l4 = new ArrayList<String>();
	 l4.add("hatori");
	 
	 List<String> joinedUsingStream= Stream.concat(l3.stream(), l4.stream())
	.collect(Collectors.toList());
	 
	 System.out.println(joinedUsingStream);
}
}
