package javaIterationsPackage;
//Program to find the sum of natural numbers from 1 to 1000.
public class LoopSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	    int n = 1000;
	    // for loop
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	    System.out.println("Sum = " + sum);
	  

	}

}
