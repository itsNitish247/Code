package hashMap;

import java.util.HashMap;

public class JavaHashMap {
	public static void main(String[] args) {
		
		HashMap<Integer ,String> map = new HashMap<Integer , String>();
		
		map.put(1, "geeks");
		map.put(2,"welcomes");
		map.put(3, "2");

		System.out.println("the mappings are" + map);
		
	}
}


//========================================================================
//Note
//========================================================================
//if the key values are same it'll print the latest value to that key

