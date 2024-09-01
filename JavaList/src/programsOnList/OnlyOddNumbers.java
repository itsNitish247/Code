package programsOnList;

import java.util.LinkedList;
import java.util.List;

public class OnlyOddNumbers {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		System.out.println("items in list " + list);
		System.out.println(onlyOddNumbers(list));
	}

	public static boolean onlyOddNumbers(List<Integer> list) {
		
		for(int i:list) {
			if(i % 2 == 0) {
				return false;
			}
		}
		return true;
		
	}
}