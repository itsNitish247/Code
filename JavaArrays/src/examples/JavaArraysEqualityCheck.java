package examples;

import java.util.Arrays;

public class JavaArraysEqualityCheck {
	
	//normal method
	public static boolean Compare(int a[] ,int b[]) {
		if(a.length == b.length) {
			return false;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i] !=b[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	//in-built methods
	
	
	
	
	
	public static void main(String[] args) {
		int a[]= {1,34,324,4342};
		int b[]= {1,34,233,232};
		
		
		boolean isEqual = Arrays.equals(a, b);
		System.out.println("is the arrays a and b equal : " + " " + isEqual);
		
		System.out.println("is the  arrays a and b  euqal : " + " " +Compare(a, b) );
	}
	
	
}
