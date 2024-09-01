package hasMapMethods;

import java.util.HashMap;

public class JavaHashMap_containsValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "geeks");
		map.put(2,"welcomes");
		map.put(2, "welcomes");
		System.out.println("is the value 'welcomes' present?" +  map.containsValue("welcomes"));
	}
}

//======================
//containsValue()
//=====================
//even if there are 2 values of with same keys present it'll return true
//parameter is value
