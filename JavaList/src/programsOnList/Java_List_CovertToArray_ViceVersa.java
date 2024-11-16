package programsOnList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_List_CovertToArray_ViceVersa {
public static void main(String[] args) {
ArrayList<String> languages = new ArrayList<String>();
languages.add("English");
languages.add("Hindi");
languages.add("Tamil");
languages.add("Kannada");

System.out.println("ArrayList" + " "+ languages); 

//create a new array of type string 
String [] arr= new String[languages.size()];


//convert arrayList into string array
languages.toArray(arr);
System.out.print("Array : ");
for(String item : arr)
{
	System.out.print(item + ", ");
	}	




//converting array to list 
String [] array = {"java" , "javascript" , "python"};
System.out.println("Array is: " + Arrays.toString(array));

List<String> languages1 = new ArrayList<>(Arrays.asList(array));
System.out.println(languages1);



}
}
