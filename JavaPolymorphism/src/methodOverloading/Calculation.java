package methodOverloading;

public class Calculation {
	static int Multiply(int a , int b) {
		return a*b;
	}

	static double  Multiply(double a , double b ) {
		return a*b;
	}
	
//	parameters are different 
//	static  int Multiply(int x, int y) {
//		return x*y;
//	}
	
//	return type is same 
//	static int Multiply(int a , int b) {
//		return a*b;
//	}
}


//you cannot use the same method name when the return type is same , even if parameters are different 

