package hasMapMethods;

import java.util.HashMap;

public class JavaHashMap_containsKey {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		map.put("Nitish", 2);
		map.put("Kumar", 2);
		map.put("Nitish", 2);
		System.out.println("is key 'Nitish' present ?" +" "+ map.containsKey("Nitish"));
	}
}

//===================================
//containsKey()
//===================================
//a key  must be provided , it'll return true or false if the key exists
//even if there are multiple keys with same value in it , it'll return true
//parameter is key 
