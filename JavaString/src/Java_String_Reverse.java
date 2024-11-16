
public class Java_String_Reverse {
	
	public static void main(String[] args) {
		String name = "DragonballSuper";
		
		StringBuilder nameChange= new StringBuilder();
		nameChange.append(name);
		nameChange.reverse();
		System.out.println(nameChange);
	}

}
