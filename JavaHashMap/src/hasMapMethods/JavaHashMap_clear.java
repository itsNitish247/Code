package hasMapMethods;

import java.util.HashMap;

public class JavaHashMap_clear {
	public static void main(String[] args) {
		HashMap<Integer , String > map= new HashMap<>();
		map.put(1, "geeks");
		map.put(2,"welcomes");
		map.put(2, "welcomes");

		System.out.println("before using clear() the map looks this " +map);

		map.clear();

		System.out.println("after using clear() the map looks like this " + map);
	}
}

//============
//clear()
//============
//return type is void 