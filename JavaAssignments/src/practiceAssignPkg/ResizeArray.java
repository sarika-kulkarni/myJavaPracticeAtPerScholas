package practiceAssignPkg;

import java.util.Arrays;

public class ResizeArray {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
/* write a method using what we have learned this morning
that will resize (increase) an array during program execution.
something like...
    resizedArray = increaseArraySize(srcArray(num_elements_to_add));
~
white_check_mark*/
		int[] array = new int[4];
	      int[] array2 = Arrays.copyOf(array, 5);
	     System.out.println(array2.length);
	     System.out.println(Arrays.toString(array2));
	}

}
