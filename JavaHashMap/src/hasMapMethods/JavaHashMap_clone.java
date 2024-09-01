package hasMapMethods;

import java.util.HashMap;

public class JavaHashMap_clone {
public static void main(String[] args) {
	HashMap<Integer , String> map = new HashMap<>();
	map.put(1, "geeks");
	map.put(2,"welcomes");
	map.put(2, "welcomes");
	
	System.out.println("before using clone()" + " " +map);
	
	System.out.println("after using clone ()" + " " +map.clone());
	
	
//	HashMap copy =  (HashMap) map.clone();
//	can also be written like that but , it is not type safe , means it defaults to to raw type HashMap , 
//	might produce errors at runtime  , so we have to provide generic types eg:<Integer , String > etc
	
	  HashMap<Integer, String> copy = (HashMap<Integer, String>) map.clone();
//	so here even if there is any error it'll catch the error at compile time by just providing generic types
	System.out.println("clone stored in an variable " + " "+copy);
}
}

//=============
//clone();
//=============
//return type is object 
