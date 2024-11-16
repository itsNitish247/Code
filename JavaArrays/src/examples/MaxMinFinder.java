package examples;

public class MaxMinFinder {


	public static int minFinder(int []A , int N ) {
		int Min = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			if(A[i]< Min) {
				Min = A[i];
			}
		}
		return Min;
	}


	public static int maxFinder(int []A, int N ) {
		int Max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(A[i]>Max) {
				Max=A[i];
			}	
		}
		return Max;
	}



	public static void main(String[] args) {
		int []A= {1,24,414,53};
		int N=A.length;
		System.out.println("Max element" + " " + maxFinder(A, N));
		System.out.println("Min element" + " " + minFinder(A, N));
	}		
}









