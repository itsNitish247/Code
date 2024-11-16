package programsOnList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java_List_MergeTwoLists {
public static void main(String[] args) {
	List<Integer> prime = new ArrayList<Integer>();
	prime.add(2);
	prime.add(3);
	prime.add(5);
	prime.add(7);
	System.out.println("First List" + prime);
	
	List<Integer> even = new ArrayList<Integer>();
	even.add(2);
	even.add(4);
	even.add(6);
	System.out.println("Second List" + even);
	
	
	List<Integer> joined_even_and_odd = new ArrayList<Integer>();
	joined_even_and_odd.addAll(even);
	joined_even_and_odd.addAll(prime);
	
	System.out.println(joined_even_and_odd);
	
	
	
	//Merging using streams
	System.out.println("------------------------------------");
	System.out.println("merging using streams");
	
	
	//converting list to stream
	Stream<Integer> list1 = prime.stream();
	Stream<Integer> list2= prime.stream();
	
	 
	//merges two streams
	Stream<Integer> mergeUsingStreams = Stream.concat(list1, list2);
	
	
//	converting back to list 
	List<Integer> convertingBackToList = mergeUsingStreams.collect(Collectors.toList());
	System.out.println(convertingBackToList);
	
 
	
}
}
