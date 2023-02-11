package javaArrayPackage;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
         
	        // Please implement a Binary search that will display what index Mary is at
	        Arrays.sort(names);//sorting arrays
	        //declare element for searching
	        String name= "Mary";
	        System.out.println(name + " found at index = " + Arrays.binarySearch(names,name));
	          
	}

}
