package exceptionHandlingPkg;

public class NullPtrExcept2 {
	// A Java program to demonstrate that we should
	// check if parameters are null or not before
	// using them.

	// WHAT YOU NEED to do:

	// Please write a static  method called getLength(s)  to return length of string s. It throws
	// IllegalArgumentException if s is null.
	public static void main(String[] args) {
		 // String s set an empty string and calling getLength()
        String s = "";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }
    }
	
	// Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
	private static int getLength(String s) {
				if (s==null) {
					throw new IllegalArgumentException("input is null");
				}
				return s.length();
	}
	}


